package day11multidimensionalarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {

//Example : Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
// int numbers [] [] = { {5,4},{2,3,2} }; ==> { 5,4,2,3,2 }
int numbers [] [] = { {5,4},{2,3,2} };

//1. Step : iki boyutlu arrayde kaç eleman alduğunu bulan kodu oluşturmalıyız.
int toplamElamansayisi =0;
        for (  int []  w  :  numbers   ) {
            toplamElamansayisi = toplamElamansayisi+ w.length;
        }
        System.out.println(toplamElamansayisi);

//2.Step : Tek boyutlu arrayi iki boyutlu arrayin eleman sayısını kullanarak oluşturabiliriz.

        int newArr [] = new int[toplamElamansayisi];

//3. Step: İki boyutlu arraydeki elemanları tek boyutlu arraye transfer etmeliyiz.
int idx= 0;
        for ( int []  w : numbers ) {
            for ( int k : w ) {
                newArr[idx]=k;

                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));



    }
}
