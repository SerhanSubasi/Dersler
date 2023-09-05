package day08loops;

public class p01 {
    public static void main(String[] args) {


        for (int i = 11; i <=14 ; i++) {
            System.out.println(i);
        }

// 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 40; i >=23 ; i--) {
            if (i%2==0) {
                System.out.println(i);
            }
        }

//Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"

        String isim = "I Love Java";

        for (int i = 0; i < isim.length(); i++) {
            char ch = isim.charAt(i);

            if (ch == 'a'){
                break;
            }
            System.out.print(ch);
        }
        System.out.println();

      String s = "Galatasaray";     //latasar yazmalı
        String newCh = "";
        for (int i =10 ; i < s.length(); i++) {
         String newS = s.replace("a" , "");
            System.out.println(newS);
           }


//example 2 :Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        System.out.println();

String ps = "Pwd12?Ab";



        for (int i = 0; i < ps.length(); i++) {
          char ts = ps.charAt(i);
            if (ts >= 'a' && ts <= 'z') {
                continue;
            } else {
                System.out.print(ts);
            }
        }

        System.out.println();

//example 3  Bir String'i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        String s3 = "traS";
        String s4 = "";

        for (int i = s3.length()-1; i >=0 ; i--) {
           s4 = s4 + s3.charAt(i);
        }
        System.out.println(s4);

        System.out.println();

//Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //1071 ==> 1+0+7+1 = 9
    int sum = 0;
        for (int i = 1071; i >0 ; i=i/10) {
            sum = sum + i%10;
        }
        System.out.println(sum);


// Bir stringteki tekrarsiz karakterleri veren kodu yaziniz
        //          mehmet ==> ht

        String name = "Salamura";
        String essiz = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (name.indexOf(ch) == name.lastIndexOf(ch) ){
                essiz = essiz + ch;
            }
        }

        System.out.println(essiz);


        System.out.println();

        String name2 = "masa";
        String benzersiz = "";
        for (int i = 0; i < name2.length(); i++) {
            char ch1 = name2.charAt(i);
            if (name2.indexOf(ch1) == name2.lastIndexOf(ch1)) {
                benzersiz = benzersiz + ch1;
            }
        }
        System.out.println(benzersiz);

        System.out.println();

        //Example 1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26

int toplam = 0;

        for (int i = 5; i <=8 ; i++) {
           toplam = toplam + i;
        }

        System.out.println(toplam);

        System.out.println();


    int total = 1;
        for (int i = 3; i <=9; i++) {
            total = total * i;
        }
        System.out.println(total);







    }
}
