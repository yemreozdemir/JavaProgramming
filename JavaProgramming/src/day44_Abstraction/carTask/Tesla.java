package day44_Abstraction.carTask;

public class Tesla extends Car implements AutoPark,AutoPilot{


    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " : Automatic parking" +"(" +AutoPark.hasAutoPark + ")" + " feature enabled");
    }

    @Override
    public void selfDrive() {
        System.out.println( getMake() + " " + getModel() + "Be cool!!!" + "Auto pilot enabled : " + AutoPilot.hasAutoPilot);
    }

    @Override
    public void start() {
        System.out.println("Please say \"Start\"");
    }

    @Override
    public void drive() {
        System.out.println("Awesome driving with " + getMake() + " " + getModel());
    }
}
