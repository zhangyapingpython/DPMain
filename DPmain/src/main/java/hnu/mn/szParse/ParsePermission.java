package hnu.mn.szParse;

import java.util.ArrayList;
import java.util.List;

public class ParsePermission {
	// 做权限的解析 String permissionString = "data_emp!empAge@data_emp!empMoney";
	public static List<MySQLData> parseMyPermission(String permissionData) {
		List<MySQLData> list = new ArrayList<MySQLData>();
		String[] split = permissionData.split("@");
		for (int i = 0; i < split.length; i++) {
			MySQLData mySQLData = new MySQLData();
			// System.out.println(split[i]);
			String tempString = split[i];
			String[] split2 = tempString.split("!");
			mySQLData.setDataTable(split2[0]);
			mySQLData.setDataCol(split2[1]);
			list.add(mySQLData);
		}
		return list;

	}
}
