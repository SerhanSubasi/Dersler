package day05ifelseswitchternary;

import java.util.Scanner;

public class ifStatement01 {
    public static void main(String[] args) {

        //Example 1: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num = input.nextInt();
if (num>0) {
    System.out.println("Pozitif");
} else if (num<0){
    System.out.println("Negatif");
} else {
    System.out.println("Notr");
}

//if else'den istediğin kadar oluşturabilirsin.















    }
}
