package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to Exception");
    }
    /*private static final String First_Name_Check="(^[A-Z]{1}[a-z]{2,}$)";
    private static final String Last_Name_Check=("^[A-Z]{1}[a-z]{2,}");
    public boolean firstNameTest(String firstName) throws UserRegistrationException {
        boolean test= Pattern.compile(First_Name_Check).matcher(firstName).matches();
        if (test){
            System.out.println(firstName + " Is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("Given input is not valid");
        }
    }

    public boolean lastNameTest(String lastName) throws UserRegistrationException {
        boolean test= Pattern.compile(First_Name_Check).matcher(lastName).matches();
        if (test){
            System.out.println(lastName + " Is valid");
            return true;
        }
        else throw new UserRegistrationException("Given input is not valid");
    }*/
}
