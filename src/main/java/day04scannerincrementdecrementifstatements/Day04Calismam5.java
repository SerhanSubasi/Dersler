package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Day04Calismam5 {
    public static void main(String[] args) {



        byte sayi = 5;
        if (sayi > -1 && sayi <10 ) {
            System.out.println("Rakam");
        }


        short num = 144;
        if (num > 100 && num < 999 ) {
            System.out.println("Sayı üç basamaklıdır");
        }

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayim = input.nextInt();



        if (sayim %2 == 0 ) {
            System.out.println("çift");
        }

        if (sayim %2 != 0 ) {
            System.out.println("tek");
        }



    }
}
