package day04_Variables;

import javax.lang.model.SourceVersion;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 9.53 ;
        double euro = dollar * 0.86 ;
        double JPY  = dollar * 114.14;
        double pound = dollar * 0.73;

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("JPY = " + JPY);
        System.out.println("pound = " + pound);


    }
}
