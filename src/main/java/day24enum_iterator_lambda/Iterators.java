package day24enum_iterator_lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        // Iterat = tekrarla demek.

        /*
        1) Iteratorlar loopların yaptığı aynı işi yapar.
        2) Iteratorlarda sonsuz loop oluşma ihtimali yoktur.
        3) Iteratorlar ile looplar arasında performans farkı yoktur.
        4) Iteratorlar bir collectiondan eleman silme ve bir collectiondaki elemanı değiştirme konusunda daha başarılıdır.
        5) iki tip Iterator vardır

        a) Iterator:
            Bu sadece eleman silmede kullanılır. Elemanı eklemek veya değiştirmek mümkün değildir.
            sadece soldan sağa çalışır. ( ilk elemandan son elemana)
        b) ListIterator:
            Bu eleman silebilir, ekleyebilir ve değiştirebilir.
            ListIterator iki yönlü çalışabilir.

         */

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");
        System.out.println(myList);

        // specific bir elemanı iterator ile nasıl silebiliriz?
    Iterator<String> myItr = myList.iterator();
    //hasNext() pointer'a senden sonra eleman var mı diye sorar, eleman varsa true, yoksa false return eder.

while (myItr.hasNext()) {
    // next() pointerı bir sonraki elemanın önüne taşır ve üstünden atladığı elemanı return eder
    String el = myItr.next();
    if (el.equals("Tom")){
        //remove() methodu next() methodunun return ettiği elemanı siler.
        myItr.remove();
    }
}
        System.out.println(myList);


//ListIterator
        List<String> yourList = new ArrayList<>();
yourList.add("Ali");
yourList.add("Can");
yourList.add("Aliye");
        System.out.println(yourList);   //[Ali, Can, Aliye]

ListIterator<String> yourListItr = yourList.listIterator();

while (yourListItr.hasNext()) {

   String el = yourListItr.next();
   yourListItr.set(el + "*");
}
        System.out.println(yourList);   // [Ali*, Can*, Aliye*]


        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);//[Ali, Can, Aliye]

ListIterator<String> listItr2= list3.listIterator();    //[Ali, Can, Aliye]

        // buı loop pointerı en sağa almak için yazıldı.
while (listItr2.hasNext()){
    listItr2.next();
}

// elemanları sondan başa doğru yazdırın

        while (listItr2.hasPrevious()){
            String el = listItr2.previous();
            System.out.println(el + " <-- ");
        }



    }
}
