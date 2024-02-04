package Moduuli9;

public class Bus extends AbstractVehicle {
    public String color;
    public String type;
    public boolean isEngineWorking;

    public Bus(String color, String type){
        super("Bus", color, 20.0);
        this.color = color;
        this.type = type;
    }

}
