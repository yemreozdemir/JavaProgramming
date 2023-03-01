package day39_Recap.animalTask;

public class Animal {

    private String name, breed;
    private int age;
    private char gender;
    private String size, color;


    public Animal(String name, String breed, int age, char gender, String size, String color) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setGender(gender);
        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.err.println("invalid name");
            System.exit(1);
        }
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed == null) {
            System.err.println("invalid breed");
            System.exit(1);
        }
        if (breed.isEmpty() || breed.isBlank()) {
            System.err.println("invalid breed");
            System.exit(1);
        }
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        gender=(""+gender).toUpperCase().charAt(0);
        if(!(gender=='M' || gender=='F')){
            System.err.println("invalid gender");
            System.exit(1);
        }

        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            System.err.println("invalid color");
            System.exit(1);
        }
        if (color.isEmpty() || color.isBlank()) {
            System.err.println("invalid color");
            System.exit(1);
        }
        this.color = color;
    }

    public void eat(){
        System.out.println(name+" eating food");
    }
    public void drink(){
        System.out.println(name+" drinks water");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void move(){
        System.out.println(name+" is mooving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()
 */