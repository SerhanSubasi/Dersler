package day05ifelseswitchternary;

import java.util.Scanner;

public class day05Calismam01 {
    public static void main(String[] args) {

        //Example 1: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num = input.nextInt();

        if (num <0 ){
            System.out.println("Negatif");
        } else if (num == 0) {
            System.out.println("Nötr");
        } else {
            System.out.println("Pozitif");
        }
    }
}
