package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {

        byte num = 15;

        if(num>=1 && num<=18){

            if(num<=5){
                System.out.println("Elementary School");
            }else if(num<=9){
                System.out.println("Middle School");
            }else if(num<=13){
                System.out.println("High School");
            }else if(num<=17){
                System.out.println("Collage");
            }else
                System.out.println("Grad School");


        }else
            System.out.println("Invalid grade level given");

    }
}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */