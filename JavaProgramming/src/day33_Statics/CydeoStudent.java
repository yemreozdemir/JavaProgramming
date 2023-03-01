package day33_Statics;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int id;
    public char grade;
    public int groupNumber;
    public int batchNumber;


    public static String schoolName="Cydeo School";
    public static String programmingLanguage="Java";

    public CydeoStudent(String name, int age, char gender, int id, char grade, int groupNumber, int batchNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.groupNumber = groupNumber;
        this.batchNumber = batchNumber;
    }

    public void study(){

        System.out.println(name+" is studying");
    }

    public void attendClass(){

        System.out.println(name+" is attending class");
    }

    public static void printSchoolName(){

        System.out.println("School Name: " + schoolName);
    }

    public static void printProgLanguage(){

        System.out.println("Programming Language: " + programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent_Task{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", groupNumber=" + groupNumber +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
/*
1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */