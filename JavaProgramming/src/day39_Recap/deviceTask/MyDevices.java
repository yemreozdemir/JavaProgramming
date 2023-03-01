package day39_Recap.deviceTask;

public class MyDevices extends Device{




    public MyDevices(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    public static void main(String[] args) {


        Laptop laptop=new Laptop("MSI","abc123","black","medium",10000);

        System.out.println(laptop.getPrice());

        laptop.setBrand("Dell");
        System.out.println(laptop.getBrand());

        Iphone iphone=new Iphone("Iphone","13","white","pro",5000);

        Iphone.isHasPowerButton();
        Iphone.isHasBattery();

        System.out.println(Iphone.hasBattery);
        System.out.println(Iphone.hasPowerButton);



    }


}
