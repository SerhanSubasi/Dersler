package day12ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
        //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]


        List<Character> a = new ArrayList<>();        //ArrayList aynı zamanda List demek. a objesi list tipinde oldu.
a.add('J');
a.add('a');
a.add('v');
a.add('a');
a.add('v');

        System.out.println(a);

        List<Character> b = new ArrayList<>();

// şimdi elimizde eski list var, yeni listimiz de var. e ne duruyoruz? Helva yapsana.

        for ( Character w : a ) {
            if (!b.contains(w)) {
                b.add(w);
            }
        }
        System.out.println(b);  //[J, a, v]

//Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.
        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");

        System.out.println(r);
/*
        for ( String w : r ) {

            if (w.contains("a")){
                r.remove(w);    //w girdik çünkü w ''a'' içeriyorsa kaldır.
            }
        }

 */

//Ancak foreach burada hata verir. Listten eleman silince lenght yani indexler değişir, foreach'de güncellenmediği için çalışmaz.
// Foreach kullandığımızda listlerde eleman sayısını azaltamazsınız, değiştiremezsiniz.

        for (int i = 0; i < r.size(); i++) {        //lenght size oldu listlerde
          if (r.get(i).contains("a") ){                                   // charAt get oldu listlerde. i'den gelen "a" içeriyor mu diye de sorduk.
        r.remove(i);                                //i'ninci indexteki eleman a içeriyorsa i'ninci indexi sil.
              i--;                              //silme işlemi olduğunda indexler azalacağı için i değerini de azaltmalıyız. Yoksa Van kalır en sondaki. -- yapıyoruz ki yukarıda ++ olacak eşit kalsın 0'da diye.
          }
        }
        System.out.println(r);

//remove içerecek sorularda fori ve --; kullanmalıyız.

    }
}

