package day21maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Maps03 {
    public static void main(String[] args) {

        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

String s = "I like you, like like!";

//Stringimizde bulunan tüm noktalama işaretlerinden kurtulalım.

      s =  s.replaceAll("\\p{Punct}","");
        System.out.println(s);  // I like you like like

// Kelimelerle çalışacağımız için split(" ") kullanmalıyız.
       String words [] = s.split(" ");      // array yaptık çünkü bölünce 5 string oldu.

        System.out.println(Arrays.toString(words)); // [I, like, you, like, like]

        //words arrayindeki kelimeler birer birer Mapte var mı yok mu diye kontrol edilecek.
        // words arrayindeki kelimeler Mapte yok ise, Map'e value'su 1 olarak yerleştirilecek.
        // words arrayindeki kelimeler Mapte var ise, Map'e valuesu 1 artırılarak yerleştirilecek.

        HashMap<String, Integer> occ = new HashMap<>();

        for ( String  w : words ) {
           Integer nummOffOccurance =  occ.get(w);     // Get methodu bize var ise değeri (value) getirir, yoksa null verir.

            if (nummOffOccurance == null) {
                occ.put(w,1);
            } else {
                occ.replace(w,nummOffOccurance +1);
            }

        }
        System.out.println(occ);    // {like=3, I=1, you=1}

/*

HashMap ile HashTable arasındaki fark nedir?
1) HashMap thread-safe (birden fazla iş) ve synchronized değildir, HashTable thread-safe ve synchronized'dır.
2) HashMap bir tane null key'e ve istediğiniz kadar null value'ya müsade eder.
    HashTable keylerde ve valuelarda null kullanılmasına müsade etmez.
3)  HashMap hızlıdır, HastTable HashMap'e göre yavaştır.

Not: HashMapler ve Hashtablelar entryleri rastgele (random) sıralar.
 */

        Hashtable <String, Integer> ogrenciNotlari = new Hashtable<>();
        ogrenciNotlari.put("Selma", 70);
        ogrenciNotlari.put("Tuba", 75);
        ogrenciNotlari.put("Ibrahim", 85);
        ogrenciNotlari.put("Safa", 100);

        // ogrenciNotlari.put(null,50);         HashTablelarda key kısmına null konulamaz.
       // ogrenciNotlari.put("Ahmet", null);    HashTablelarda value kısmına da null konulamaz.

       /*
       HashTable ne zaman kullanmalıyız?
       1) multithread ve synchronization kullanmamız gerekirse
       2) keylerde ve valuelarda null kullanmak yasak ise kullanabiliriz.

              */
        HashMap<String,Integer> stdAges = new HashMap<>();

        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Tom", 33);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet",41);
        stdAges.put(null,41);   // null ekledi HashMap
        stdAges.put(null,39);   // ancak bir kere ekler, yenisini override eder üzerine yazar.
        stdAges.put("a",null);  // Ancak istediğimiz kadar null vallue'a izin veriyor.
        stdAges.put("b",null);  // Ancak istediğimiz kadar null vallue'a izin veriyor.
        stdAges.put("c",null);  // Ancak istediğimiz kadar null vallue'a izin veriyor.

        System.out.println(stdAges);   // {null=39, Can=19, Ahmet=41, a=null, b=null, Tom=33, c=null, Veli=63, Ali=18}


        /*
        1) TreeMapler entryleri natural order'a göre sıraya dizeler, düzen hastasıdırlar. Bu yüzden çook yavaştır.
        2) Treemapler  thread-safe (birden fazla iş) ve synchronized değildir.
        3) Treemaplerin keylerinde null kullanılamaz, ama valuelerinde istediğiniz kadar kullanabilirsiniz.
        4) TreeMapler key'e bakarak sıralama yaparlar. Bu yüzden key'de null olamıyor.

         */


        TreeMap<String, Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany",83000000);     // put yapısı var add yerine.
        countryPopulation.put("Albania",30000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Türkiye",85000000);
        countryPopulation.put("Netherland",18000000);
       //  countryPopulation.put(null,18000000); HATA VERİR.
        countryPopulation.put("Italy",null);
        countryPopulation.put("France",null);
        System.out.println(countryPopulation);  // {Albania=30000000, France=null, Germany=83000000, Italy=null, Netherland=18000000, Türkiye=85000000, USA=400000000}




    }
}
