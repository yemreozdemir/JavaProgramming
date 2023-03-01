package day09_IfStatements;

import java.util.Scanner;

public class Scanerlıfınra {

    public static void main(String[] args) {

        int number;
        Scanner randomNumber = new Scanner(System.in);
        System.out.println("please enter a number");
        number= randomNumber.nextInt();
        boolean n3 = number%3==0;
        boolean n5 = number%5==0;

        if(n3&&n5){
            System.out.println("FINRA");
        }else if(n3){
            System.out.println("FIN");
        }else if(n5){
            System.out.println("RA");
        }else {
            System.out.println("Number cannot be divided both 3 and 5");
        }

    }
}
/*
3. Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3,
 print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for
 number which is a multiple of both 3 and 5, print "FINRA" instead of the number.



            ex:
                number = 3
            output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA
 */