package day24_CustomMethod_Return;

public class Reverse_Task {

    public static void main(String[] args) {

        String str1= "Java";
        String reverse=reverse(str1);

        System.out.println(reverse);


    }

    public static String reverse(String str){

        String result="";

        for (int i =str.length()-1; i >=0 ; i--) {
            result +=str.charAt(i);
        }
        return result;
    }
}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
 */