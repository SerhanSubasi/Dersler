package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        /*
Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
         */


Scanner input = new Scanner(System.in);  //class ismi sonrası () kyoarsanız buna constructor deniyor.

        System.out.println("Lütfen adınızı ve soyadınızı giriniz. ");
        String fullName = input.nextLine();    //Kullanıcıdan birden fazla kelimelik bilgi alacaksak nextLine gerekiyor.

        System.out.println("Lütfen yaşınnızı giriniz");
        byte age = input.nextByte();

        System.out.println("Lütfen boyunuzu giriniz");
        float height = input.nextFloat();

        System.out.println("Lütfen kilonuzu giriniz");
        short weight = input.nextShort();

        System.out.println("Lütfen medeni durumunuzu giriniz");
        String maritalStatus = input.next();   //next methodu kullanıcıda tek kelimeli String almak için kullanılır.

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);




    }
}
