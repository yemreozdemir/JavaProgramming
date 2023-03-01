package day13_String;

import java.util.Scanner;

public class Initials_task {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type a string");
        String s1 = scan.next();

        System.out.println("Type a string");
        String s2 = scan.next();

        char a1 = s1.charAt(0);
        char a2 = s2.charAt(0);

        System.out.println(a1 + "." + a2);







    }
}
/*
4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */