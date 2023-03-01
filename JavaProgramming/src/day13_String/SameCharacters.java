package day13_String;

import java.util.Scanner;

public class SameCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a  string");

        String string = scan.next();
        char first = string.charAt(0);
        char last = string.charAt(string.length()-1);

        if (first==last){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }


    }
}
/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */