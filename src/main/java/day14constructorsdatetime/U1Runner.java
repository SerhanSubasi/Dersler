package day14constructorsdatetime;

public class U1Runner {
    public static void main(String[] args) {

U1 arac = new U1("Ferrari", "SF22","Kırmızı", 2022, false);     //constructor
        System.out.println(arac.marka);
        System.out.println(arac.model);
        System.out.println(arac.renk);
        System.out.println(arac.yıl);
        System.out.println(arac.hybrid);

        arac.hız();
        arac.fren();

        System.out.println();

U1 arac2 = new U1("Mercedes", "Amg", "Siyah", 2023, true);
        System.out.println(arac.marka);
        System.out.println(arac.model);
        System.out.println(arac.renk);
        System.out.println(arac.yıl);
        System.out.println(arac.hybrid);


    }
}
