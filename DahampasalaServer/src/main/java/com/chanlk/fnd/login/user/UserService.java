package com.chanlk.fnd.login.user;

import java.util.Map;
import java.util.Optional;

import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import com.chanlk.fnd.exceptions.UserAlreadyExistAuthenticationException;
import com.chanlk.fnd.login.user.dto.LocalUser;
import com.chanlk.fnd.login.user.dto.SignUpRequest;

public interface UserService {
	public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;

	User findUserByEmail(String email);

	Optional<User> findUserById(Long id);

	LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken,
			OidcUserInfo userInfo);

}
