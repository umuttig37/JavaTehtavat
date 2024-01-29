package Moduuli5;

public class Car {

    private float speed;
    private float gasolineLevel;
    private String typeName;
    private int topSpeed;
    private boolean cruiseControlOnOff;

    public Car(String typeName) {
        this.gasolineLevel = gasolineLevel;
    }

    public Car(int topSpeed, int gasolineLevel){
        this.topSpeed = topSpeed;
        this.gasolineLevel = gasolineLevel;
    }

    public void CruiseControl(int targetspeed){
        if(targetspeed > 200){
            System.out.println("Speed " + targetspeed + " is too high. Please select lower speed. Cruise Control turned off.");
            cruiseControlOnOff = false;
        }
        else if(targetspeed < 0){
            System.out.println("Speed " + targetspeed + " is not possible. Please select higher speed. Cruise Control turned off.");
            cruiseControlOnOff = false;
        }
        else {

            if (speed < targetspeed) {
                cruiseControlOnOff = true;
                while (speed < targetspeed) {
                    accelerate();
                    if (speed > targetspeed) {
                        speed = targetspeed;
                    }
                }
            } else if (speed > targetspeed) {
                cruiseControlOnOff = true;
                float targetamount = speed - targetspeed;
                int targetamountint = (int) targetamount;
                decelerate(targetamountint);
            }
        }
    }
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
        System.out.println("Speed is now " + speed + ".");
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
        System.out.println("Speed is now " + speed + ".");
    }
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }
    public static void main(String[] args){
        Car mustang = new Car(300, 80);

        mustang.accelerate();

        mustang.CruiseControl(200);
        mustang.CruiseControl(100);
        mustang.CruiseControl(-100);
        mustang.CruiseControl(300);
    }
}