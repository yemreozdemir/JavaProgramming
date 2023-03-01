package day03_EscapeSequences;
/*
Escape sequences:Must be given with double quote
    \n: starts a new line
    \t: paragraph space (tab)
    \\: single back slash
    \": double quote

 */


public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("java \nPyton \nC+");

        System.out.println("-------------------------------");

        System.out.println("Hello Cydeo How are you all today? It's nice to see you all! What class do we have next week?");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("-----------------------------------");
        System.out.println("\tJava is cool programing language");

        System.out.println("-----------------------------------");
        System.out.println("/ \\"); // in order to print one back slash we need to give two back slashs

        System.out.println("----------------------------------");
        System.out.println("My favorite tv show is \"Game Of Thrones\""); //



    }

}
