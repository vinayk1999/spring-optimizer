package com.k8s.demo;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	@RequestMapping("/")
	public String wel()
	{
		return "Welcome";
	}

}
