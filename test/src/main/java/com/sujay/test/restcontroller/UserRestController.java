package com.sujay.test.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sujay.test.model.User;
import com.sujay.test.service.UserServiceImpl;

@RestController
@RequestMapping("/api/user")
public class UserRestController {
	
	private @Autowired UserServiceImpl userService;
	
	@PostMapping("/createUser")
	public @ResponseBody User createUser(@RequestBody User user) {
		
		System.out.println("135 "+user.getEmail());
		System.out.println("**** "+user.getName());
		
		userService.createUser(user);
		
		User user2 = new User();
		user2.setName("Manju");
		user2.setEmail("manju@gmail.com");
		return user2;
	}
	
	@GetMapping(path="/a", produces = "application/json")
	public void getEmployees()
	{
	    System.out.println("*********Reached******"+"localhost:8080/a");
	}

}
