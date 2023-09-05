package day14constructorsdatetime;

public class O1 {

    String marka = "Mercedes";
    String model = "AMG";
    int yıl = 2023;
    String renk = "Siyah";
    boolean hybrid = false;

    public void hız (){
        System.out.println("Oldukça hızlı");
    }

    public void fren () {
        System.out.println("Tertemiz durur");
    }

    public O1 (String marka, String model, int yıl, String renk, boolean hybrid) {
        this.marka = marka;
        this.model = model;
        this.yıl = yıl;
        this.renk = renk;
        this.hybrid = hybrid;

    }





}
