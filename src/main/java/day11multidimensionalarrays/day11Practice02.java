package day11multidimensionalarrays;

import java.util.Arrays;

public class day11Practice02 {
    public static void main(String[] args) {

// Bir arrayin elemanları eğer array ise, bu arrayler multidimension arrays olarak adlandırılır.

// MultiDimensional array nasıl oluşturulur?
        int a[][] = new int[3][2];        // [ [0,0], [0,0], [0,0] ]

//MultiDimensional Arraylere nasıl eleman eklenir?
        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;

//MultiDimensional array konsola nasıl yazdırılır.
        System.out.println(Arrays.deepToString(a));
//MultiDimensional Array'den specific bir eleman nasıl yazdırılır?
        System.out.println(a[1][0]);
        System.out.println(Arrays.toString(a[1]));

//Kısa yoldan MultiDimensional array nasıl oluşturulur?

        String student[][] = {{"Ali", "Ahmet"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

//Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        int total = 0;

        for (String[] w : student) {
            total = total + w.length;
        }
        System.out.println(total);

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz

        for ( String [] w : student ) {
            for ( String k : w ) {
               if (k.contains("m")) {
                   System.out.println(k);
                }
            }
        }

    }
}
