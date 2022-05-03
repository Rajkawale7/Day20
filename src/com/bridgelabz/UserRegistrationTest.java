package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
	@Test
    public void givenPassword_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePassword("12345678");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePassword("121");
        Assert.assertEquals(false,result);
    }
}