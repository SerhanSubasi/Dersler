package day17oop;
public class Honda extends Car {
    public Honda(){
        super("Accord");    //Birden fazla parametreli constructor varsa super içine girerek seçtireceksin.
        System.out.println("Honda 1");
    }
    public Honda(String model, int year){
        System.out.println("Honda 2");
    }


}