package com.chanlk.fnd.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.chanlk.fnd.login.user.dto.SignUpRequest;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, SignUpRequest> {

	@Override
	public boolean isValid(SignUpRequest user, ConstraintValidatorContext context) {
		return user.getPassword().equals(user.getMatchingPassword());
	}

}
