package com.freightmgmt.freightdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freightmgmt.freightdata.entity.UserEntity;
import com.freightmgmt.freightdata.service.UserService;

@CrossOrigin("*")
@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/saveUser")
	public UserEntity adduser(@RequestBody UserEntity user) {
		return service.addUser(user);
	}
	
	@GetMapping("/getAllUsers")
	public List<UserEntity> getAllUsers(){
		return service.getAllUsers();
	}
}
