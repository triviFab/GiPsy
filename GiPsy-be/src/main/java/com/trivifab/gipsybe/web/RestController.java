package com.trivifab.gipsybe.web;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@RequestMapping("/hello") 
	public String greet() {

		  return "Hello from the other side!!!";

		 }
}
