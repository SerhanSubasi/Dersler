package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList0 {

    public static void main(String[] args) {




/*
        // arraylist'lere sonradan eklenen elemanlara insortion order ==> elemanları sırayla eklemesine denir
        // .size(): ==> size methodu eleman sayisini verir
        // .get(): ==> indeks ile bize elemanin degerini verir, sipesifik olarak indeks girip bize eleman verir
        // .addAll(): ==> bir arraylisttei elemanlarının hepsini diğer arraylistteki elemanlara insortion order yöntemi ile ekler
        // .set(): ==> set methodu indeks ile çalışır .set(1,313); ilk virgül indeksi,  ikinci virgül güncellecek değeri temsil eder
        // .indexOf() ==> arrayListe atanan değerin içindeki indeksi verir, .indexOf(3):
        // .contains() ==> içeriyor mu? methodu, string manipulation ile aynı logic


        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

ArrayList<Integer> list = new ArrayList<>();

        list.add(24);
        list.add(23);
        list.add(11);
        list.add(99);
        list.add(78);

        for ( Integer w : list ) {

            if (w%2 != 0) {
                list.set(list.indexOf(w),33);
            }

            System.out.println(list);
*/





ArrayList <Integer> arr = new ArrayList<>();
arr.add(23);
arr.add(24);
arr.add(99);
arr.add(14);
arr.add(17);

        for ( Integer w : arr ) {

            if (w%2 != 0) {
                arr.set(arr.indexOf(w), 44);

            }

        }
        System.out.println(arr);



  //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
 //           [J, a, v, a, v] ==> [J, a, v]


  ArrayList <Character> a = new ArrayList<>();

  a.add('j');
  a.add('a');
  a.add('v');
  a.add('a');
  a.add('v');

  ArrayList <Character> b = new ArrayList<>();

        for ( Character w : a ) {

            if (!b.contains(w)) {
                b.add(w);
            }
        }
        System.out.println(b);


//Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.


     ArrayList <String> sehirler = new ArrayList<>();

     sehirler.add("Antalya");
     sehirler.add("Ankara");
     sehirler.add("Münich");
     sehirler.add("Isparta");

        for (int i = 0; i < sehirler.size(); i++) {

            if (sehirler.get(i).contains("a")) {
                sehirler.remove(i);
                i--;
            }
        }
        System.out.println(sehirler);


        /*

        /Example : Bir tane Integer List olusturunuz
         Bu List'te birbirine en yakin iki tamsayiyi yaziniz
          [12, 23, 10, 19] ==> 12 and 10
         */


       ArrayList<Integer> err = new ArrayList<>();
        err.add(2);
        err.add(6);
        err.add(16);
        err.add(25);
        err.add(9);
        err.add(33);

        System.out.println(err);
        Collections.sort(err);
        System.out.println(err);

        int minDiff = err.get(1) - err.get(0);

        for (int i = 1; i < err.size(); i++) {
            minDiff = Math.min(minDiff, err.get(i) - err.get(i-1));
        }

        System.out.println(minDiff);


        for (int i = 1; i <err.size() ; i++) {
            if (err.get(i) - err.get(i - 1) == minDiff) {
                System.out.println(err.get(i) + " ve " + err.get(i - 1));
            }

        }

















    }


}
