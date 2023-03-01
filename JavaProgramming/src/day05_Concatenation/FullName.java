package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Aeron";
        String lastName = "Daniel";
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;
        int age = 19;


        String fullName = firstName + " " + lastName;

        // full name of the person is ______
        System.out.println("Full name of the person is " + fullName);

        //___ is __ years old
        System.out.println(fullName + " is " + age +" years old" );

        //FullName is JobTitle +, works at CompanyName, and FullName's salary is Salary

        System.out.println(fullName + " is " + jobTitle + ", works at" + companyName
                +", and " + fullName + "'s salary is $" + salary );




    }
}
