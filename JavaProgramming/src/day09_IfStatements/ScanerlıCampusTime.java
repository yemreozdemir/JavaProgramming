package day09_IfStatements;

import java.util.Scanner;

public class ScanerlıCampusTime {
    public static void main(String[] args) {

        int time; // a number between 1~24
        Scanner randomTime = new Scanner(System.in);
        System.out.println("please give a time");
        time = randomTime.nextInt();

//        if (time >= 8 && time <= 23) { // open from 1~24
//            System.out.println(time + " open");
//        } else {
//            System.out.println(" closed");
//        }
//
//
//        System.out.println("___________________other way _________");
        if (time > 0 && time < 25) {

            if (time >= 8 && time <= 23) {
                System.out.println(time + " open");

            } else {
                System.out.println(time + "closed");
            }

        }else {
            System.out.println("Wrong time selection");
        }
    }


}
/*
1.  Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has been
 initialized, write a program that can find out if the campus is open or not. Campus is open from 8 am(8) to 11 pm (23)
 If user enters a time within the open time they should see message: “open”  but if the time entered is outside of
 operating hours they should see: “ closed”
 */