package day21_ForEachLoop;

import java.util.Arrays;

public class JavaAndPyton_Task {

    public static void main(String[] args) {

        String sentence = "java java python python java python";
        String[] words = sentence.split(" ");

        int countJava=0;
        int countPython=0;

        for (String word : words) {
            if(word.equalsIgnoreCase("java")){
                countJava++;
            }else if(word.equalsIgnoreCase("python")){
                countPython++;
            }
        }
        System.out.println(countJava+" java and "+countPython+" python");
    }
}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

 */