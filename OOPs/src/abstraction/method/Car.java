package abstraction.method;

public abstract class Car {
    Car(){
        System.out.println("Car is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear is changed");
    }
}
class Bmw extends Car{
    void run(){
        System.out.println("Running safely");
    }
}
class TestCar{
    public static void main(String[] args) {
        Car c = new Bmw();

        c.run();
        c.changeGear();
    }
}