package com.BikkadIT.RegistrationFormDemo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BikkadIT.RegistrationFormDemo.model.UserDemo;

@Controller
public class RegistrationControl {
	
	@GetMapping("/UserRegistor")
	public String UserRegistor() {
		
		return "userdata";
		
	}

	@GetMapping("/User")
	public String registor(UserDemo user, Model model) {
		
		System.out.println(user);
		model.addAttribute("USER",user);
		return "view";
		
	}
}
