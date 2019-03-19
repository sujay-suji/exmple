package com.sujay.test.service;

import org.springframework.stereotype.Service;

import com.sujay.test.model.User;

@Service
public interface UserService {
	
	public void createUser(User user);

}
