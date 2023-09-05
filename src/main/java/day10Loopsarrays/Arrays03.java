package day10Loopsarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3


//Arrayleri kısa yoldan nasıl oluşturabiliriz? //new yerine süslü parantez açıp içine yaz
        int numbers [] = {12, 3, -3, 5, 23};

        for ( int w : numbers ) {
            if (w<5) {
                System.out.print(w + " ");
            }
        }
        System.out.println();


//Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
String names [] = {"K", "C", "R", "A", "S"};

//binarySearch() methodu vardır. Çok hızlı arama yapar. sort() ile alfabetik olarak sıralandıktan sonra ortadan aramaya başlar, sağda mı solda mı diye eleyerek.
//binarySearch() ilk kontrolde yarısını eler yani.  Aranılan eleman varsa indexini verecek, yoksa negatif - bir değer verecek o da yok demektir.
// o -'nin yaındaki sayı eğer olsaydı o sırada olurdu demek. (index değil sıra)

        Arrays.sort(names);
        int result = Arrays.binarySearch(names, "R");
        System.out.println(result);


//ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";
        String words [] =  s.split(" ");
        System.out.println(words.length);


    }
}
