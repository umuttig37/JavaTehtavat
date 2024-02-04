package Moduuli9;

public class ElectricCar extends AbstractVehicle {
    public String color;
    public String brand;

    public ElectricCar(String color, String brand){
        super("Electric Car", color, 30.0);
        this.color = color;
        this.brand = brand;
    }

}
