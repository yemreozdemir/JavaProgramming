package day18_Nested_Loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RoomReservation_Task {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int total= 0;

        while (true){
        System.out.println("Which room would you like to reserve");
        System.out.println("King Bed == 120$");
        System.out.println("Queen Bed ==> 100$");
        System.out.println("Single Bed ==> 80$");

        String word = scan.nextLine().toLowerCase();

        while (!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))){
            System.out.println("Invalid entry, please re-enter");
            word=scan.nextLine().toLowerCase();
        }

        total += (word.equals("king bed"))? 120 : (word.equals("queen bed"))? 100 : 80;

        System.out.println("would you like to select another room?");
        String word1 = scan.nextLine().toLowerCase();

        while(!(word1.equals("yes") || word1.equals("no"))){
            System.out.println("Invalid entry, please re-enter");
            System.out.println("would you like to select another room?");
            word1 = scan.nextLine().toLowerCase();

        }

        if(word1.equals("no")){
            System.out.println("Your total price is: $"+ total);
            break;
        }

        }

    }
}
/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */