package day44_Abstraction.carTask;

public  class Mercedes extends Car implements AutoPark {


    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel()+"Auto parking feature enabled"+ AutoPark.hasAutoPark);
    }

    @Override
    public void start() {
        System.out.println("Please press the start button ");
    }

    @Override
    public void drive() {
        System.out.println("Enjoy the comfortable ride "+getMake()+getModel());
    }
}
