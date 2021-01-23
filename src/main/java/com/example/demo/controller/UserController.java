package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService  userService;
	
	@RequestMapping("/hello")	
	public void hello() {
		System.out.println(userService.findUser().toString());
		//return userService.userFindByKey(testKey).toString();
	}


}
