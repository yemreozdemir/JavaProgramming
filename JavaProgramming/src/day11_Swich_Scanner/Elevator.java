package day11_Swich_Scanner;

public class Elevator {
    public static void main(String[] args) {

        int floorNum=2;

        if(floorNum==1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum==2){
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        }else{
            System.out.println("invalid floor" + floorNum);
        }









        System.out.println("-----------------------------------------------");

        switch (floorNum){

            case(1):
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;

            case(2):
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;

            case(3):
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;

            default:
                System.out.println("Invalid Floor :" + floorNum);


        }


    }

}
/*
2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */