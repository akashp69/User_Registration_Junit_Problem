package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrationMain {
    public static String isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{2,}$");
    /**
     * Using Regex for to check valid username and compile the regex
	 *	Pattern class contains matcher() method to find matching between given username
     */
        if(pattern.matcher(firstName).matches()){
            return "Happy";
        }else
            return "Sad";
        /**
         * Return happy if the firstname matched the Regex
         * If firstname not matched the Regex then return sad
         */

    }
    /**
     * Using Regex pattern  for to check valid Lastname and compile the regex
     *	Pattern class contains matcher() method to find matching between given lastname
     */
    public static String isValidLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{2,}$");
        /**
         * Return happy if the Lastname matched the Regex pattern
         * If Lastname not matched the  Regex then  return sad
         */
        if(pattern.matcher(lastName).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    /**
     * Using Regex pattern  for to check valid Phone Number and compile the regex
     *	Pattern class contains matcher() method to find matching between given Phone Number
     */
    public static String isValidPhoneNo(String phoneNo) {
        Pattern pattern = Pattern.compile("^[0-9]{1,2} \\d{10}$");
        /**
         * Return happy if the Phone Number matched the Regex pattern
         * If Phone Number not matched the  Regex then  return sad
         */
        if(pattern.matcher(phoneNo).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    /**
     * Using Regex pattern  for to check valid Email Id and compile the regex
     *	Pattern class contains matcher() method to find matching between given Email Id
     */

    public static String isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        /**
         * Return happy if the Email id  matched the Regex pattern
         * If Email id not matched the  Regex then  return sad
         */
        if(pattern.matcher(email).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    /**
     * Using Regex pattern  for to check valid Password and compile the regex
     *	Pattern class contains matcher() method to find matching between given Password
     */
    public static String  isValidPassword1(String password1) {
        Pattern pattern = Pattern.compile("^[a-zA-z0-9]{8,}$");
        /**
         * Return happy if the Password  matched the Regex pattern
         * If Password not matched the  Regex then  return sad
         */
        if(pattern.matcher(password1).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String isValidPassword2(String password2) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{7,}$");
        if(pattern.matcher(password2).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String isValidPassword3(String password3) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z1-9]{6,}[1-9]$");
        if(pattern.matcher(password3).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String isValidPassword4(String password4) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z1-9]{5,}[@$^][1-9]$");
        if(pattern.matcher(password4).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String isEmailValidation(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        if(pattern.matcher(email).matches()){
            return "Happy";
        }else
            return "Sad";
    }


    /**
     * This is Main Method is used for printing boolean value for whether pattern matches with given information
     * If pattern matches with given regex then return happy if not matches then return sad
     **/
    public static void main(String[] args) {
        System.out.println(isValidFirstName("Akash"));
        System.out.println(isValidLastName("Pakhare"));
        System.out.println(isValidPhoneNo("91 9423438559"));
        System.out.println(isValidEmail("akashpakhare499@gmail.com"));
        System.out.println(isValidPassword1("akash121"));
        System.out.println(isValidPassword2("Akash121"));
        System.out.println(isValidPassword3("Akashpakhare1"));
        System.out.println(isValidPassword4("Akashp$1"));
        System.out.println(isEmailValidation("akashpakhare123@yahoo.co.in"));
    }
}

