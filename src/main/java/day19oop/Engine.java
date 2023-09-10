package day19oop;

public interface Engine {

    void run();
    int price= 3000;

    static void stop () {   //bu bizim static
        System.out.println("Stops securley");
    }
}
