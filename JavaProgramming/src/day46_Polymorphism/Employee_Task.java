package day46_Polymorphism;

import day43_Abstraction.employeeTask.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Employee_Task {

    public static void main(String[] args) {


        Employee[] employees = {
                new Tester("Sherali", 32, 'M', 1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28, 'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F', 4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M', 5, "SDET", 105000),
                new Developer("Gulistan", 26, 'F', 6, "Web Developer", 130000),
                new Tester("Yuliya", 28, 'F', 7, "QE", 120000),
                new Developer("Cassendra", 29, 'F', 8, "Front-end Developer", 140000),
                new Tester("Aygün", 25, 'F', 9, "SDET", 130000),
                new Developer("Sophie", 26, 'F', 10, "Back-end Developer", 150000),
                new Tester("Timur", 29, 'M', 11, "SDET", 115000),
                new Developer("Fady", 26, 'F', 12, "Full Stack Developer", 142000),
                new Tester("Iryna", 24, 'F', 13, "QE", 125000),
                new Developer("Enes", 26, 'M', 14, "Full Stack Developer", 142000),
                new Tester("Mikael", 30, 'M', 15, "SDET", 105000),
        };

        List<Employee> scrumMembers = new ArrayList<>(Arrays.asList(employees));

        System.out.println(scrumMembers);
        System.out.println(scrumMembers.size());

        List<Tester> testers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();


        for (Employee employee : scrumMembers) {
            if (employee instanceof Tester) {
                testers.add((Tester) employee);
            }
            if (employee instanceof Developer) {
                developers.add((Developer) employee);
            }
        }

        System.out.println("testers = " + testers);
        System.out.println("developers = " + developers);


        double maxSalaryOfTester = Double.MIN_VALUE;
        String nameOfTesterWithMaxSalary = "";

        for (Tester tester : testers) {
            if (tester.getSalary() > maxSalaryOfTester) {
                maxSalaryOfTester = tester.getSalary();
                nameOfTesterWithMaxSalary = tester.getName();
            }
        }

        System.out.println("maxSalaryOfTester = " + maxSalaryOfTester);
        System.out.println("nameOfTesterWithMaxSalary = " + nameOfTesterWithMaxSalary);


        double maxSalaryOfDev=Double.MIN_VALUE;
        String nameOfDevWithMaxSalary="";


        for (Developer developer : developers) {
            if (developer.getSalary() > maxSalaryOfDev) {
                maxSalaryOfDev = developer.getSalary();
                nameOfDevWithMaxSalary = developer.getName();
            }
        }

        System.out.println("maxSalaryOfDev = " + maxSalaryOfDev);
        System.out.println("nameOfDevWithMaxSalary = " + nameOfDevWithMaxSalary);


    }
}