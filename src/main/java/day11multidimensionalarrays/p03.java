package day11multidimensionalarrays;

import java.util.Arrays;

public class p03 {
    public static void main(String[] args) {


        /*
        Soru 4) Asagidaki multi dimensional array'in
        ic array'lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array'in elemani yapan
        ve yeni array'i ekrana yazdiran bir program yaziniz
        Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
         */

   int Arraycik [] [] = {{1,2,3}, {4,5}, {6, 7} };
int  newArray [] = new int[Arraycik.length];
int sum = 0;
int idx = 0;

        for ( int[] w :  Arraycik ) {
            for ( int k : w ) {
                sum+=k;


            }
            newArray[idx]=sum;


            System.out.println(sum);
            sum=0;

        idx++;
        }
        System.out.println(Arrays.toString(newArray));


    }
}
