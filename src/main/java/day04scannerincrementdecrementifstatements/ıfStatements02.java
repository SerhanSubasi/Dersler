package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class ıfStatements02 {
    public static void main(String[] args) {

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num = input.nextInt();

//1.yol:

        if (num % 2 == 0) {
            System.out.println("Cift sayi...");
        }

        if (num % 2 != 0) {
            System.out.println("Tek sayi...");
        }

//2.yol
//if else statements

        if (num % 2 == 0) {
            System.out.println("Çift sayı");
        } else {
            System.out.println("Tek sayı");
            //false olursa da burası çalışıyor.
        }

        //if else'de bir yer çalışırsa kalanı çalışmaz. Haliyle if else kullanmak memorye yararlı.
    }
}
