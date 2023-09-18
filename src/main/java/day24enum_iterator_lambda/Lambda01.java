package day24enum_iterator_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
/*


1) Lambda "Functional" (Method programmingdir, diğeri "Structurde Programming" (Yapısal) olarak geçiyordu.
2) Functional programmingte ne yapılacak üzerine yoğunlaşılır.
    "Structured Programming"de ise nasıl yapılacak üzerine yoğunlaşılır.
3) Functional Programming'i Collectionlar ve Arrayler ile kullanırız.
4) Lambda (Functional Programming) java 8 ile kullanılmaya başlanmıştır.

Method açıklamaları:


                */


        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));

        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        sorumuz(nums);
        System.out.println();
        getMaximumValue1(nums);
        System.out.println();


    }
    //1a) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured)
    public static void printEvenElements1( List<Integer> nums ){
        for (Integer w : nums ) {
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    //1b) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(functional)
    public static void printEvenElements2( List<Integer> nums ){
        nums.
                stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t+" "));
    }

    //2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)

    //81 17161 81 225
    public static void printSquareOfOddElements(List<Integer> nums){
        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t+" "));
    }
    //3) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

public static void printCubeOfDistinctOddElements(List<Integer> nums) {
    nums.
            stream().   // Akışa dönüştürür.
            distinct(). //sadece tekrarsızları seçer
            filter(t -> t % 2 != 0).  //filtre yapar.
            map(t -> t * t * t).  // var olan her bir datayı değiştirir.
            forEach(t -> System.out.println(t + " ")); // her birini alır sout kısmına boşluk da ekleyeceğiz diye doğrudan yazdırmadık.

}
// not: Lambda'da eleman sayısını azaltanların önce kullanılması, Java'ya daha az iş yaptırır yormaz.

    //4)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin"
    // "toplamını" hesaplayan method oluşturun

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {

        int sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }
    ////5) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

public static void sorumuz ( List<Integer> nums){

        int sum2 = nums.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(1,(t,u) -> t*u);
    System.out.println(sum2);
}

    //6)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun
public static void getMaximumValue1( List<Integer> nums){
       int max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t :u);    // Integer.MIN_VALUE ==> Enum'dır büyük yazılır. Integer'ın min hali -2Milyar falan.
    System.out.println(max);
}
    //4. yol
    public static void getMaxValue4(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        reduce(Math::max).
                        get();
        System.out.println(max);
    }
    //7)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun


    public static void getMaxValue5(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        reduce(Math::min).
                        get();
        System.out.println(max);
    }

    //7)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun
    //1.yol
    public static void getMinValue1(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                reduce((t,u)-> t>u ? u : t).    // t-u'dan büyükse, u küçüktür onu seç. t-u'dan küçükse, t küçüktür onu seç.
                get();
        System.out.println(min);

    }

    //2.yol
    public static void getMinValue2(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce((t,u)->u).
                get();
        System.out.println(min);
    }
    //3.yol
    public static void getMinValue3(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                sorted().
                reduce((t,u)->t).
                get();
        System.out.println(min);
    }
    //4.yol
    public static void getMinValue4(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                reduce((t,u)->Math.min(t,u)).
                get();
        System.out.println(min);
    }
    //8)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
    // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

public static void getMinGreaterThanSevenEven(List<Integer> nums) {
        Integer min = nums.
                stream().
                filter(t-> t>7 && t%2==0).
                sorted().
                findFirst() //ilkini alır . t,u t-> t gibi.
                .get();
    System.out.println(min);

}


}



