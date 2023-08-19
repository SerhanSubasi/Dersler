package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Day04Calismam2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 4 işlemini görmek istediğiniz 2 adet sayı giriniz");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Toplama İşlemi Sonucu : " + (num1 + num2) );
        System.out.println("Çıkarma İşlemi Sonucu : " + (num1 - num2) );
        System.out.println("Çarpma İşlemi Sonucu : " + (num1 * num2) );
        System.out.println("Bölme İşlemi Sonucu : " + (num1 / num2) );


    }
}
