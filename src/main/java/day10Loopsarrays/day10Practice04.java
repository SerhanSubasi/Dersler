package day10Loopsarrays;

import java.util.Arrays;

public class day10Practice04 {
    public static void main(String[] args) {

        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3

        int numbers [] = {12, 3, -3, 5, 23 };

        for ( int w  : numbers ) {
            if (w<5){
                System.out.print(w + " ");
            }
        }

        System.out.println();

//Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz

String harf [] = {"K", "C", "R", "A", "S"};

        Arrays.sort(harf);
int result = Arrays.binarySearch(harf, "R");
        System.out.println(result);


        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";
        String words [] = s.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println(words.length);




    }
}
