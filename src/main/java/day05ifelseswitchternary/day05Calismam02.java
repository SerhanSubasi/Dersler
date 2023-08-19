package day05ifelseswitchternary;

import java.util.Scanner;

public class day05Calismam02 {
    public static void main(String[] args) {


        //Example 2: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün sayısını giriniz");
        byte dayName = input.nextByte();

         if (dayName == 1) {
            System.out.println("Pazar");
        } else if (dayName == 2) {
            System.out.println("Pazartesi");
        } else if (dayName == 3) {
            System.out.println("Salı");
        } else if (dayName == 4) {
            System.out.println("Çarşamba");
        } else if (dayName == 5) {
            System.out.println("Perşembe");
        } else if (dayName == 6) {
            System.out.println("Cuma");
        } else if (dayName == 7) {
            System.out.println("Cumartesi");
        } else {
            System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz");

    }


    }
}
