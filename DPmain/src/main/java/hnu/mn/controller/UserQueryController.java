package hnu.mn.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import hnu.mn.pojo.ReturnToWeb;
import hnu.mn.pojo.SysPermission;
import hnu.mn.pojo.SysUser;
import hnu.mn.service.UserQuerySerrvice;
import hnu.mn.szDP.Lap;
import hnu.mn.szParse.MySQLData;
import hnu.mn.szParse.ParseMySQL;
import hnu.mn.szParse.ParsePermission;

@Controller
public class UserQueryController {
	@Resource
	UserQuerySerrvice userQueryServiceImpl;

	// 首先获得用户，获得用户查询条件，
	// ajax
	@RequestMapping("sqlQuery")
	@ResponseBody
	public ReturnToWeb query(String sqlString, HttpSession session) throws IOException {
		SysUser loginUser = (SysUser) session.getAttribute("loginUser");
		System.out.println("进入query" + sqlString + "  --  " + loginUser);
		// 查询之前先进行权限校验 表名!字段@表名!字段
		List<SysPermission> sysPermission = loginUser.getSysRole().getSysPermission();
		// 目前一个角色只分配一个权限
		SysPermission personPermission = sysPermission.get(0);
		// 要除以100，epsilon
		double permissionBudget = personPermission.getPermissionBudget();
		// 查询次数
		int permissionFrequency = personPermission.getPermissionFrequency();
		// 查询时间,秒
		int permissionTime = personPermission.getPermissionTime();
		// 查询涉及的字段
		String permissionData = personPermission.getPermissionData();

		// 对字段进行解析
		List<MySQLData> parseMyPermission = ParsePermission.parseMyPermission(permissionData);

		// 对SQL解析
		MySQLData parseMySQL = ParseMySQL.parseMySQL(sqlString);

		System.out.println("数据库  " + parseMyPermission);
		System.out.println("SQL  " + parseMySQL);
		// 判断字段是否匹配
		boolean flag = false;
		for (MySQLData mySQLData : parseMyPermission) {
			if (mySQLData.getDataTable().equals(parseMySQL.getDataTable())
					&& mySQLData.getDataCol().equals(parseMySQL.getDataCol())) {
				System.out.println("匹配成功");
				flag = true;
			}
		}

		if (!flag) {
			System.out.println("权限不对");
			ReturnToWeb returnToWeb = new ReturnToWeb();
			returnToWeb.setRight("权限不对");
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.writeValueAsString(returnToWeb);
			return returnToWeb;
		}

		// 查询结果
		try {
			System.out.println("权限对了");

			// 接下来进行加噪
			List<Map> mylist = userQueryServiceImpl.userQuery(sqlString);
			String result = "";
			for (int i = 0, j = mylist.size(); i < j; i++) {
				Map map = mylist.get(i);
				for (Object key : map.keySet()) {
					String value = map.get(key).toString();
					System.out.println(key + "  " + value);
					result = value;
				}
			}

			// 对汇总函数进行判断
			double realResult = Double.parseDouble(result);
			double noiseResult = -1;
			if (parseMySQL.getDataQuery().equals("count")) {
				noiseResult = Lap.laplaceMechanismCount(realResult, permissionBudget / 100);
			} else if (parseMySQL.getDataQuery().equals("max") || parseMySQL.getDataQuery().equals("min")) {
				noiseResult = Lap.laplaceMechanismCount(realResult, realResult, permissionBudget / 100);
			} else if (parseMySQL.getDataQuery().equals("sum")) {
				// sum avg 改为max
				String toUpdate = sqlString.replaceAll("sum", "max");
				System.out.println("更新后的SQL   " + toUpdate);
				List<Map> userQuery = userQueryServiceImpl.userQuery(toUpdate);
				String result1 = "";
				for (int i = 0, j = mylist.size(); i < j; i++) {
					Map map = mylist.get(i);
					for (Object key : map.keySet()) {
						String value = map.get(key).toString();
						System.out.println(key + "  " + value);
						result1 = value;
					}
				}

				double parseDouble = Double.parseDouble(result1);
				noiseResult = Lap.laplaceMechanismCount(realResult, parseDouble, permissionBudget);
			} else if (parseMySQL.getDataQuery().equals("avg")) {

			} else {

			}

			ReturnToWeb returnToWeb = new ReturnToWeb();
			returnToWeb.setRight(noiseResult + "");

			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.writeValueAsString(returnToWeb);
			return returnToWeb;

		} catch (Exception e) {
			System.out.println("请确定你的sql是否正确");
		}

		ReturnToWeb returnToWeb = new ReturnToWeb();
		returnToWeb.setRight("ss");

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValueAsString(returnToWeb);
		return returnToWeb;

	}
}
