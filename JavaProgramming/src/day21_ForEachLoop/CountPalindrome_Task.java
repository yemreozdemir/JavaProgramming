package day21_ForEachLoop;

public class CountPalindrome_Task {

    public static void main(String[] args) {

        String[] str =  {"anna", "level", "Java"};

        int count =0;

        for (String word : str) {
            String reverse ="";

            for (int i = word.length()-1; i >=0 ; i--) {
                reverse += word.charAt(i);

            }
              if(word.equalsIgnoreCase(reverse)){
                  count++;
              }

        }

              System.out.println(count);
    }
}
/*
   4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */