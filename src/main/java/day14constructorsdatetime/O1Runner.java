package day14constructorsdatetime;

public class O1Runner {
    public static void main(String[] args) {

O1 arac = new O1("Mercedes", "AMG", 2023,"Siyah", false);

        System.out.println(arac.marka);
        System.out.println(arac.model);
        System.out.println(arac.yıl);
        System.out.println(arac.renk);
        System.out.println(arac.hybrid);

        arac.hız();
        arac.fren();


    }
}
