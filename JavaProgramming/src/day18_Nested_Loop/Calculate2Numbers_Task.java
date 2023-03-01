package day18_Nested_Loop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculate2Numbers_Task {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num = scan.nextInt();
        System.out.println("Enter the second number");
        int num1 = scan.nextInt();
        System.out.println("Enter a math operator");
        char ch = scan.next().charAt(0);

        while(!(ch=='+' || ch=='-' || ch=='*' || ch=='/') ){
            System.out.println("Invalid operator,please re-entry");
            ch = scan.next().charAt(0);

        }
        double result =0;

        if(ch=='+'){
            result = num+num1;
        }else if (ch=='-'){
            result= num-num1;
        }else if(ch=='*'){
            result=num*num1;
        }else{
            result = num/num1;
        }

        System.out.println(result);


    }
}
/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */