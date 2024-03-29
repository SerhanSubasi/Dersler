package day25lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        printElementsExceptStartsWithE(myList);
        System.out.println();
        printDistinctElementLengthLessThanFive(myList);
        System.out.println();
        List<String> newList = getElementLengthMoreThanFiveWithUpperCase(myList);
        System.out.println(newList);
        printElementsLenghtLessThanFiveUniqueLowerCase(myList);
        soru(myList);

    }
    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.


    public static void printElementsExceptStartsWithE(List<String> myList){
        myList.
                stream().
                filter(t-> !t.startsWith("E")).
                forEach(t-> System.out.println(t+" "));
/*
Ali
Yusuf
Zeynep
Mustafa
 */

    }

    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari
    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.

public static void printDistinctElementLengthLessThanFive(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                forEach(t-> System.out.print(t+ " "));

        /*
        Ali, Elif
         */
}

    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari buyuk
    // harflerle bir listin icinde veren method'u olusturunuz.

    public static List<String> getElementLengthMoreThanFiveWithUpperCase(List<String> myList){
       return myList.
                stream().
                filter(t-> t.length()>5).
                map(t-> t.toUpperCase()).
                collect(Collectors.toList());

       /*
       [ZEYNEP, MUSTAFA]
        */
    }

    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.

public static void printElementsLenghtLessThanFiveUniqueLowerCase(List<String> myList) {

        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                map(t->t.toLowerCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));

        /*
        ali elif
         */
}

    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.

public static void soru (List<String> myList){
        myList.stream().
                distinct(). // tekrarsızları aldım
                map(t->t.toUpperCase()).    // dönüştüreceğim neye Upper'a
                sorted().   // Natural Order'a göre sıraladım
                forEach(t-> System.out.println(t+" ")); // Her birini yazdırdık.
}

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge
    // siralayarak console'a yazdiran method'u olusturunuz.

public static void printElementsUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).    //sıralamayı biz belirlemek istiyorsak Comparator.comparing kullanırız.
                forEach(t-> System.out.println(t+" "));


}

}

