package day26lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
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
                forEach(Utils :: printInTheSameLineWithSpace);
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
                forEach(Utils :: printInTheSameLineWithSpace);

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
                map(String :: toUpperCase).   // class name :: method name ==> method reference  Yani şu class'a git bu method'u kullan.
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
                map(String :: toLowerCase).
                sorted().
                forEach(Utils :: printInTheSameLineWithSpace);

        /*
        ali elif
         */
}

    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.

public static void soru (List<String> myList){
        myList.stream().
                distinct(). // tekrarsızları aldım
                map(String::toUpperCase).    // dönüştüreceğim neye Upper'a
                sorted().   // Natural Order'a göre sıraladım
                forEach(Utils :: printInTheSameLineWithSpace); // Her birini yazdırdık.
}

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge
    // siralayarak console'a yazdiran method'u olusturunuz.

// ==> Best practice budur. Hiç kod yok.
public static void printElementsUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).    //sıralamayı biz belirlemek istiyorsak Comparator.comparing kullanırız.
                forEach(Utils :: printInTheSameLineWithSpace);
}





}

