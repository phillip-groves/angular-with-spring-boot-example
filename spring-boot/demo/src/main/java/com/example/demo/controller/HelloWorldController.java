package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private static final String HELLO_WORLD = "Hello World";
	
	@GetMapping(value = "/hello")
	public String getHelloWorld() {
		return HELLO_WORLD;
	}
}
