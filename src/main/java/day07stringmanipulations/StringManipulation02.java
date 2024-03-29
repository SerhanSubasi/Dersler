package day07stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {


//Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
//           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98


        String tv = "$456.99";
        String laptop = "$875.99";

        String newTv = tv.replace("$", "");
        String newLaptop = laptop.replace("$", "");

        Double totalPrice = Double.valueOf(newTv) + Double.valueOf(newLaptop);
        System.out.println(totalPrice);//1332.98

        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "   ali cAN   " ==> AC

        String name = "   ali cAN   ";
        // trim() methodu bir Stringin baş ve sonundaki spaceleri siler, ortadakilere karışmaz.
        char first = name.trim().toUpperCase().charAt(0);
        char last = name.trim().toUpperCase().split(" ") [1].charAt(0);

        System.out.print(first);        //print sadece. println basınca yanda bekletiyor pointerı.  System.out.println("" + first + last);
        System.out.print(last);

//split ortadan ayıran methoddur, space sonrasından itibaren kestik, 0. değil de artık 1. olan CAN oldu.
     // arka arkaya method kullanmaya Method Chain denir.



        //Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
        //karakterleri dynamic olarak aliniz
        //abc@gmail.com ===> gmail

//1. yol hard coding tavsiye edilmez
String a = "abc@gmail.com";
        System.out.println(a.substring(4, 9)); //gmail

//2.yol dynamic coding.
// indexOf() methodu parantezi içerisine yazılan karakterin indexini verir.

 int startingIndex = a.indexOf("@") +1;
        int endingIndex = a.indexOf(".");
        String companyName = a.substring(startingIndex,endingIndex);
        System.out.println(companyName);


    }
}
