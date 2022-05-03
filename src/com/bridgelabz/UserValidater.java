package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidater {
		private static final String EMAIL_PATTERN = "^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
		public boolean validateEmail(String email) {
	        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	        return pattern.matcher(email).matches();
    }
}
