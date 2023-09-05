package day11multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {


    // Bir arrayin elemanları eğer array ise, bu arrayler multidimension arrays olarak adlandırılır.

    // MultiDimensional array nasıl oluşturulur?

    int a [] [] = new int[3][2]; // [ [0,0], [0,0], [0,0] ]

//MultiDimensional Arraylere nasıl eleman eklenir?
        a [0] [0] = 5;
        a [1] [1] = 45;
        a [2] [0] = 123;
        a [0] [1] = 12;
        a [1] [0] = 81;
        a [2] [1] = 0;

//MultiDimensional array konsola nasıl yazdırılır.
        System.out.println(Arrays.deepToString(a));     //Arrays.deepToString ile.

//MultiDimensional Array'den specific bir eleman nasıl yazdırılır?

        System.out.println(a[1] [0]);   // 81

        System.out.println(Arrays.toString(a[1]));  //  [81,45]    toString ile dıştaki arrayi yazdırdık.

        System.out.println(Arrays.deepToString(a));     //      Arrays.deepToString ile de tamamını yazdırmıştık



      // Kısa yoldan MultiDimensional array nasıl oluşturulur?

      String students [] [] = {   {"Ali", "Ahmet"}, {"Cemal"}, {"Ayhan","Beyhan","Seyhan"}, {"Ceyhan","Kayahan"}  };

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        int sum =0;     //Birikecek kavanoz hazırladık

        for ( String [] w : students ) {        // yüklenecek data String Array olduğu için String [] oldu.
          sum = sum +  w.length;
        }
        System.out.println(sum);

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz
        // 2 foreach iç içe ile çözüldü.

        for ( String [] w : students ) {

            for ( String k : w ) {       //Artık String array'in elemanlarını incelediğimiz için String oldu
                if (k.contains("m")) {
                    System.out.println(k);
                }
            }
        }















    }
}
