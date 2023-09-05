package day10Loopsarrays;

import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {

        // int harf [] = {12, 3, -3, 5, 23};
/*
        String isim [] = new String[3];

        isim [0] = "Serhan";
        isim [1] = "Yusuf";
        isim [2] = "Zeki";

        System.out.println(Arrays.toString(isim));
        System.out.println(isim);
*/

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        // icerdigi karakter sayilari toplamini ekrana yazdirin.

    String sehir [] = new String[5];

    sehir [0] = "Antalya";
    sehir [1] = "Ankara";
    sehir [2] = "İstanbul";
    sehir [3] = "İzmir";
    sehir [4] = "Isparta";

     int total = 0;
        for (int i = 0; i < sehir.length; i++) {
            total = total + sehir[i].length();
        }
        System.out.println(total);





    }
}
