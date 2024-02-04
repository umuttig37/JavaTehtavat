package Moduuli9;

public class Motorcycle extends AbstractVehicle{
    public String color;
    public String type;
    public boolean isCarWorking;

    public Motorcycle(String color, String type){
        super("Motorcycle", color, 40.0);
        this.color = color;
        this.type = type;

    }

}
