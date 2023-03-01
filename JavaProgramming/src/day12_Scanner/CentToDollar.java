package day12_Scanner;

import java.util.Scanner;

public class CentToDollar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents");
        int cent = scan.nextInt();

        scan.close();

        int dollar = cent / 100;
        cent -= dollar * 100;

        System.out.println(dollar + " dollar and " + cent + " cent ");


    }
}
/*
3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */