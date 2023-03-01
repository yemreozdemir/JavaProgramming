package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        int division = num1 / num2; //division variable contains the result of num1 divided by num2
        int remainder = num1 % num2;

                   //10 devide by 3 is equal to 3 with a reminder of 1

                      // remainder = numerator -(denominator * integer result)
                         //10      - (3 * 3) = 1

        System.out.println(num1 + " divided by " + num2 + " is equal to " + division + " with a reminder of " + remainder);

        // whats the remainder of 25 divided by 4

        System.out.println(25 % 4);
        System.out.println(25 % 5);


    }
}
