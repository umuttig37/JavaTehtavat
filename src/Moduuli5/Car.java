package Moduuli5;

/* Define a class Moduuli5.Car (convention capitalizes class names).
 * Moduuli5.Car is public (as classes usually are, more on this later).
 */
public class Car {
    /* An object of class Moduuli5.Car will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private int topSpeed;
    private boolean cruiseControlOnOff;

    /* This is the method (constructor) called when a new instance of Moduuli5.Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName) {
        this.gasolineLevel = gasolineLevel;
        // this refers to the object itself.
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
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