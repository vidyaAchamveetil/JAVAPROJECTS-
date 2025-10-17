package org.example;

import sun.security.provider.SecureRandom;

import java.util.Random;

public class PasswordGenerator {
    private static final String Characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+"1234567890"+"!@#$%^&*()_+";

    private static final int Password_length=12;
    public static void main(String args[]){
        String password=generatepassword(Password_length);
        System.out.println("Generated password:"+password);
    }
    public static  String generatepassword(int password_length)
    {
        Random random=new Random();
        char[] password=new char[password_length];

        for (int i=0;i<password_length ;i++)
        {
           password[i]=(Characters.charAt(random.nextInt(Characters.length())));
        }
       return password.toString();
    }

}
