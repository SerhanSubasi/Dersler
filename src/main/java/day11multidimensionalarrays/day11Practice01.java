package day11multidimensionalarrays;

import java.util.Arrays;

public class day11Practice01 {
    public static void main(String[] args) {


        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int a [] = {0, 2, 3, 0, 12, 0};
        int b [] = new int[a.length];               //[0,0,0,0,0,0,] a'nın uzunluğu kadar yer açıldı.

int idx=0;                                          //index değerini girdik her defasında artacak ki üzerine yazmasın

        for ( int w : a ) {
            if (w!=0) {
                b[idx]=w;

                idx++;                              //artırmanın if içerisinde olmasının sebebi 0'a eşitse false gelirse artırmasın ki yan yana yazsın.
            }

        }

        System.out.println(Arrays.toString(b));



    }
}
