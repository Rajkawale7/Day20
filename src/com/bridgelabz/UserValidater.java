package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidater {
		private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    	Pattern pattern = Pattern.compile(NAME_PATTERN);
    	public boolean validateLastName(String lastName) {
        return pattern.matcher(lastName).matches();
    }
}
