package day09loops;

import java.util.Scanner;

public class day09Practice03 {
    public static void main(String[] args) {

        //Example 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz


int i =1;
        while (i <=6) {
            System.out.println(i);

            i++;
        }

//Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz

int ş =23;
     while (ş>=12) {
         if (ş%2==0){
             System.out.println(ş);
         }
         ş--;
     }

//Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30         */

Scanner input = new Scanner(System.in);
        System.out.println("Lütfen çarpım tablosunu görmek istediğiniz sayıyı giriniz");
int num = input.nextInt();


int k =1;
while (k<=10) {
    System.out.println(num + " x " + k + " = " + (num*k) );
    k++;
}

//Example 2: Belirli bir tamsayının palindrom olup olmadığını kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int tamSayi = 313;

String sTamSayi = String.valueOf(tamSayi);
String reversed = "";
int n = sTamSayi.length()-1;

while (n>=0){
    reversed = reversed + sTamSayi.charAt(n);
    n--;
}
        System.out.println(reversed);
if (reversed.equals(sTamSayi)) {
    System.out.println("Palindrome");
} else {
    System.out.println("Not Palindrome");
}





    }
}
