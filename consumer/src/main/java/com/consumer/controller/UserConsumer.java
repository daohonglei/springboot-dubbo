package com.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.api.service.UserService;

@RestController
public class UserConsumer{
	@Reference
	private UserService userService;
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return userService.sayHello(name);
	}
	
	@GetMapping("/getName/{name}")
	public String getName(@PathVariable String name) {
		return userService.getName(name);
	}
}
