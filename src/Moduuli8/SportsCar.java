package Moduuli8;

import Moduuli5.Car;

public class SportsCar extends Car {

    public SportsCar(String typename, int tankCapacity, int topSpeed){
        super(typename, tankCapacity, topSpeed);
    }
    @Override
    public void accelerate(){
        if (super.getGasolineLevel() > 0)
            super.setSpeed(super.getSpeed() + 20);
        else
            setSpeed(0);
    }

    @Override
    public void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            if (amount > 0)
                setSpeed(Math.max(0, getSpeed() - amount * 2)); // Enhanced deceleration
        } else
            setSpeed(0);
        System.out.println("Speed is now " + super.getSpeed() + ".");
    }

}
