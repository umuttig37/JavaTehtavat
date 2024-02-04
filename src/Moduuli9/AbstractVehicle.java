package Moduuli9;

abstract class AbstractVehicle implements Vehicle, ElectricVehicle{
    public String type;
    public String color;
    public boolean isCharging;
    public boolean isEngineOn;
    public double fuelEfficiency;
    public AbstractVehicle(String type, String color, double fuelEfficiency){
        this.type = type;
        this.color = color;
        this.fuelEfficiency = fuelEfficiency;
    }
    public void Start(){
        isEngineOn = true;
        System.out.println(type + " is starting.");
    }
    public void Stop(){
        System.out.println(type + " has stopped.");
        isEngineOn = false;
    }
    public String GetInfo(){
        return "vehicle's type: " + type + "\nvehicle's color: " + color + "\nengine working status: " + isEngineOn + "\nmiles per gallon/miles per kWh: " + fuelEfficiency;
    }
    public void Charge(){
        if(type.equalsIgnoreCase("Electric Car") || type.equalsIgnoreCase("Electric Motorcycle")){
            System.out.println(type + " is now charging.");
            isCharging = true;
        }
        else
            System.out.println(type + " cannot be charged.");
    }
    public void StopCharge(){
        if(isCharging) {
            System.out.println(type + " is now stopped charging.");
            isCharging = false;
        }
        else
            System.out.println(type + " has not put on charge.");
    }
    public double CalculateFuelEfficiency(){
        return fuelEfficiency;
    }
}
