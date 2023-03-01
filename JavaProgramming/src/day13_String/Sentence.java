package day13_String;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");

        String sentence = scan.nextLine(); // sentence nin ne olduğunu görmek için
          //int totalNo = sentence.length();   sentencenin toplam uzunluğunu görmek için
        char firstChar = sentence.charAt(0); // ilk karakteri bulmak için
        char lastChar = sentence.charAt(sentence.length()-1); // son karakteri bulmak için

        System.out.println(firstChar + "&" + lastChar);




    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence

 */