package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
	 @Test
	    public void givenLastName_WhenProper_ShouldReturn_True() {
	        UserValidater userValidater = new UserValidater();
	        boolean result = userValidater.validateLastName("Kawale");
	        Assert.assertEquals(true,result);
	    }
	    @Test
	    public void givenLastName_WhenNotProper_ShouldReturn_False() {
	        UserValidater userValidater = new UserValidater();
	        boolean result = userValidater.validateLastName("Ka");
	        Assert.assertEquals(false,result);
	    }
	}