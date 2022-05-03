package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
	@Test
    public void givenPhone_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePhone("919049331047");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhone_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePhone("9049331047");
        Assert.assertEquals(false,result);
    }
}