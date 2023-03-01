package day11_Swich_Scanner;

public class CappucinoBuyer {
    public static void main(String[] args) {
        String size = "Tall";
        int calories = 0;
        double price = 0.0;


        switch (size) {
            case "Tall":
                price = 3.69;
                calories = 90;
                break;

            case "Grande":
                price = 3.99;
                calories = 120;
                break;

            case "venti":
                price = 4.29;
                calories = 150;
                break;

            default:
                System.err.println("Invalid Size: " + size);


        }
        if (price != 0) {
            System.out.println("Price is: $" + price);
            System.out.println("Calories is: " + calories);
        }

    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and
 calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */