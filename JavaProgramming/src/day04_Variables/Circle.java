package day04_Variables;

import javax.lang.model.SourceVersion;

public class Circle {

    public static void main(String[] args) {
        //PI, radius, diameter, area, perimeter

        double PI = 3.14;
        double radius = 5.5;
        double diameter = radius * 2; // always diameter= radius* 2 // find the diameter by multiplying the radius to 2
        double area = radius * radius * PI;  // finds the area of the circle
        double perimeter = 2 * radius * PI;  // finds the perimeter of the circle


        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);





    }
}
/*
Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI



 */