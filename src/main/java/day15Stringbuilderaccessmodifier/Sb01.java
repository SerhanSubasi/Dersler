package day15Stringbuilderaccessmodifier;

public class Sb01 {
    public static void main(String[] args) {

        /*
        1) "StringBuilder" bir Class'tır ve String üretir.
        2) Sring Class kullanarak String üretiriz, Java neden StringBuilder'a ihtiyaç duymuş?
            a) String Class "immutable" (değiştirilemez) String üretir, ancak StringBuilder Class "mutable" (değiştirilebilir) String üretir.
         3) immutable olmak demek; Orjinal değerin korunmasıdır, değiştirilemez olmasıdır.
         4) mutable olmak demek:  Orjinal değerin değiştirilebilir olması demektir.
         */


        //Immutable
        String s = "Java";
        String s2 = new String("Java2");  //Şeklinde de yazılır aslında
        String t = s+"!";       //Yapınca orjinali koruyup yeni bir kavanoz açtı Heap içerisinde, değiştirmedi orjinali.
        System.out.println(t);

        String a = "Money";
        a = a +"More";  //Yapınca artık referans cont yapılan yeni değere geçti eski referans silindi Garbage collector'a.



        //Mutable
        StringBuilder sb1 = new StringBuilder("Python");
        sb1.append("!");    //Python'ın yanına "!" ekledi şimdi. Orjinali değiştirdi yani. Append kodu ile.

        System.out.println(sb1);    //Python - Python! oldu ikinci kodla.

        //StringBuilder oluşturmanın 2.yolu

        StringBuilder sb2 = new StringBuilder();    //Java memoryde 16 karakterlik alan oluşturdu.

        System.out.println(sb2.length());   //0
        System.out.println(sb2.capacity()); //16

        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx"); //15 adet x eklersek kapasiteyi aşacağından kapasite artmaya başlar. bi 16 daha +2 verir.

        System.out.println(sb2.length());   //4 - 19 oldu
        System.out.println(sb2.capacity()); //16 - 34 oldu = 16 + 16 + 2 bahşiş. Java cömerttir. O da sığmazsa 34 + 34 + 2 verir.


        /*
         == > cappacity ve lenght arasındaki fark nedir?
        capacity java'nın size verdiği data depolama yer sayısıdır.
        lenght ise size verilen fata depolama yerinin kullanılan kısmıdır.

        ==> Java başlangıç olarak size capacity 16 olarak verir, Eğer bu aşılırsa  var olan * 2 + 2 şekilde ayarlar. 2 katının 2 fazlası.
        16 ==> 16*2+2 : 34
         */

        //StringBuilder oluşturmanın 3.yolu
        StringBuilder sb3 = new StringBuilder(3);   //içerisine kapasiteyi yazarsanız siz oluşturursunuz.
        sb3.append("ali");  //ali





// Var olan değeri değiştirmek istemiyorsak String, orjinali korumaya gerek yoksa StringBuilder kullanabiliriz.
// Başka mutable ve immutable olan classlar da var. -Arraylist mutable, Wrapper inmutable mesela.





    }


}
