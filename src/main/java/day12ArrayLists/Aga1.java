package day12ArrayLists;

import java.util.ArrayList;

public class Aga1 {
    public static void main(String[] args) {

        ArrayList<Integer> benimArr = new ArrayList<>();

        benimArr.add(5);
        benimArr.add(0);
        benimArr.add(8);
        System.out.println(benimArr);  // [5, 0, 8]

        benimArr.add(1,11);
        System.out.println(benimArr);  // [5, 11, 0, 8]
        benimArr.add(2,3);
        System.out.println(benimArr);   // 5, 11, 3, 0, 8]
        benimArr.add(4,15);
        System.out.println(benimArr);   // [5, 11, 3, 0, 15, 8]

        ArrayList <Integer> newBenimArr = new ArrayList<>();
        newBenimArr.add(1);
        newBenimArr.add(2);
        newBenimArr.add(3);

        benimArr.addAll(newBenimArr);
        System.out.println(benimArr);

        benimArr.addAll(0,newBenimArr);
        System.out.println(benimArr);

        int elemanSayisi = benimArr.size();
        System.out.println(elemanSayisi);   // Size'ı 12'ymiş.

        int eleman = benimArr.get(4);
        System.out.println(eleman);         // 11 geldi çünkü 4. indexte o var


        benimArr.set(4,1200);       // 4. indextekini 1200 ile değiştirdik.
        System.out.println(benimArr);      // [1, 2, 3, 5, 1200, 3, 0, 15, 8, 1, 2, 3]


    // arraylist'lere sonradan eklenen elemanlara insortion order ==> elemanları sırayla eklemesine denir
    // .size(): ==> size methodu eleman sayisini verir
    // .get(): ==> indeks ile bize elemanin degerini verir, sipesifik olarak indeks girip bize eleman verir
    // .addAll(): ==> bir arraylisttei elemanlarının hepsini diğer arraylistteki elemanlara insortion order yöntemi ile ekler
    // .set(): ==> set methodu indeks ile çalışır .set(1,313); ilk virgül indeksi,  ikinci virgül güncellecek değeri temsil eder
    // .indexOf() ==> arrayListe atanan değerin içindeki indeksi verir, .indexOf(3):
    // .contains() ==> içeriyor mu? methodu, string manipulation ile aynı logic


        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin


        ArrayList <Integer> list = new ArrayList<>();
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

        }



ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(44);
        list2.add(32);
        list2.add(14);
        list2.add(15);
        list2.add(5);
        list2.add(77);

        for ( Integer w : list2  ) {

            if (w%2 != 0) {
                list2.set(list2.indexOf(w),33);

            }
            System.out.println(list2);
        }


















    }
}
