package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidater {
	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
}
