package day10Loopsarrays;

import java.util.Arrays;

public class p4 {
    public static void main(String[] args) {

        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3


        int sayi [] = {12, 3, -3, 5, 23};

        for ( int w  : sayi ) {
            if (w<5) {
                System.out.print(w + " ");
            }
        }
        System.out.println();

//Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz

        String harf [] = {"K", "C", "R", "A", "S"};
        Arrays.sort(harf);
        System.out.println(Arrays.toString(harf));

        int result = Arrays.binarySearch(harf, "C");
        System.out.println(result);


//ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s = "Java is easy. Learn Java earn money.";

         String cevap [] = s.split(" ");
        System.out.println(Arrays.toString(cevap));





    }
}
