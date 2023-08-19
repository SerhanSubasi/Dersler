package day07stringmanipulations;

public class StringManipulation03 {
    public static void main(String[] args) {

        //Example: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht

        //lastIndexOf() methodu parantezi içine yazılan karakterin, stringdeki son görünümünün indexini verir.


    //indexOf("m") ==> 0 verir.  farklı demek ki tekrarlı
    //lastIndexOf ("m") ==> 3 verir.

    //indexOf("e") ==> 1
    //lastIndexOf ("e") ==> 4

    //indexOf("h") ==> 2        ==> tekrarsız çünkü aynı
    // lastIndexOf ("h") ==> 2


String s = "mehmet";

if(s.indexOf("m") == s.lastIndexOf("m"))  {
    System.out.print("m");
}
        if(s.indexOf("e") == s.lastIndexOf("e"))  {
            System.out.print("e");
        }
        if(s.indexOf("h") == s.lastIndexOf("h"))  {
            System.out.print("h");
        }

        if(s.indexOf("t") == s.lastIndexOf("t"))  {
            System.out.print("t");
        }
        System.out.println(); //alt satıra geçsin diye yaptık

//Example 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789


        String cardNum = "1234 6789 1234 6789";
String first = cardNum.substring(0,15).replaceAll("[0-9]" , "*");
        System.out.println(first); //**** **** ****

String last = cardNum.substring(15);
        System.out.println(last);  //6789

        String result2 = first.concat(last);     //concatination yapar, first + last yapmanın aynısı ama bu tavsiye ediliyor
        System.out.println(result2);


        //shift ve f10 run.



    }
}
