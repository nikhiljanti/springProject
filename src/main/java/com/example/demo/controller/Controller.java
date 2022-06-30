package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/path/{name}")
	@ResponseBody
	public String showData(@PathVariable("name") String name){
		return "Hi "+name + "!Namaste";
	}

}
