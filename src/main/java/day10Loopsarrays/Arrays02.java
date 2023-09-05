package day10Loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

int ages [] = new int[6];
        ages [0] = 20;
        ages [1] = 23;
        ages [2] = 19;
        ages [3] = 44;
        ages [4] = 15;
        ages [5] = 32;

        System.out.println(Arrays.toString(ages));

//1. yol
Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

//Note : sort() methodu sayısal data typelarını küçükten büyüye sıralar. (ascendign order)
//Note 2:   sort() methodu String data typelarını alfabetik sıralar (alphabetical order)
//Note 3:  (ascendign order) + (alphabetical order) = Natural order
//Note: sort() methodu Array elemanlarını natural order'a göre sıralar.

        System.out.println(ages[0] + ages[ages.length - 1]);


//2.yol
        int minimum = ages[0]; //ages[0] koymazsan  sadece 0 koyarsan 0 ile kıyaslar ve sonuc 0 çıkar. o yüzden array içinden index sayısı koyduk. 1,2, 3 vsden de başlayabilirdi.
        int maximum = ages[0];


        for (int w : ages ) {
  minimum = Math.min(minimum,w);        //math.min bize minimumu verir her zaman. w ile kıyasladığımız için w de girdik.
  maximum = Math.max(maximum,w);
}
        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(maximum+minimum);







    }
}
