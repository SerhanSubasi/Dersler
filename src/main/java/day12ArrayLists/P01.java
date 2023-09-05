package day12ArrayLists;

import java.util.ArrayList;

public class P01 {
    public static void main(String[] args) {

        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);

        for ( Integer w : list ) {
            if ( w%2!=0  ){
                list.set(list.indexOf(w),11);
            }
        }
        System.out.println(list);

        //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]

ArrayList <Character> a = new ArrayList<>();
ArrayList <Character> b = new ArrayList<>();

        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');

        for ( Character w : a ) {
        if (!b.contains(w)){
    b.add(w);
}
        }
        System.out.println(b);

//Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");

        System.out.println(r);

        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains("a") ){
                r.remove(i);
                i--;
            }
        }
        System.out.println(r);







    }
}
