package Moduuli8;

import Moduuli5.Car;

public class Bus extends Car {

    public int passengerCount;
    public Bus(String typename, int tankCapacity, int topSpeed, int passengerCount){
        super(typename, tankCapacity, topSpeed);
        this.passengerCount = passengerCount;
    }

    public void passengerEnter(int amount){
        passengerCount += amount;
    }

    public void passengerExit(int amount){
        if(passengerCount >= amount)
            passengerCount -= amount;
        else
            System.out.println("There is no " + amount + " passengers in the bus.");

    }

}
