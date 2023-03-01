package day09_IfStatements;

public class AgeGroups {
    public static void main(String[] args) {

        int age;
        String name;
        age = 33;

        if (age == 1 && age == 2) {
            System.out.println("Infant");
        } else if (age >=3 && age <= 5) {
            System.out.println("Toddler");
        } else if (age >= 6 && age <= 9) {
            System.out.println("Kid");
        } else if (age >= 10 && age <= 12) {
            System.out.println("Pre-Teen");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Teenager");
        } else if (age >= 18 && age <= 20) {
            System.out.println("Young Adult");
        } else if (age >= 21 && age <= 39) {
            System.out.println("Adult");
        } else  {
            System.out.println("Yaşlı");
        }


    }
}
/*
Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */