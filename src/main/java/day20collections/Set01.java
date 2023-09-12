package day20collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {



// Set demek unique demektir, eşsiz tekrarsızdır. mesela datadaki mail adresleri set ile alınır ikincisi yoktur.

/*

HashSet: Elemanları rasgele sıralar. Bu yüzden çok hızlı çalışır.
LinkedHashSet: Elemanları girilen sıraya göre sıralarlar. Hash setlere göre bir tık daha yavaştır.
TreeSet: Elemanları Natural Order ile dizer.  Çok titizlerdir bu yüzden baya yavaşlardır.

1) Setler tekrarsız eleman (unique) depolamak için kullanılırlar.
2) 3 tane Set Class'ı vardır.
       a) HashSet Class
         Hash benzersiz id oluşturma tekniğidir. Bu tekniğe Hashing technique denir.
         HashSet elemanları rastgele sıralar.
         HastSet elemanları sıralamadığından çok hızlı çalışır.
         HashSetler null'ı eleman kabul eder

        b) LinkedHashSet
            LinkedHashSetler elemanları sizin verdiğiniz sıraya göre dizdiklerinden (insertion order) Hashsetlere göre yavastırlar.

        c) TreeSet Class
            TreeSet elemanları natural order'a göre sıralar.
            ve bu nedenle çok yavaştırlar, en yavaş settir.
3) TreeSet çok yavaş olduğundan mümkün olduğu kadar TreeSet kullanmamaya çalışırız.
 */

        HashSet<String> hs = new HashSet<>();
        hs.add("Adnan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs);     // [Kerem, Tuba, Onur, Adnan] şeklinde rastgele verdi.

        hs.add("Tuba");
        System.out.println(hs);     // [Kerem, Tuba, Onur, Adnan] ikinci bir Tuba'yı eklemedi görmezden geldi.


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs);    // [313, 19, 7, 1, null] bizim verdiğimiz sıraya göre dizdi, null'ı da eleman sayıyor.

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(313);
        ls.add(19);
        ls.add(17);
        ls.add(11);
        System.out.println(ls);

lhs.retainAll(ls);  // lhs ile ls'nin ortak elemanlarını lhs'nin içinde verir.

        System.out.println(lhs);    //[313, 19]     Ortak kesişim kümelerini verdi.
        System.out.println(ls);     // [313, 19, 17, 11]

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');

        System.out.println(ts); // [A, G, R, U, Z]  // natural order ile sıraladı ve null'ı eleman olarak kabul etmez.
        System.out.println(ts.subSet('G', 'U'));    //  substring gibi çalışır. [G, R] aldı ama U'yu almadı çünkü sonuncu dahil değil.




    }
}
