import java.lang.*;
import java.util.*;

class Car
{
    public void startCar()
    {
        System.out.println("STARTING ENGINE");
    }
    public void acclerateCar()
    {
        System.out.println("ACCELERATING SPEED");
    }
    public void changeGear()
    {
        System.out.println("MANUAL GEAR TRANSMISSION");
    }
}
class LuxuryCar extends Car
{
    public void changeGear()
    {
        System.out.println("AUTOMATIC GEAR TRANSMISSION");
    }
    public void openRoof()
    {
        System.out.println("OPENING ROOF");
    }
}
public class ConstructorClass{
    public static void main(String[] args) {
        Car Car1=new Car();
        Car1.startCar();
        Car1.acclerateCar();
        Car1.changeGear();
        System.out.println("");
        LuxuryCar LuxuryCar1=new LuxuryCar();
        LuxuryCar1.startCar();
        LuxuryCar1.acclerateCar();
        LuxuryCar1.changeGear();
        LuxuryCar1.openRoof();
        System.out.println("");
        Car Car2=new LuxuryCar();
        Car2.startCar();
        Car2.acclerateCar();
        Car2.changeGear();
    }
}