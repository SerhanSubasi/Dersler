package day20collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

/*
ArrayListler eleman silme ve eklemede tekrar indexleme yapmak zorunda olduklarından çok başarısızdırlar.
Bu yüzden elaman ekleme çıkarmada çok daha başarılı olan LinkedListleri oluşturulmuştur.LinkedListlerin indexleri yoktur, Node'ları vardır.

head: LinkedList'in başındaki boş pointer
node: LinkedList'in her bir kutucuğu, bağ demek.
tail: LinkedList'in en sonundaki boş pointer

AMA LinkedList'lerin search yeteneği çok kötü. Sırayla her birini arıyor çok yorucu.

Daha çok eleman eklenip çıkartılacaksa LinkedList
Daha çok eleman aranacaksa ArrayList kullanılması tavsiye edilir.


 */
        LinkedList<String> listem = new LinkedList<>();
        listem.add("Mehmet");
        listem.add("Ahmet");
        listem.add("Onur");
        listem.add("Mehmet");
        listem.add("Kübra");
        listem.add("Tuba");
        listem.add("Duygu");

        System.out.println(listem);     // [Mehmet, Ahmet, Onur, Kübra, Tuba, Duygu]

        listem.add(1, "Zafer");
        // Biz index değeri girdik  ama Java arka planda index kullanmıyor bunu Node'a çeviriyor.

        System.out.println(listem);     // [Mehmet, Zafer, Ahmet, Onur, Kübra, Tuba, Duygu]

        listem.addFirst("Onur");
        System.out.println(listem);     // [Onur, Mehmet, Zafer, Ahmet, Onur, Kübra, Tuba, Duygu]

        listem.addLast("İbrahim");
        System.out.println(listem);     // [Onur, Mehmet, Zafer, Ahmet, Onur, Kübra, Tuba, Duygu, İbrahim]


        // listem.remove("Mehmet");
       // System.out.println(listem);     // [Onur, Zafer, Ahmet, Onur, Kübra, Tuba, Duygu, İbrahim]


        listem.removeLastOccurrence("Mehmet");
        System.out.println(listem);             // sonradan eklediğimiz Mehmet'i sildik.

        System.out.println(listem.peek());       // ilkini verir ama silmez kopyalar. ctrl v
        System.out.println(listem);


        System.out.println(listem.poll());      // ilkini alır gelir ama siler. ctrl x
        System.out.println(listem);

/*
Not: peek() ile element()'in ikisi de ilk elemanı silmeden bize verir.
peek() list bos olduğunda size null verir, element() ise hata verir.
 */

        System.out.println(listem.element());   // yine ilkini kopyaladı getirdi. AMA
        System.out.println();

/*
Not: poll() ile pop()'un ikisi de ilk elemanı siler ve size verir.
poll() list bos olduğunda size null verir, pop() ise hata verir.
 */

        System.out.println(listem.pop());
        System.out.println(listem);


// Set demek unique demektir, eşsiz tekrarsızdır. mesela datadaki mail adresleri set ile alınır ikincisi yoktur.

/*

HashSet: Elemanları rasgele sıralar. Bu yüzden çok hızlı çalışır.
LinkedHashSet: Elemanları girilen sıraya göre sıralarlar. Hash setlere göre bir tık daha yavaştır.
TreeSet: Elemanları Natural Order ile dizer.  Çok titizlerdir bu yüzden baya yavaşlardır.


 */




    }
}
