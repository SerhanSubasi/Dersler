package day06switchternarystring;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn 4400$ money";
     //Örnek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine çeviriniz.

        String s1 = s.replace("money" , "dollar");
        System.out.println(s1); // "Learn Java earn dollar" oldu.

        //Örnek 2: "s" stringindeki tüm e harflerini siliniz.

       String s2 = s.replace("e", "");
        System.out.println(s2); //Larn Java arn mony


        //Örnek 3: s Stringindeki tüm rakamları (0-9) "*" a çeviriniz.
        //Yani bir grup datayı ifade etmek

        //Regex ifadeler ==> Regular Expression yani düzenli ifadeler Ascii table'daki.
        // ^ ifadesi hariç demek. Bir de büyük yazınca da oluyor bazılarında.
        //Replace all ile yapılır

        String s3 = s.replaceAll("[0-9]" ,"*" );
        System.out.println(s3);     //Learn Java earn ****$ money


 /*
                            Meshur Regex'ler

        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEIOU]
           x, q, w harfleri ==> [xqw]

        8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
        9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

    Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
        Sadece space karakteri : \\s
        Space karakteri haric  : \\S
        Sadece rakamlar        : \\d  (digit ten geliyor)
        Rakamlar haric         : \\D
    */




//örnek 4: "s" String'indeki rakam sayisini bulunuz

        int num= s.replaceAll("[^0-9]","").length();
        System.out.println(num);











    }
}
