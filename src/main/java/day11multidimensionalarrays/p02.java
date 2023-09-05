package day11multidimensionalarrays;

import java.util.Arrays;

public class p02 {
    public static void main(String[] args) {


        String students [] [] = {   {"Ali", "Ahmet"}, {"Cemal"}, {"Ayhan","Beyhan","Seyhan"}, {"Ceyhan","Kayahan"}  };

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz
        // 2 foreach iç içe ile çözüldü.


        for (    String [] w  : students   ) {
            for (  String   k  :  w  ) {
                if (k.contains("m")){
                    System.out.println(k);
                }
            }

        }

//Example : Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz

        int numbers [] [] = { {5,4},{2,3,2} };

int toplamElemanSayisi = 0;
        for ( int [] w : numbers ) {
                toplamElemanSayisi = toplamElemanSayisi + w.length;
        }

int yeniDizin [] = new int[toplamElemanSayisi];

int idx = 0;
        for ( int [] w :  numbers) {
            for ( int k : w ) {
                yeniDizin[idx] = k;
                idx++;

            }
            System.out.println(Arrays.toString(yeniDizin));
        }

//Example : Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47

 int minimum = ages[0] [0];
 int maximum = ages[0] [0];

        for ( int[] w : ages ) {
            for ( int k : w ) {
                minimum = Math.min(minimum,k);
                maximum = Math.max(maximum,k);
            }
        }

        System.out.println(minimum+maximum);



    }
}
