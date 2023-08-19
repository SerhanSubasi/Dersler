package day06switchternarystring;

public class Ternary02 {
    public static void main(String[] args) {

//Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

int a = 313;
String result =a>99 && a<1000 ? "3 basamaklıdır" : "3 basamaklı değildir";
        System.out.println(result);

a = Math.abs(a);

// String oldu çünkü yazı yazdırıyoruz sonuça.

        //interview question
        /*    Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                       1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
                       2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */

int year = 2023;

      String result4 =  year%100 ==0 ?  year%400==0 ? "leap" : "Not Leap" : year%4==0 ? "Year" : "Not Leap";
        System.out.println(result4);



//Nested kullanmadan yapma şansı varsa öyle yap, yoksa mecbur nested.


    }
}
