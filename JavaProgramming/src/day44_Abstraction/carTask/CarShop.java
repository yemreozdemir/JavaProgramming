package day44_Abstraction.carTask;

public class CarShop {

    public static void main(String[] args) {

        CydeoCar cydeoCar = new CydeoCar("Dualjet","Grey",2023,200000);
        System.out.println(cydeoCar);
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.drive();
        cydeoCar.fly();
        cydeoCar.start();
        cydeoCar.stop();

        System.out.println("---------------------------------");

        Tesla tesla = new Tesla("ModelS", "White", 2023, 1000000);
        System.out.println(tesla);
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.autoPark();
        tesla.selfDrive();


        System.out.println("-----------------------------------------------------");

        Mercedes mercedes = new Mercedes("C200", "Black", 2023, 750000);
        System.out.println(mercedes);
        mercedes.drive();
        mercedes.start();
        mercedes.stop();
        mercedes.autoPark();



    }
}
