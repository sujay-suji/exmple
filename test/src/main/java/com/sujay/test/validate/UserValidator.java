package com.sujay.test.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.sujay.test.model.User;

@Component
public class UserValidator {
	
	public String userValidator(User user,Errors err) {
		
		ValidationUtils.rejectIfEmpty(err, "name", "Name Should not Empty");
		ValidationUtils.rejectIfEmpty(err, "email", "Email Should not Empty");
		
		
		String error="false";
		
		String nameFormat="^[a-zA-Z]+$";
		
		String contactValidation="[a-zA-Z]";
		
		String emailFormat="[a-zA-Z0-9\\.]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,5}$";
		
		String passwordFormat="[a-zA-Z0-9]{6,15}";
		
		String contactFormat="[0-9]{10}";
		
		if(user.getName()==""|| user.getName()==null)
		{
			error="Name can't be empty.";
			return error;
		}
		/*
		 * else if(user.getMobile() ) { error="Mobile number is required"; return false;
		 * }
		 */
		else if(user.getEmail()=="" || user.getEmail()==null)
		{
			error="Email cannot be empty, Please enter the email.";
			return error;
		}else if(!user.getName().matches(nameFormat))
		{
			error="Name should contains only alphabetics.";
			return error;
		}
		else if(!user.getEmail().matches(emailFormat))
		{
			error="Please enter the valid email.";
			return error;
		}
		
		return null;
	}
	
	

}
