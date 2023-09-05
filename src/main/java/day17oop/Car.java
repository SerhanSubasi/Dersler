package day17oop;

public class Car extends Vehicle {
    public Car(){
        super(1000);
        System.out.println("Car 1");
    }
    public Car(String make){
        System.out.println("Car 2");
    }
}
