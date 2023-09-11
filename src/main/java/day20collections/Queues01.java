package day20collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

  // first in first out mantığı vardır.

        Queue<String> depo = new LinkedList<>();    //    Queue interface olduğu için seçemedik constructorıu yok
// methodları hep ilk elemanlarla ilgilidir, araya kaynama yok bunda.

        depo.add("süt");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");
        System.out.println(depo);   // [süt, et, yumurta, peynir]

        depo.remove();
        System.out.println(depo);   // [et, yumurta, peynir] Süt çıktı çünkü ilk o girdi.

        depo.clear();               // içini tamamen boşalttık []
        System.out.println(depo);

        System.out.println(depo.poll());    // null

        // System.out.println(depo.element());  Exception verir

        Queue<String> wareHouse = new PriorityQueue<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");       // Priority: Öncelik
        wareHouse.add("Orange");    // Öncelik sırasına göre dizecek.
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);


// Double ended queu ==> iki uclu queue

        Deque<String> d = new LinkedList<>();
d.add("Milk");
d.add("Meat");
d.add("Egg");
d.add("Orange");
d.add("Tomatoes");
        System.out.println(d);


    }
}
