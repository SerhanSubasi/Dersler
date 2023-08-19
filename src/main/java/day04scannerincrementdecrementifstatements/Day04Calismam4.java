package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Day04Calismam4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk iki ve son iki hanesindeki sayıların toplanmasını istediğiniz 5 basamaklı bir sayı giriniz");
        int besBasamakliSayi = input.nextInt();

        // Not: Herhangi bir tam sayıyı 1000'e bölersek son 3 basamağı silmiş oluruz.
        // Not: "%" ==> modulus operator solunda bulunan sayinin sağında bulunan sayıya bölümünden kalani verir.
        // Not: Yani %10 her zaman bize birler basamağında bulunan sayıyı verir, 100 ise onlar basamağını verir.

        int firstTwo = besBasamakliSayi/1000;
        int lastTwo = besBasamakliSayi %100;

        System.out.println("Cevabınız: " + (firstTwo + lastTwo) );










    }
}
