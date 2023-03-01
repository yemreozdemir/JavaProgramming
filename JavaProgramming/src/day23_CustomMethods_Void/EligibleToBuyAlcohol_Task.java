package day23_CustomMethods_Void;

public class EligibleToBuyAlcohol_Task {


    public static void main(String[] args) {

        buyAlcohol(18);

    }

    public static void buyAlcohol(int age){

        if(age>=18){
            System.out.println("You are eligible");
        }else{
            System.out.println("You are not eligible");
        }


    }
}
/*
3. create a method that can check if a person is eligible to buy alcohol

 */