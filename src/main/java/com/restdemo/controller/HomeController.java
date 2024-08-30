package com.restdemo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HomeController {

	@GetMapping("/add")
	public int addmark(@RequestParam("a") int op1, @RequestParam("b") int op2) {
		return op1 + op2;

	}

	@GetMapping("/sub")
	public int sub(@RequestParam("a") int op1, @RequestParam("b") int op2) {
		return op1 - op2;
	}

	@GetMapping("/div")
	public int div(@RequestParam("a") int op1, @RequestParam("b") int op2) {
		return op1 / op2;
	}

	@GetMapping("/multi")
	public int multi(@RequestParam("a") int op1, @RequestParam("b") int op2) {
		return op1 * op2;

	}
    //path variable example
	
	@GetMapping("/mult/{a}/{b}")
	public int mult(@PathVariable("a") int op1, @PathVariable("b") int op2) {
		return op1 * op2;

	}
	@GetMapping("/add/{a}/{b}")
	public int add(@PathVariable("a") int op1, @PathVariable("b") int op2) {
		return op1+op2;
	}
	@PostMapping("/save")
	public String saveuserdata(@RequestBody com.restdemo.dto.users users) {
		if(users.getUsername().equals("ronaldo")) {
			
        return "valid user";
        
		}
		return "invalid user";
	}
}
