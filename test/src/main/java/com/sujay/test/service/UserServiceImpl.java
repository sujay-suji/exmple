package com.sujay.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sujay.test.model.User;
import com.sujay.test.repositary.UserRepositary;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepositary userRepo;

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("***** Impl ****"+user.getEmail());
		
		//userRepo.save(user);
		@SuppressWarnings("unchecked")
		List<User> users=(List<User>) userRepo.saveAndFlush(user);
		
		if(users==null) {
			System.out.println("********** NULL");
		}
		
	}

	

}
