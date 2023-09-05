package day12ArrayLists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {

        ArrayList < Integer > ages = new ArrayList<>();

              // Bunu yazdırırken sout ile yazdırırsın ve İçerisi boşsa boş verir, arreylerdeki gibi 0 vermez.

//ArrayListlere eleman ekleme
    ages.add(9);
    ages.add(12);
    ages.add(10);

ages.add(1,656);        //diğer add seçeneği ile, hangi indexe hangi sayıyı gireceğini yazabiliyorsun sırasını bozuyorsun.
ages.add(3,777);        //diğer add seçeneği ile, hangi indexe hangi sayıyı gireceğini yazabiliyorsun sırasını bozuyorsun.
ages.add(888);
  System.out.println(ages);

//ArrayListlere çoklu eleman nasıl eklenir?

        ArrayList < Integer > newAges = new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);
        System.out.println(newAges);

ages.addAll(newAges);       // birini diğerine ekleme ama sona ekler
        System.out.println(ages);

ages.addAll(0,newAges); //birini diğerine ekleme ama indexi kendin belirlersin  [1, 2, 3, 9, 656, 12, 777, 10, 888, 1, 2, 3]
        System.out.println(ages);

int numOfElement = ages.size(); // 12 - kaç eleman olduğunu verdi.
        System.out.println(numOfElement);
int el= ages.get(1);    //get ile içinden spesifik birisini alırsın. index sayısı girerek.
        System.out.println(el);

ages.set(1,313);        //[1, 313, 3, 9, 656, 12, 777, 10, 888, 1, 2, 3]
        System.out.println(ages);

        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

ArrayList<Integer> list = new ArrayList<>();
list.add(23);
list.add(24);
list.add(12);
list.add(9);
list.add(3);
        System.out.println(list);  //[23, 24, 12, 9, 3]

        for ( Integer w : list ) {


if (w%2 !=0) {


    list.set(list.indexOf(w),11);
}
        }
        System.out.println(list);  //[11, 24, 12, 11, 11]








    }
}
