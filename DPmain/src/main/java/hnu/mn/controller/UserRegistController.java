package hnu.mn.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserRegistController {

	@RequestMapping("regist")
	public String login(HttpSession session) {
		// 直接访问 80：login
		System.out.println("regist");
		return session.toString();
	}
}
