package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String result = ""; // contain the reversed version of str( str nin ters versiyonunu içerir)
        //noopS nedooW

        for (int i = str.length()-1; i >=0; i--) {
            result += str.charAt(i);

        }



        System.out.println(result);

    }
}
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */