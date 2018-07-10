///////////////////////////////////////////////////
//
// Peter Trinh
// Assignment 1: Userids and passwords
// November 15, 2016
//
///////////////////////////////////////////////////
package EmailCases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCases {
    
    public static String email;
    public static String password;
    static Pattern emailPattern, passwordPattern; 

    //Checks email address for validity
    public static boolean userId(String email) {                
        emailPattern = Pattern.compile("^[A-z0-9]+@[A-z0-9]+.[A-z0-9]+$"); //Any alphanumeric @ any alphanumeric . any alphanumeric
        Matcher m = emailPattern.matcher(email);
        
        if( m.find())
        {
            return true;
        }else
            return false;
    }
            
    //Checks password for validity
    public static boolean password(String password) {
        passwordPattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$!@#$%^%*?&^])[A-Za-z\\d$@$!%*#?&]{8,}$"); 
        Matcher m = passwordPattern.matcher(password);

        if(m.find())
        {
            return true;
        } else
            return false;
    }
    
    public static void main(String[] args) {
        System.out.println("Please enter your email address");
        Scanner keyboard = new Scanner(System.in);
        email = keyboard.nextLine();
        
        userId(email);
        
        if(userId(email) == true)
        {
            System.out.println("Your email is valid.");
        }else
        {
            System.out.println("You entered an invalid email.");
        }
        System.out.println();
        
        System.out.println("Please enter your password");
        password = keyboard.nextLine();
        if(password(password) == true)
        {
            System.out.println("Your password is valid.");
        }else
        {
            System.out.println("Your password must have:");
            System.out.println("at least 8 characters");
            System.out.println("at least 1 number");
            System.out.println("at least 1 capital letter");
            System.out.println("and");
            System.out.println("at least 1 special character from the set \"!, @, #, $, %, ^\""); 
        }

        
        if(userId(email) && password(password) == true)
        {
        System.out.println("Your email and password are valid.");
        }
    }
    
}
