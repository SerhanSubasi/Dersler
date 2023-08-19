package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Day04Calismam3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen alanını ve çevresini hesaplamak istediğiniz dikdörtgenin kısa kenarını giriniz");
        float shortSide = input.nextFloat();

        System.out.println("Lütfen alanını ve çevresini hesaplamak istediğiniz dikdörtgenin uzun kenarını giriniz");
        float longSide = input.nextFloat();

        System.out.println("Kısa kenar sonucu: " + (shortSide * longSide) );
        System.out.println("Uzun kenar sonucu: " + (2* shortSide + 2* longSide) );

    }
}
