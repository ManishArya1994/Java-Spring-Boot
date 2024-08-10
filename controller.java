package com.app.manish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class controller {

	@GetMapping("/first")
	public String show() {
		return "Hello this is My first Application";
		
		
	}
	
}
