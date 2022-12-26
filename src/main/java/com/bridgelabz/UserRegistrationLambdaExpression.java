package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserDetailsValidation {
    /**
     *Using Lambda function  to  check valid details or Invalid details
     */
    boolean userDetails(String regex, String details);
    static void result(UserDetailsValidation ref, String regex, String details) {
        if (ref.userDetails(regex, details)) {
            System.out.println(details+ " is Valid Detail");
        }
        else {
            System.out.println(details+ " is Invalid Detail");
        }
    }
}
public class UserRegistrationLambdaExpression {
    /**
     * This is Main method is used for lambda expression to implement above functional interface abstract method.
     */
    public static void main(String[] args) {

        UserDetailsValidation userdetails = (regex, details) -> Pattern.matches(regex,details);
        System.out.println("first Name: ");
        UserDetailsValidation.result(userdetails,"^[A-Z][a-zA-Z]{2,}$","Akash" );
        UserDetailsValidation.result(userdetails,"^[A-Z][a-zA-Z]{2,}$","Akash" );
        System.out.println("Last Name: ");
        UserDetailsValidation.result(userdetails,"^[A-Z][a-zA-Z]{2,}$","Pakhare" );
        UserDetailsValidation.result(userdetails,"^[A-Z][a-zA-Z]{2,}$","Pakhare.1" );
        System.out.println("Phone No: ");
        UserDetailsValidation.result(userdetails,"^[0-9]{1,2} \\d{10}$","91 9423438559" );
        UserDetailsValidation.result(userdetails,"^[0-9]{1,2} \\d{10}$","91 9476543" );
        System.out.println("Email Address: ");
        UserDetailsValidation.result(userdetails,"^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?","akashpakhare499@@gmail.com" );
        UserDetailsValidation.result(userdetails,"^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?","akash.pakhare@.gmail.com" );
        System.out.println("Password: ");
        UserDetailsValidation.result(userdetails,"^[A-Z][a-zA-Z1-9]{5,}[@$^][1-9]+$","Akash@123");
        UserDetailsValidation.result(userdetails,"^[A-Z][a-zA-Z1-9]{5,}[@$^][1-9]+$","akashpakhare");
    }
}
