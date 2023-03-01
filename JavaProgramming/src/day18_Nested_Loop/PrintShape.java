package day18_Nested_Loop;

public class PrintShape {


    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
