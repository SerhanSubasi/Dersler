package day15Stringbuilderaccessmodifier;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);        //Java is easy

        sb1.reverse();
        System.out.println(sb1);        //ysae si avaJ

        sb1.deleteCharAt(0);
        System.out.println(sb1);        //sae si avaJ

        //Başlangıç indexinden bitiş indexine kadar (hariç) olan karakterleri siler.
        sb1.delete(0, 5);    //0 dahil 5 hariç silecek.
        System.out.println(sb1);        //i avaJ

        sb1.replace(0, 3, "X");  // girilen değerler arasına yeni bir String gir.
        System.out.println(sb1);       // i avaJ ==> XvaJ

        sb1.insert(2, "999"); //2 değeri atla ve oraya şunu koy
        System.out.println(sb1);        //Xv999aJ

        StringBuilder sb2 = new StringBuilder("Kava");
        StringBuilder sb3 = new StringBuilder("Java");

        int r1 = sb2.compareTo(sb3);        //compare : karşılaştırmak. Sözlük mantığı ile karşılaştırır.
        System.out.println(r1);     //Önce ilk harflere bakıyor, aynıysa diğerine geçiyor.

        /*
        compareTo(); iki String builderı baştan başlayarak harf harf karşılaştırır.
        ilk harfler aynı ise ikinci harflere geçer. İkinciler de aynıysa üçüncülere geçer.
        İlk farklı harfe kadar gider ve farklı olan iki harfin ascii kodları arasındaki farkı verir.

        sonuc 0 ise : alfabetik olarak aynı sıradalar demektir.
        sonuc -1 ise: sb2 sb3'den alfabetik olarak önde demektir.
        sonuc +1 ise: sb2 sb3'den alfabetik olarak sonra demektir.
         */

//Not: StringBuilder'da örneğin upperCase yok, String kadar zengin değil. Onun için String'e geçmek gerekbilir bazen.
        // toString() ile

        String str = sb1.toString().toUpperCase();
        System.out.println(str);    // Xv999aJ ==> XV999AJ

//String nasıl StringBuilder'a çevrilir?
StringBuilder newSb1 = new StringBuilder(str);  //str'yi StringBuilder'a ekledik ve o ardık StringBuilder oldu.

/*
1) StringBuffer Java'da String üreten Classlardan bir başkasıdır.
StringBuffer eski topraktır, Java'nın String üretmek için oluşturduğu ilk Classtır.

2) StringBuffer, StringBuilder'a çok benzer, ikisi de "mutable"dır.
3) Farkı: StringBuffer "Multi-Thread"dir, ama StringBuilder "Multi-Thread" değildir.
 Multi-Thread: Çoklu- iş yapmaya müsaittir.
 4) StringBuilder "Multi-Thread" olmadığı için StringBuffer'dan daha hızlı çalışır.

    3 tane String oluşturan Class öğrendik;
        1) immutable string lazımsa  ==> String Class

        2) Mutable string lazımsa ==> StringBuilder veya StringBuffer
               a) StringBuilder'ı multi thread gerekmezse
               b) StringBuffer'ı multi thread gerekirse
 multi thread yaparken seknronize şekilde sıralamayı verilmi yapmak lazım.
 Çorba kaynarken bi yandan salatayı hazırlamak gibi.

 */

// StringBuffer oluşturma
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);    //Java


    }
}
