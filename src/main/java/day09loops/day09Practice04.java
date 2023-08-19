package day09loops;

import java.util.Scanner;

public class day09Practice04 {
    public static void main(String [] args) {

       int i =5;

       do {
           System.out.print(i);
           i--;
       } while (i>=1);

        System.out.println();

       int k = 2;
       do {
           System.out.print(k);

           k++;
       } while (k<=9);


/*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */

        Scanner input = new Scanner(System.in);



//int g = num;
        System.out.println();
do {
    System.out.println("Lütfen bir tam sayı giriniz");
    int num = input.nextInt();

    if (num>=100) {
        System.out.println("Harika!");
    } else {
        System.out.println("Kaybettiniz");
        break;
    }


} while (true);








    }
}
