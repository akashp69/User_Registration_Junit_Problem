package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    String result;
    @Test
    public void firstName_IsValid_PassTest() {
        result = UserRegistrationMain.isValidFirstName("Akash");
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void firstName_IsValid_FailTest() {
        result = UserRegistrationMain.isValidFirstName("Akash123a");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void lastName_IsValid_PassTest() {
        result = String.valueOf(UserRegistrationMain.isValidLastName("Pakhare"));
        Assert.assertEquals("Happy",result);
    }
    @Test
    public void lastName_IsValid_FailTest() {
        result = UserRegistrationMain.isValidLastName("Pakhare");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void Email_IsValid_PassTest() {
        result = UserRegistrationMain.isValidEmail("akashpakhare499@gmail.co.in");
        Assert.assertEquals("Happy",result);
    }

    @Test
    public void Email_IsValid_FailTest() {
        result = UserRegistrationMain.isValidEmail("akashpakhare499gmail.co.in");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void phoneNumber_isValidMobileNo() {
        result = UserRegistrationMain.isValidPhoneNo("91 9423438559");
        Assert.assertEquals("Happy",result);
    }

    @Test
    public void phoneNumber_IsValid_FailTest() {
        result = UserRegistrationMain.isValidPhoneNo("89 9423438559");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void password_IsValid_PassTest1() {
        result = UserRegistrationMain.isValidPassword1("akashpakhare");
        Assert.assertEquals("Happy",result);
    }
    @Test
    public void password_IsValid_FailTest1() {
        result = UserRegistrationMain.isValidPassword1("Akash121");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void password_IsValid_PassTest2() {
        result = UserRegistrationMain.isValidPassword2("Akashpakhare");
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void password_IsValid_FailTest2() {
        result = UserRegistrationMain.isValidPassword2("akashpakhare1");
        Assert.assertEquals("Sad", result);
    }
    @Test
    public void password_IsValid_PassTest3() {
        result = UserRegistrationMain.isValidPassword3("Akashpakhare1");
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void password_IsValid_FailTest3() {
        result = UserRegistrationMain.isValidPassword3("Akashpakhare");
        Assert.assertEquals("Sad", result);
    }
    @Test
    public void password_IsValid_PassTest4() {
        result = UserRegistrationMain.isValidPassword4("Akash@123");
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void password_IsValid_FailTest4() {
        result = UserRegistrationMain.isValidPassword4("Akash1234");
        Assert.assertEquals("Sad", result);
    }
}
