package day05ifelseswitchternary;

import java.util.Scanner;

public class day05Calismam05 {
    public static void main(String[] args) {

        /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
               Eger calisan kadin ise;
                60 yasindan buyukse "Emekli Olabilir "yazdirin
               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int age = input.nextInt();
        System.out.println("Lütfen cinsiyetinizi giriniz");
        String gender = input.next();

        if (age <0 || age>120) {
            System.out.println("Lütfen geçerli bir yaş aralığı giriniz, böyle insan mı olur yahu?");
        } else if (gender.equalsIgnoreCase("kadın")) {
            if (age > 60) {
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("Çalışmalı");
            }

        } else if (gender.equalsIgnoreCase("Erkek")) {
                if (age >65) {
                    System.out.println("Dinlenme vakti bro");
                } else {
                    System.out.println("Çalışmalısın");
                }
            }








    }
}
