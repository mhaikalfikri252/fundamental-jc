package com.juaracoding.springbootjunit2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/about")
	public String aboutMe() {
		
		return "JUnit and Springboot URL";
		
	}
	
}
