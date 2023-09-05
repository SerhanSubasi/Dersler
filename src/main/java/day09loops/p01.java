package day09loops;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {

     /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....
    */

        for (int i = 1; i <=6 ; i++) {
            System.out.println("Serhan :" + i);

            for (int j = 1; j <=5 ; j++) {
                System.out.println("Yusuf :" + j);
            }
        }


 /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satır (row) sayısını giriniz");
        int row = input.nextInt();
        System.out.println("Lütfen sütun (column) sayısını giriniz");
        int column = input.nextInt();


        for (int i = 0; i <= row ; i++) {
            for (int j = 0; j <=column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

 */

//Example : verilen sayıda ondalık kısımdaki rakamların toplamını bulun
        //            28.587 ==> 5+8+7=20


double number = 28.587;
        String sNum = String.valueOf(number);
String decimalPart = sNum.split("[.]") [1];
int decimalNumber = Integer.valueOf(decimalPart);

int num = 0;
        for (int i = decimalNumber; i >0 ; i=i/10) {
            num = num + i%10;
        }
        System.out.println(num);







/*
        double sayi = 34.567;
        String sSayi = String.valueOf(sayi);
        String decimalString = sSayi.split("[.]") [1] ;
        int osman = Integer.valueOf(decimalString);
int aga = 0;

        for (int i = osman; i >0 ; i=i/10) {
            aga = aga +i%10;
        }
        System.out.println(aga);
 */







 double ali = 56.789;
 String ayse = String.valueOf(ali);
 String hakki = ayse.split("[.]") [1];
 int fatma = Integer.valueOf(hakki);

 int y = 0;

        for (int i = fatma; i >0 ; i=i/10) {
            y = y + i%10;
        }
        System.out.println(y);
/*
 int i = 3;

 while (i<=5){
     System.out.println(i);
     i++;
 }
  */
/*
int i = 23;
while (i>= 12){
    if (i%2==0) {
        System.out.println(i);
    }

    i--;
}
*/

        System.out.println();

/*
//35-18 çiftler
int h=35;
while (h>=18){
    if (h%2==0){
        System.out.println(h);
    }

    h--;
}
*/

//Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30         */
/*
Scanner input = new Scanner(System.in);
System.out.println("Lütfen çarpımını görmek istediğiniz rakamı giriniz");
int rakam = input.nextInt();

int i =1;

while (i<=10){
    System.out.println(rakam + "x " + i + "= " + rakam*i);

    i++;
}
*/






/*

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen çarpımını görmek istediğiniz rakamı giriniz");
        int rakam = input.nextInt();


int i=1;

while (i<=10){
    System.out.println(rakam + "x " + i + "= " + rakam*i);

    i++;
}
*/
//Example 2: Belirli bir tamsayının palindrom olup olmadığını kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121        123321 <==> 123321

/*
 int h = 414;
String sh = String.valueOf(h);
String bos = "";

int u = sh.length() -1;
while (u>=0) {

bos = bos + sh.charAt(u);

    u--;
}

if (sh.equals(bos)) {
    System.out.println("Palindrom");
} else {
    System.out.println("Not Palindrom");
}
*/

int x = 212;
String c = String.valueOf(x);
String bos2 = "";

int r = c.length() -1;
while (r>=0) {
    bos2 = bos2 + c.charAt(r);

    r--;
}

if (c.equals(bos2)) {
    System.out.println("Palindrom");
} else {
    System.out.println("Not Palindrom");
}

        System.out.println();

/*
        başlangıç değeri

        do {
        çalışacak kodlar
        arttırma azaltma
        } while (loop çalışma kuralı);

         */

        int o = 25;
do {
    if (o%2==0){
        System.out.println(o);
    }

    o--;
} while (o>=7);

/*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */

Scanner input = new Scanner(System.in);

do {
    System.out.println("Lütfen bir sayı giriniz");
    int num2 = input.nextInt();
   if (num2>=100){
       System.out.println("Kazandınız");

   } else {
       System.out.println("Kaybettiniz");
       break;
   }
} while (true);







    }
}
