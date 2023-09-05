package day11multidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]


int a [] = {0, 2, 3, 0, 12, 0};

int b [] = new int[a.length];  //[0,0,0,0,0,0,]   //a'nın uzunluğunu kadar yer açıldı.

        int idx =0;     //index değerini girdik her defasında artacak ki üzerine yazmasın

        for (  int w : a ) {

            if (w!=0) {

                b[idx]=w;

                idx++;      // artırmanın if içerisinde olmasının sebebi 0'a eşitse false gelirse artırmasın ki yan yana yazsın.
        }
            }

        System.out.println(Arrays.toString(b));

//Arraylerin eşit olup olmadığı nasıl anlaşılır?
        int arr [] = new int[3];
        arr[0]=2;
        arr[1]=1;
        arr[2]=3;


        int brr [] = new int[3];
        brr[0]=2;
        brr[1]=3;
        brr[2]=1;

// iki arrayin aynı olabilmesi için aynı indexte aynı elemanların bulunması gerekir, aynı yerde oturacaklar.
        boolean result = Arrays.equals(arr,brr);
        System.out.println("result = " + result);




    }
}
