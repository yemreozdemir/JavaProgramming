package day23_CustomMethods_Void;

import java.util.Arrays;

public class Anagram_Task {

    public static void main(String[] args) {

        anagram("silent","listen");

    }

    public static void anagram(String str,String str1){

        char[] ch=str.toCharArray();
        char[] ch1=str1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        if(Arrays.equals(ch,ch1)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}
/*
17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram

 */