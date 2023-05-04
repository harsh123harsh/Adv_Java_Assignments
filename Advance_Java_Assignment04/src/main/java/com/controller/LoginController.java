package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.entitites.Credentials;
import com.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping(path = "/processForm",method = RequestMethod.POST)
	public String handleLoginForm(@ModelAttribute Credentials user,Model model) {
		System.out.println(user);
		if(!userService.validateUser(user)) {
			model.addAttribute("msg", "Username and password doesn't exist please register");
			return "register";
		}else {
			model.addAttribute("msg","Successfully logged in");
			return "welcome";
		}
		
	}

	
	@RequestMapping(path="/fillform",method = RequestMethod.POST)
	public String handleRegisterForm(@ModelAttribute Credentials user, Model model) {
		
	     this.userService.createUser(user);
	    model.addAttribute("msg", "Successfully registerd");
		return "welcome";
	}
	
}
