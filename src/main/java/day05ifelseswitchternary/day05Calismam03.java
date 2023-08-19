package day05ifelseswitchternary;

import java.util.Scanner;

public class day05Calismam03 {
    public static void main(String[] args) {

        /*
             Example 3:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sınıflandırmasını öğrenmek istediğiniz yaşı giriniz");
        byte num = input.nextByte();

        if (num <0) {
            System.out.println("Lütfen geçerli bir yaş giriniz");
        } else if (num<5) {
            System.out.println("bebek");
        } else if (num<13) {
            System.out.println("cocuk");
        } else if (num <21) {
            System.out.println("genc");
        } else if (num <31) {
            System.out.println("yetiskin");
        } else {
            System.out.println("Tanimlanmamis");
        }



    }
}
