package com.fsh.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fsh.register.model.User;
import com.fsh.register.service.UserService;

@Controller
public class TestController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/showtest")
	public String test(Model model){
		User user = userService.getUserById(1);
		model.addAttribute("username", user.getUserName()) ;
		return "test" ;
	}
}
