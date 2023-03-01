package day33_Statics;

public class Car_Test {

    public static void main(String[] args) {


        Car merso=new Car("Mercedes","EQC","White",2024,800000);

        System.out.println(merso);

        merso.drive();

        System.out.println(merso.hasBattery);
    }
}
