package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kısa kenar uzunluğunu giriniz ");
        float shortSide = input.nextFloat();

        System.out.println("Lütfen dikdörtgenin uzun kenar uzunluğunu giriniz ");
        float longSide = input.nextFloat();

        System.out.println("Alan = " + shortSide * longSide );
        System.out.println("Cevre = " + (2*shortSide + 2*longSide));







    }
}
