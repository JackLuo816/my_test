package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {
    @Autowired
	UserMapper usermapper;
	public String findUser(){
		return usermapper.findUser().toString();
	}
}
