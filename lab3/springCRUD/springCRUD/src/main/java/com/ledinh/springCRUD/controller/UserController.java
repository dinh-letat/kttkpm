package com.ledinh.springCRUD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class UserController {
	@GetMapping("/")
	public String user() {
		
		return "user";
	}
}
