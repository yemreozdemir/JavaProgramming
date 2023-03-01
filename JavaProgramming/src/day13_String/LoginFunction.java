package day13_String;

import java.util.Scanner;

public class LoginFunction {

    public static void main(String[] args) {

        String username = "Cydeo";
        String password = "Wooden Spoon";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");
        String un = scan.next();
        System.out.println("Enter password");
        String ps = scan.next();

        if(username.equals(un) && password.equals(ps) ){
            System.out.println("Logged in." );
        }else {
            System.out.println("Incorrect username or password");
        }



    }
}
/*
8. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
 */