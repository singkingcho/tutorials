package com.daodaofun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daodaofun.model.User;

@Controller
@RequestMapping("/user")
public class UserController {


	
	@RequestMapping("/login")
	public String login(User user) {
		System.out.println(user);
		return "main";
	}
}
