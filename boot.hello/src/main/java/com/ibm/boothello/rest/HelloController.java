package com.ibm.boothello.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Spring Boot";
	}
	@GetMapping(value="/hello",produces="text/html")
	public String sayHellohtml() {
		return "<h1> Hello Spring Boot</h1>";
	}
	
	@GetMapping(value="/hello",produces="application/json")
	public String sayHellojson() {
		return "{\"greeting\":Hello Spring boot\"}";
	}
	
	
	
	@GetMapping(value="/hola",produces="text/html")
	public String sayHola() {
		return "<h1> Hola Spring Boot</h1>";
	}
	
	
	@GetMapping(value="/bonjour",produces="application/json")
	public String sayBonjour() {
		return "{\"greeting\":Bonjour Spring boot\"}";
	}

}
