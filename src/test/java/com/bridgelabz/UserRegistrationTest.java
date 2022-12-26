package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    Boolean result;
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        result = UserRegistrationMain.isValidFirstName("Akash");

    }
    @Test
    public void givenFirstName_WhenImProper_ShouldReturnTrue() {
        try {
            UserRegistrationMain.isValidFirstName("akash1.23j");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        result = UserRegistrationMain.isValidLastName("Pakhare");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhenImProper_ShouldReturnInvalidMessage() {
        try {
            UserRegistrationMain.isValidLastName("Pakhare.1");
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperEmailShouldReturnTrue() {
        result = UserRegistrationMain.isValidEmail("akashpakhare499@gmail.co.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void  givenImProperEmailShouldReturnInvalidMessage() {
        try {
            UserRegistrationMain.isValidEmail("akashpakhare8.gmail.co.in1");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperPhoneNumberShouldReturnTure() {
        result = UserRegistrationMain.isValidPhoneNo("91 9423438559");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenimProperPhoneNumberShouldReturnInvalidMessage() {
        try {
            UserRegistrationMain.isValidPhoneNo("89 55655668");
        }catch (UserRegistrationException e){
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperPassword1ShouldReturnTrue() {
        result = UserRegistrationMain.isValidPassword1("akashpakhare");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenImProperPassword1ShouldReturnInvalidMessage() {
        try {
            UserRegistrationMain.isValidPassword1("Ap121");
        }catch (UserRegistrationException e){
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void password_IsValid_PassTest2() {
        result = UserRegistrationMain.isValidPassword2("Akashpakhare");

    }
    @Test
    public void password_IsValid_FailTest2() {
        try {
            UserRegistrationMain.isValidPassword2("akashpakhare1");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void password_IsValid_PassTest3() {
        result = UserRegistrationMain.isValidPassword3("Akashpakhare1");

    }
    @Test
    public void password_IsValid_FailTest3() {
        try {
            UserRegistrationMain.isValidPassword3("Akashpakhare");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    }
