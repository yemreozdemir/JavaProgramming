package day24_CustomMethod_Return;

import java.lang.reflect.Array;
import java.util.List;

public class FrequencyOfWord_Task {
    public static void main(String[] args) {
String asd="qweasd ";
        System.out.println(asd.trim());
        int frequencyOfWord= frequencyOfWord("Java java java python python","java");
       System.out.println(frequencyOfWord);
    }



    public static int frequencyOfWord(String sentence,String word){

        int count=0;
       String [] splittedSentence= sentence.split(" ");

        if (word.equalsIgnoreCase("java")){
            for (int i = 0; i < splittedSentence.length; i++) {
                if (splittedSentence[i].equalsIgnoreCase("java")){
                    count++;
                }
            }
        }else if (word.equalsIgnoreCase("python")){
            for (int i = 0; i < splittedSentence.length; i++) {
                if (splittedSentence[i].equalsIgnoreCase("python")){
                    count++;
                }
            }
        }
        return count;

    }


}
/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the
    frequency of word from the sentence

                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */