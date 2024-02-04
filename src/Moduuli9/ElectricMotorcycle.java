package Moduuli9;

public class ElectricMotorcycle extends AbstractVehicle{
    public String color;
    public String brand;

    public ElectricMotorcycle(String color, String brand){
        super("Electric Motorcycle", color, 25.0);
        this.color = color;
        this.brand = brand;
    }
}
