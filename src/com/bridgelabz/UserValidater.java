package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidater {
		private static final String PHONE_PATTERN = "^[0-9]{2}[0-9]{10}";
		public boolean validatePhone(String phone) {
		Pattern pattern = Pattern.compile(PHONE_PATTERN);
		return pattern.matcher(phone).matches();
    }
}
