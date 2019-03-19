package com.sujay.test.controller;

import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sujay.test.clientService.UserClientService;
import com.sujay.test.model.User;
import com.sujay.test.service.UserServiceImpl;
import com.sujay.test.validate.UserValidator;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	
	
	private @Autowired UserValidator uservalidate;
	private @Autowired UserClientService clientService;

	@GetMapping("/getName")
	public void getHome() throws URISyntaxException {
		System.out.println("***** AJJAYYA *****");
		clientService.getMethod();
		//return "Suji";
	}
	
	@PostMapping("/create")
	public String createUser(@RequestBody User user, HttpServletRequest request,BindingResult bindingResult) throws Exception {
		
		String errMsg = uservalidate.userValidator(user,bindingResult);
		
		System.out.println("*** Name "+user.getName());
		System.out.println("*** Email "+user.getEmail());
		//System.out.println("*** Mobile "+user.getMobile());
		
		/*
		 * if(errMsg!=null) { System.out.println("Should not go to service class");
		 * return errMsg; }
		 */
		
		if(bindingResult.hasErrors()) {
			return "Validation Done";
			
		}
		
		
		User user2=clientService.createUser(user);
		System.out.println("#$^&&57654536         "+user2.getEmail());
		
		return "Success";
	}
	

}
