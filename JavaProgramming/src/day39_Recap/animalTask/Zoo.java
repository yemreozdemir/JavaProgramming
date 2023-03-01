package day39_Recap.animalTask;

public class Zoo extends Animal{


    public Zoo(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public static void main(String[] args) {

        Dog dog=new Dog("Rodi","Retriver",5,'M',"Large","Black");

        System.out.println(dog.getName());

        dog.bark();
        dog.sleep();
        dog.eat();





    }







}
