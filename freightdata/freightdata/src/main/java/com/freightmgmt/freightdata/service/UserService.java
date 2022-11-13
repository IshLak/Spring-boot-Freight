package com.freightmgmt.freightdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freightmgmt.freightdata.entity.UserEntity;
import com.freightmgmt.freightdata.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public UserEntity addUser(UserEntity user) {
		return repository.save(user);
	}
	
	public List<UserEntity> getAllUsers(){
		return repository.findAll();
	}

}
