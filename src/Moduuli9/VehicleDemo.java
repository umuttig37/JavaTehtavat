package Moduuli9;

public class VehicleDemo {
    public static void main(String[] args){
        Car car = new Car("red", "E63");
        Motorcycle motorcycle = new Motorcycle("blue", "S100rr");
        Bus bus = new Bus("White", "Sprinter");
        ElectricCar electricCar = new ElectricCar("Blue", "Tesla");
        car.Start();
        System.out.println(car.GetInfo());
        car.Stop();
        System.out.println(car.GetInfo());
        motorcycle.Start();
        System.out.println(motorcycle.GetInfo());
        motorcycle.Stop();
        System.out.println(motorcycle.GetInfo());
        bus.Start();
        System.out.println(bus.GetInfo());
        bus.Stop();
        System.out.println(bus.GetInfo());

        electricCar.Start();
        System.out.println(electricCar.GetInfo());
        electricCar.Charge();
        electricCar.StopCharge();
        bus.Charge();
        bus.StopCharge();
    }
}
