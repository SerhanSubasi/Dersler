package day03wrapperconcatenationoperators;

public class Operators {
    public static void main(String[] args) {

        /*
        1) +,-,*,/ işlemleri JAVA da Matematikte kullanıldığı gibi kullanılır.
        Note1: JAVA'da bir tam sayıyı başka bir tam sayıya bölerseniz sonuç her zaman tam sayı olur.
        note2: Eğer sonuç tam sayı değilse java sonucun ondalık kısmını iptal ederek onu int'e dönüştürür.
        Note3: Bir Matematiksel işlemde farklı data tiplerini kullanırsanız sonuç her zaman büyük data tipinde olur.

         */

        int kisiSayisi = 10;
        int paraMiktari = 25;

        System.out.println(paraMiktari / kisiSayisi); //2


        int ogrenciSayisi = 10;
        double ucretMiktari = 25;
        System.out.println(ucretMiktari / ogrenciSayisi); //2.5



        /*
        2) JAVA'da logical operatorlar (Mantıksal) de vardır. "AND" ve "OR"


            CAY     AND     KAHVE       SONUC
            true    &&      false       false
            false   &&      true        false
            false   &&      false       false
            true    &&      true        true


        Note: AND (&&) işleminden true alabilmek için her şey true olmalıdır.
        AND işlemi "perfectionist"tir. 1 tane bile "false" sonucu "false" yapar.



            CAY     OR      KAHVE       SONUC
            true    ||      false       true
            false   ||      true        true
            false   ||      false       false
            true    ||      true        true

        Note: OR (||) işleminde bir tane "true" sonucu "true" yapmaya yeterlidir.
        OR işleminde sonucun false olabilmesi için her şey false olmalıdır.


        3) NOT Operatoru (!) true olanı false, false olanı true yapar.

        !true ==> false
        !false ==> true
        !!true ==> true


        4) Comparison (Karşılaştırma) Operators
        <,>,<=,>=, ==, !=
        (JAVA'da eşittir "==" demek, eşit değildir "!=" demek.)

        Note: Karşılaştırma operatorlerini kullandığımızda sonuç kesinlikle "boolean" (true, false) olur.

        boolean first = 3 < 5;          //true
        boolean second = 2 + 3 != 5;    //false
        boolean third = 2 + 3 * 5 >= 19;//false

        System.out.println(first && second );//false
        System.out.println(first || second || third );//true




        */





    }
}
