package day07stringmanipulations;

public class day07Calismam04 {
    public static void main(String[] args) {


/*  Örnek : Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
       i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
       ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
       iii) Başında ve sonunda boşluk olmamalıdır.
       */


String pwd = "abc";

boolean first = pwd.isEmpty();
        System.out.println(first);
boolean second = pwd.isBlank();
        System.out.println(second);
boolean third = pwd.trim().equals(pwd);
        System.out.println(third);

if (first) {
    System.out.println("Parola boş bırakılamaz");
}
if (second){
    System.out.println("Parolada boşluk haricinde görünür karakterler de bulunmalıdır");
}
if (!third) {
    System.out.println("Parolanın başında ya da sonunda boşluk bırakılmamalıdır");
}


// Stack ve Heap diye iki memory var Java'da. Stack küçük, Heap büyük.
// Stack içinde primitive datalar olur. char, boolean, byte, short, int, long, float,double.
// Heap içinde ise: Non-primitiveler, wrapper classlar, yani sizin oluşturudğunuz klasslar. Sınırı olmayanlar.
        //Java Heap'a kayıtlı olan her şeyi Stack içinde bir reference'da tutar. Önce Stack'den yo ltarifi alır sonra
        //gider bulur o heap'deki dosyayı.

/*
Note: Stringlerin eşitliklerini kontrol ederken "==" yerine equals kullanırız. çünkü == sembolü
2 stringi karşılaştırırken, hem adreslerine hem de değerlerine bakar. Eğer ikisi de aynı ise
stringler eşittir der.

equals() methodu ise iki stringi karşılaştırırken sadece değerlerine bakar, değerleri aynı ise eşit der, adresi umursamaz.



*/

    }
}
