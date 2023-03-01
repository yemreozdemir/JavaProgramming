package day16_ForLoopStringPractice;

public class RemoveDuplicates4 {

    public static void main(String[] args) {

        String str = "aabbaacc";
        String result ="";

        for (int i = 0; i < str.length()-1 ; i++) { // i: represents all the index numbers of str(start from 0)

            String ch=""+str.charAt(i);

            if(!result.contains(ch)){ // if the characyer is not contained in the result
                result += ch; // the character will be added to the result
            }
                                                                    //str nin tüm dizin numaralarını temsil eder
        }
        System.out.println(result);
    }
}
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */