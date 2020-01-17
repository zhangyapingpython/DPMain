package hnu.mn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hnu.mn.pojo.SysUser;
import hnu.mn.service.UserLoginService;

@Controller
public class UserLoginController {
	@Resource
	UserLoginService userLoginServiceImpl;

	// 登录
	@RequestMapping("login")
	public String login(String userAccount, String userPassword, HttpSession session) {
		// 直接访问 80：login
		System.out.println("aaaa" + userAccount + userPassword);
		if (userAccount == null || userPassword == null) {
			// System.out.println("没有数据直接跳转登陆页面");
			return "redirect:/login.jsp";
		}
		// 将前端数据传递给getFormUser (userAccount,password)
		SysUser getUserFromWeb = new SysUser();
		getUserFromWeb.setUserAccount(userAccount);
		getUserFromWeb.setUserPassword(userPassword);

		// System.out.println("login来的 "+getFormUser);
		SysUser loginUser = userLoginServiceImpl.userLogin(getUserFromWeb);
		System.out.println("登陆的用户" + loginUser);

		if (loginUser != null) {
			if (loginUser.getSysRole().getRoleName().equals("管理员")) {
				session.setAttribute("loginUser", loginUser);
				return "main";
			}

			// 说明有这个用户 接下来要存储信息好取，登陆成功
			session.setAttribute("loginUser", loginUser);
			// 这是转发，改的
			return "main";
		} else {
			// 这是重定向

			return "redirect:/login.jsp";
		}
	}

}
