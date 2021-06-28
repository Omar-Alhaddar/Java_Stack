package com.example.LoginRegester.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.LoginRegester.models.User;

@Component
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
		
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		User user = (User) target;
		if (!user.getPassword().equals(user.getPasswordConfirmation())) {
			
			errors.rejectValue("passwordConfirmation", "Match");
		}
		
	}
	
	
	

	
	
}
