package day10_NestedIf;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int num = 75; //50, 75, 100
        String result = "";



        if (num == 50 || num == 75 || num == 100) {

            if (num == 50) {
                result = "20 crew, 30 passengers";
            } else if (num == 75) {
                result = "25 crew, 50 passengers";
            } else {
                result = "30 crew, 70 passengers";
            }

        } else {
            result = "invalid number";
        }
            System.out.println(result);


    }
}
/*
2. Create a class called CrewAndPassangers, Given a number of people on the ship (int number), determine how many need
to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */