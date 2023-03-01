package day35_Encapsulation.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyTest {

    public static void main(String[] args) {

        ArrayList<Candy> candies=new ArrayList<>();

        candies.addAll(Arrays.asList(
           new Candy("Kent",10,1.5,false),
           new Candy("Kent",20,2.5,false),
           new Candy("Kent",30,3.5,false),
           new Candy("Kent",40,4.5,false),
           new Candy("Kent",50,5.5,false)

        ));

        for (Candy candy : candies) {
            System.out.println(candy.getBrand()+" : "+ candy.getPrice());
        }
    }


}
