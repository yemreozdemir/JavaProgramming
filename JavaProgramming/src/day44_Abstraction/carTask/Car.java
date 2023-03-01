package day44_Abstraction.carTask;

public abstract class Car {

    private final String make;
    private final String model;
    private String color;
    private final int year;
    private double price;

    public Car(String make, String model, String color, int year, double price) {
        if(make==null || make.isBlank() || make.isBlank()){
            throw new RuntimeException("invalid make: "+getMake());
        }
        this.make=make;

        if(model==null || model.isBlank() || model.isEmpty()){
            throw new RuntimeException("invalid model: "+getModel());
        }
        this.model = model;

        if(year<=1886){
            throw new RuntimeException("invalid year: "+getYear());
        }
        this.year=year;

        setColor(color);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            throw new RuntimeException("invalid price: "+getPrice());
        }

        this.price = price;
    }

    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println(getMake()+" "+getModel()+"Press the brake");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

					If invalid arguments are given for setting the instances, then manually throw an exception

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()

 */