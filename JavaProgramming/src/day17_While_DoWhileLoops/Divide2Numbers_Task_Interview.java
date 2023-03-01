package day17_While_DoWhileLoops;

public class Divide2Numbers_Task_Interview {

    public static void main(String[] args) {

        int a = 84;
        int b = 11;

        int count= 0;

        while(a>=b){
            a -=b;
            count++;
        }
        System.out.println(count+" with a remainder of "+a);


    }
}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.

 */