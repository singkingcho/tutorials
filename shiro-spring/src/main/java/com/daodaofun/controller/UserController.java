package com.daodaofun.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daodaofun.model.User;

@Controller
@RequestMapping("/user")
public class UserController {


	
	@RequestMapping("/login")
	public String login(User user) {
		// 获取subject
		Subject currUser = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
		currUser.login(token);
		if(currUser.isAuthenticated())
		return "main";
		return "/";
	}
	
	
	@RequestMapping("/logout")
	public String logout() {
		// 登出擦操作如何处理
		Subject currUser = SecurityUtils.getSubject();
		currUser.logout();
		return "redirect:/";
	}
}
