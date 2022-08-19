package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping
	public String getMsg() {
		return "Hi I am Khuddus from LTI this is for docker and jenkins integration";
	}
}
