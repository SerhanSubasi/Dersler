package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123


Scanner input = new Scanner(System.in);
        System.out.println( "Lütfen 5 basamaklı bir sayı giriniz");
        int num = input.nextInt();

        //1 tam sayıyı 1000'e bölersek son 3 basamağı silmiş oluruz.
        int firstTwo = num/1000;

        // "%" ==> modulus operator solunda bulunan sayinin sağında bulunan sayıya bölümünden kalani verir.
        // yani %10 her zaman bize birler basamağında bulunan sayıyı verir, 100 ise onlar basamağını verir.

        int lastTwo = num%100;

        System.out.println("ilk iki ve son iki hanenin sonucu: " + (firstTwo + lastTwo));











    }
}
