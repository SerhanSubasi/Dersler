package day03wrapperconcatenationoperators;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        int level=5, yas=20, maas=16000;


        char harf = 's';
        short yasim = 29;
        int maasBen = 16500;

        System.out.println(harf);
        System.out.println(yasim);
        System.out.println(maasBen);

        String isim = "Mehmet";
        String soyisim = "Bulutluoz";

        System.out.println(isim);
        System.out.println(soyisim);

        byte sayi = 33;
        int sayi2 = 44;

        System.out.println(sayi+sayi2);

        short tamsayi = 14;
        float ondalikli = 5.5F;

        System.out.println(tamsayi+ondalikli);

        char denemeChar = '#';
        System.out.println(denemeChar);

        char degiskenKarakter = '+';
        short degiskenTamSayi = 47;

        System.out.println(degiskenTamSayi+degiskenKarakter);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100'den kücük pozitif iki tam sayi giriniz ");

        byte num1 = scan.nextByte();
        byte num2 = scan.nextByte();

        scan.nextByte();


        System.out.println(num1);
        System.out.println(num2);



    }
}
