package com.bae.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUtils {

	public static String getUser() {
		SecurityContext securityContext = SecurityContextHolder.getContext();
		Authentication auth = securityContext.getAuthentication();
		String user = null;

		if (null != auth) {
			if (auth.getPrincipal() instanceof UserDetails) {
				user = ((UserDetails) auth.getPrincipal()).getUsername();

			} else if (auth.getPrincipal() instanceof String) {
				user = (String) auth.getPrincipal();

			}

		}
		return user;
	}
}
