package day08_IfStatements;

public class SchoolType {

    public static void main(String[] args) {

        String name = "Emre";
        byte age = 14;

        boolean elementary = age >= 1 && age <= 5;
        boolean middle = age >= 6 && age <= 8;
        boolean high = age >= 9 && age <= 12;
        boolean college = age >= 13 && age <= 16;
        boolean grad = age >= 17 && age <= 18;

        if (elementary) {
            System.out.println(name + "' elementary school");
        }

        if (middle) {
            System.out.println(name + "'s middle school");
        }

        if (high) {
            System.out.println(name + "'s high school");
        }
        if (college) {
            System.out.println(name + "'s collage school");
        }

        if (grad) {
            System.out.println(name + "'s grad school");

        }
    }
}
/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

 */