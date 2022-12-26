package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    Boolean result;
    @Test
    public void givenLambdaExpressionShouldReturnTrue(){
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        result = UserRegistrationMain.isValidFirstName("Akash");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenImProper_ShouldReturnInvalidMessage() {
        try {
            UserRegistrationMain.isValidFirstName("akash12.3j");
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
    public void givenLastName_WhenImProper_ShouldReturnInvalidMesage() {
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
    public void givenImProperEmailShouldReturnInvalidMessage() {
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
    public void givenImProperPhoneNumberShouldReturnInvalidMessage() {
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
    public void givenImProperPassword1ShouldInvalidMessage() {
        try {
            UserRegistrationMain.isValidPassword1("Akash1");
        }catch (UserRegistrationException e){
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenProperPassword2ShouldReturnTrue() {
        result = UserRegistrationMain.isValidPassword2("Akashpakhare");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenImProperPassword2ShouldInvalidMessage() {
        try {
            UserRegistrationMain.isValidPassword1("akashpakhare1");
        }catch (UserRegistrationException e){
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenProperPassword3ShouldReturnTrue() {
        result = UserRegistrationMain.isValidPassword3("Akashpakhare1");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenImProperPassword3ShouldInvalidMessage() {
        try {
            UserRegistrationMain.isValidPassword3("Akash");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    }
