package day03wrapperconcatenationoperators;

public class Concatenation {

    public static void main(String[] args) {

        //Ornek : Bir String ve iki integer variable olusturun. String degeri ile Integer larin toplamini console yazdirin

        String s = "elma";

        int a = 10;
        int b = 11;
        System.out.println(s + a + b);   //elma1011
        System.out.println(s + a * b);   //elma110 çünkü işlem önceliği var ve JAVA'nın matematiği çok iyi
        System.out.println(s + (a + b)); //elma21  önce parantez içini yaptı.
        System.out.println(a + b + s);   //21elma
        System.out.println(a + s + b);   //10elma11

        //JAVA'da "+" sembolü iki sayı arasında kullanılırsa "toplama işlemi" olur.
        //JAVA'da "+" sembolü iki String veya bir String bir sayı arasında kullanılırsa "Concatenation" işlemi olur.
        //Concatenation birleştirme demektir.
        //JAVA bu concateniaton işlemlerinde matematiksel işlem önceliğine dikkat eder.

        /*
         MATEMATİKTE İŞLEM ÖNCELİĞİ
        1) Önce üslü sayılar yapılır.
        2) Parantez içi
        3) Çarpma ve Bölmeler yapılır
        4) Toplama ve Çıkarmalar yapılır
        5) Aynı öncelikli olanlarda soldan sağa başlanır.
         */


    }
}
