package day19oop;

public class Hondarunner {

    public static void main(String[] args) {

       Civic myCivic = new Civic();
        myCivic.cool();

        Accord yourAccord = new Accord();
        yourAccord.cool();

        System.out.println(Ac.price);
        System.out.println(Engine.price);   // hepsinde price değeri var ama karışmıyor.
        System.out.println(Security.price);

        myCivic.eco();
        Engine.stop();

    }


}
