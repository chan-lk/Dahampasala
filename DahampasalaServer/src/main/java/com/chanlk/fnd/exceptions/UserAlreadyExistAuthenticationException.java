package com.chanlk.fnd.exceptions;

import org.springframework.security.core.AuthenticationException;;

public class UserAlreadyExistAuthenticationException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4805224014679355876L;

	public UserAlreadyExistAuthenticationException(String msg) {
		super(msg);

	}

}
