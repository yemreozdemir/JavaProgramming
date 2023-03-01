package day13_String;

import java.util.Scanner;

public class StringSize {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a  string");

        String str = scan.next();
        int size = str.length();

        if(size >3 ){
            System.out.println(str.charAt(str.length()-3));
            System.out.println(str.charAt(str.length()-2));
            System.out.println(str.charAt(str.length()-1));
        } else if (size<=3) {
            System.out.println(str);

        }else{
            System.out.println("string is empty");
        }

    }
}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */