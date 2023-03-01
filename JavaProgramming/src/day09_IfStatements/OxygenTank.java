package day09_IfStatements;

public class OxygenTank {

    public static void main(String[] args) {

        int tankLevel = 68;
        String message;

        if (tankLevel >= 90) {
            System.out.println(tankLevel + " Your tank is full");
        } else if (tankLevel >= 80 && tankLevel <= 89) {
            System.out.println(tankLevel + " Still okay");
        } else if (tankLevel >= 70 && tankLevel <= 79) {
            System.out.println(tankLevel + " Don't go too far");
        } else if (tankLevel >= 60 && tankLevel <= 69) {
            System.out.println(tankLevel + " Start to head back");
        } else if (tankLevel >= 50 && tankLevel <= 59) {
            System.out.println(tankLevel + " Be careful now you at at 50%");
        } else {
            System.out.println("dangerous level");
        }


    }
}
/*
4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and
you must print a message based on the level:


                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

 */