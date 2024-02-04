package Moduuli9;

public class Car extends AbstractVehicle {
    public String color;
    public String brand;
    public boolean isEngineOn;

    public Car(String color, String brand){
        super("Car", color, 30.0);
        this.color = color;
        this.brand = brand;
    }
}
