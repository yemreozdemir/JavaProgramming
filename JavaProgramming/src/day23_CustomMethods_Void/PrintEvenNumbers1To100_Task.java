package day23_CustomMethods_Void;

public class PrintEvenNumbers1To100_Task {

    public static void main(String[] args) {

        printEvenNumbers();

    }

    public static void printEvenNumbers(){
        for (int i = 1; i < 100 ; i++) {
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
    }
}
