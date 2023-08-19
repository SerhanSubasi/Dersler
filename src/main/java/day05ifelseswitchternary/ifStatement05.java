package day05ifelseswitchternary;

import java.util.Scanner;

public class ifStatement05 {
    public static void main(String[] args) {

        /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
               Eger calisan kadin ise;
                60 yasindan buyukse "Emekli Olabilir "yazdirin
               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */

// Nested if iç içe girmiş if demek.
        // Dışarıdaki ilk if outer if, içerideki if inner if.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi giriniz");
        String gender = input.next();

        System.out.println("Lütfen yaşınızı giriniz");
        int age = input.nextInt();

        if (age <0 || age>120){
            System.out.println("Lütfen yaşı 0 ile 120 arasında giriniz");
        } else if (gender.equalsIgnoreCase("Kadın")) {
if (age >60) {
    System.out.println("Emekli olabilir");
} else {
    System.out.println("Çalışmalı");
}
        } else if (gender.equalsIgnoreCase("Erkek")) {
            if (age >65) {
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("Kesinlikle Çalışmalı");
            }
        } else {
            System.out.println("Tanımlı değil");
        }

// Bu nested yapının kullanılması tavsiye edilmiyor. Farklı şekilde çözülüyorsa öyle çözün if else ile.

    }
}
