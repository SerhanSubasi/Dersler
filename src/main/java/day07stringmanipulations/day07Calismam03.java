package day07stringmanipulations;

public class day07Calismam03 {
    public static void main(String[] args) {


 //Example: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
//           mehmet ==> ht
//lastIndexOf() methodu parantezi içine yazılan karakterin, stringdeki son görünümünün indexini verir.

/*
        String s = "mehmet";
        int msayisi = s.indexOf("m");          // 0
        System.out.println(msayisi);

        int msayisi2 = s.lastIndexOf("m"); // 3
        System.out.println(msayisi2);


        int tsayisi = s.indexOf("t");          // 5
        System.out.println(tsayisi);

        int tsayisi2 = s.lastIndexOf("t");  //5
        System.out.println(tsayisi2);

      */
        String s = "mehmet";

       if (s.indexOf("m") == s.lastIndexOf("m")) {
           System.out.println("m");
       }

        if (s.indexOf("e") == s.lastIndexOf("e") ) {
            System.out.println("e");
        }

        if (s.indexOf("h") == s.lastIndexOf("h") ) {
            System.out.println("h");
        }

        if (s.indexOf("t") == s.lastIndexOf("t") ) {
            System.out.println("t");
        }

        System.out.println();


        //Example 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

String cardNo = "1234 6789 1234 6789";

String result = cardNo.substring(0,15).replaceAll("[0-9]", "*");


String result2 = cardNo.substring(15);
        String creditCardNumber = result.concat(result2);
        System.out.println(creditCardNumber);




    }
}
