package day14constructorsdatetime;

public class U1 {


    String marka = "Honda";
    String model = "Civic";
    String renk = "Beyaz";
    int yıl = 2015;
    boolean hybrid = true;

    public void hız () {
        System.out.println("Oldukça hızlıdır");
    }
    public void fren () {
        System.out.println("Genellikle durur");
    }



    public U1 (String marka, String model, String renk, int yıl, boolean hybrid) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yıl = yıl;
        this.hybrid = hybrid;

    }
}
