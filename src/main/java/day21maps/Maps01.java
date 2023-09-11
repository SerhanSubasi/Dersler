package day21maps;

import java.util.*;

public class Maps01 {
    public static void main(String[] args) {


 /*


     1)  Maplerde sözlüklerdeki gibi kelime ve manası şeklinde bir kullanım vardır.
     2) Key kısmı tekrarsız, value kısmı tekrarlı olabilir.
     3) Maplerdeki her bir elemana entry denir, tamamına da EntrySet denir.
     4) Entryler tekrarsız olduğu için EntrySet denilir.
     5) Mapler collection DEĞİLDİR.
     6) HashMap'ler entryleri rastgele sıralar, bu yüzden en hızlı maptir.


  */

// Map nasıl oluşturulur?

        // 2 data dype gireceğiz şimdi Key ve Value şeklinde. Wrapper olmalıdır.
        HashMap<String,Integer> countryPopulation = new HashMap<String, Integer>();

        countryPopulation.put("Germany",83000000);     // put yapısı var add yerine.
        countryPopulation.put("Albania",30000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Türkiye",85000000);
        countryPopulation.put("Netherland",18000000);

        System.out.println(countryPopulation);

Integer usaPopulation = countryPopulation.get("USA");  //get methodu her zaman KEY ile çalışır ve VALUE verir. Sondakinin tipine koymalısın.
        System.out.println(usaPopulation);  // 400000000

Set<String> keys =  countryPopulation.keySet();     // Tüm keyleri getirir. String değer girilir haliyle ççünü keyler String olur.
        System.out.println(keys);


       // Bütün valueları nasıl alabiliriz?

         Collection <Integer> values = countryPopulation.values();  // Tüm valueleri verir.
        System.out.println(values);

        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamsi nedir?

int sum=0;

        for ( Integer  w : values ) {
            sum += w;
        }

        System.out.println(sum / values.size());

// Looplar mapler ile kullanılamaz, bunun için entrySet methodunu kullanırız.
        // entrySet () Method'u mapteki entryleri kalıp halinde (2'li) alıp, bize Seti'in içine koyarak verir ki loop kullanabilelim.

            Set < Map.Entry <String, Integer > >  entries = countryPopulation.entrySet();  // Bu defa içine entryler koyduk, Nap.Entry <> ile .
        System.out.println(entries);  // [Netherland=18000000, USA=400000000, Türkiye=85000000, Germany=83000000, Albania=30000000]



        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.

int toplam = 0;

        for (  Map.Entry <String, Integer > w : entries ) {
            toplam += w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);



    }
}
