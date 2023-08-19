package day06switchternarystring;

public class StringManipulations01 {
    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1: "s" String'inde kullanilan character sayisini bulunuz.

       int sLength = s.length();
        System.out.println(sLength); //12

        //Example 2: "s" String'indeki ilk indexte bulunan character'i ve son indexte bulunan karakteri aliniz.

       char firstChar = s.charAt(0);
        System.out.println(firstChar);

char lastChar = s.charAt(11);
        System.out.println(lastChar);

        char lastChar2 =s.charAt(s.length()-1);
        System.out.println(lastChar2);

//Note: İndex her zaman 0'dan başlar, bu nedenle charAt(0) her zaman ilk index'i verir.
        //Note2: son karakteri bulmak için .length()-1 girersek son index verir. veya lenght gir  sonuçtan 1 çıkar.

        //Example 3: "s" String'indeki ilk 4 characteri aliniz.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4

String sub1 = s.substring(0,4);
        System.out.println(sub1); //Java

        //Example 4: "s" String'indeki "is" kelimesini aliniz.

        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        String sub3 = s.substring(8,12);
        System.out.println(sub3);

     //2. yol
     //eğer ki bir karakterden başlayarak sonuna kadar almak isterseniz o zaman tek parametreli kullanabilirsin.

     String sub4 = s.substring(8);
        System.out.println(sub4); //easy



       //Example 6: "s" String'inde easy kelimesinin var olup olmadığını kontrol ediniz.
//contains içerir demek, bir iddiadır boolean olarak verir içerip içermediğini

        boolean isExist = s.contains("easy");
        System.out.println(isExist);       //true

        //ignoreCase bunda yok, o yüzden küçük büyük dikkat etmek gerekir.



        //Example 7: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);        //true

        //Example 8: "s" String'inin "easy" ile bitip bitmediğini kontrol ediniz.

        boolean isEnd = s.endsWith("easy");
        System.out.println(isEnd);      //true






    }
}
