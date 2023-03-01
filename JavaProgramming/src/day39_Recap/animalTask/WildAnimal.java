package day39_Recap.animalTask;

public class WildAnimal extends Animal{

    public static boolean isWild=true;
    public static boolean isFriendly=false;
    public static boolean isPlayable=false;

    public WildAnimal(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }


    public void hunt(){
        System.out.println(getName()+" is hunting");
    }


}

/*
Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable
				Extra Methods:
					hunt()
 */

