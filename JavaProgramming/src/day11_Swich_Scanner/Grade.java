package day11_Swich_Scanner;

import java.nio.charset.StandardCharsets;

public class Grade {
    public static void main(String[] args) {

        char ch = 'B';
       // String result = "";

                switch(ch){
                    case'A':
                      System.out.println("excellent");   //result = "excellent"; bu şekilde de yapabilirsin
                        break;
                    case'B':
                        System.out.println("great");
                        break;
                    case 'C':
                        System.out.println("good");
                        break;
                    case 'D':
                        System.out.println("passed");
                        break;
                    case 'F':
                        System.out.println("failed");
                        break;
                    default:
                        System.out.println("invalid");






                }


    }


}
/*
3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */