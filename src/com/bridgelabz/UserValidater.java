package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidater {
		private static final String PASSWORD_PATTERN = "[a-zA-Z0-9](?=.*[A-Z]).{8,40}";
		public boolean validatePassword(String password) {
	    Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
	    return pattern.matcher(password).matches();
    }
}
