package day39_Recap.deviceTask;

public class Device {

    private String brand, model, color, size;
    private double price;

    public static boolean hasBattery = true;
    public static boolean hasPowerButton = true;


    public Device(String brand, String model, String color, String size, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if(brand == null){
            System.err.println("Invalid brand");
            System.exit(1);
        }

        if(brand.isEmpty() || brand.isBlank()){
            System.err.println("Invalid brand");
            System.exit(1);
        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if(model == null){
            System.err.println("Invalid model");
            System.exit(1);
        }

        if(model.isEmpty() || model.isBlank()){
            System.err.println("Invalid model");
            System.exit(1);
        }

        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price<=0){
            System.err.println("invalid price");
            System.exit(1);
        }

        this.price = price;
    }

    public static boolean isHasBattery() {
        return hasBattery;
    }

    public static void setHasBattery(boolean hasBattery) {
        Device.hasBattery = hasBattery;
    }

    public static boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public static void setHasPowerButton(boolean hasPowerButton) {
        Device.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){
        System.out.println("Turning on "+brand+" "+model);
    }
    public void turnOff(){
        System.out.println("Turning off "+brand+" "+model);
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
