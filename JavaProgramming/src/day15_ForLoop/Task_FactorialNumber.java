package day15_ForLoop;

import java.util.Scanner;

public class Task_FactorialNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

       int result = 1;

        for (int i = (int) num; i >= 1; i--) {

            result *= i;


        }
        System.out.println("result = " + result);

        scan.close();

    }

}
/*
 int result = 1;

        for(int i = 5;  i >= 1 ; i-- ){
            result *= i;
        }                                        **** bu da benim yöntem *****

        System.out.println("result = " + result);
 */



/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */