package day08_IfStatements;

public class TwoNumbers {
    public static void main(String[] args) {

        int n1 = 100,
                n2 = 200;

        boolean minNumber = n1 <= n2 && n1 >= n2;
        boolean maxNumber = n2 >= n1 && n1 <= n2;
        boolean equal = n1 == n2;

        if (minNumber) {
            System.out.println(n1 + " is minumum number");
        }

        if (maxNumber) {
            System.out.println(n2 + " is maximum number");
        }

        if (equal) {
            System.out.println("equal");

        }


    }
}
/*
3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number

 */