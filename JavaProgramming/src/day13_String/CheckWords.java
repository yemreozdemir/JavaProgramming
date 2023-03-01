package day13_String;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three letter");

        String str1 = scan.next();
        String str2=  scan.next();
        String str3 = scan.next();

        int s1 = str1.length();
        int s2 = str2.length();
        int s3 = str3.length();

        if (s1==s2 && s2==s3 ){
            System.out.println("All words are same length");
        } else if (s1!=s2 && s2!=s3 && s1!=s3) {
            System.out.println("All different length");
        }else {
            System.out.println("Not Same nor Different lengths");
        }


    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */