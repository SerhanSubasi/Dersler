package day11multidimensionalarrays;

import java.util.Arrays;

public class day11Practice03 {
    public static void main(String[] args) {

        //Example : Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        // int numbers [] [] = { {5,4},{2,3,2} }; ==> { 5,4,2,3,2 }
        int numbers[][] = {{5, 4}, {2, 3, 2}};
        int toplamElemanSayisi = 0;

        for (int[] w : numbers) {
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        System.out.println(toplamElemanSayisi);

       int tekArray [] = new int[toplamElemanSayisi];

       int idx = 0;

        for ( int [] w : numbers ) {
            for ( int k : w ) {
                tekArray [idx]=k;

                idx++;
            }
        }
        System.out.println(Arrays.toString(tekArray));


    }
}
