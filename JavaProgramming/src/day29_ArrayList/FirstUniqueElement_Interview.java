package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement_Interview {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        //list.addAll(Arrays.asList(1,1,2,3,3,4,5,5));

        System.out.println(list);

        for (Integer each : list) {

            int frequency = 0;
            for (Integer element : list) {
                if(element == each){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(each);
                break;
            }

        }


    }

}
/*
1. Write a program that can return the first unique elements from an arraylist
			Do not use indexOf & lastIndexOf methods
 */


