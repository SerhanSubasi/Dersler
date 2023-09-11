package day12ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists04 {
    public static void main(String[] args) {

    //Bir list oluşturmanın kısa yolu

        List <Integer> list = Arrays.asList(4,5,13,313,353);
        System.out.println(list); //[4, 5, 13, 313, 353]

/*
Not: AArrays.asList() methodunu kullanarak bir list oluşturursanız , listin eleman sayısını değiştiren
methodları kullanamazsınız. remove, add, clear gibi.
 */

        list.set(1,63);
        list.set(3,21);  //bu kullanılabilir.
        System.out.println(list);









    }
}
