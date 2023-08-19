package day02variables;

public class Variables01 {

    public static void main(String[] args) {
        //Variable nasil olusturulur?
        //Data Type + Variable Name + Assignment Operator (Atama Operatoru) + Variable degeri + noktali virgul;

            int age  =  19 ;
            System.out.println(age);

        // System.out.println(age); yazdirmanin kisa yolu ==> sout yaz enter

        /*
        Javada temelde iki tip data vardir;
        1)primitve data type;
            char, boolean, byte, short, int, long, float, double


        2)non-primitive data type;
            classların hepsi non-primitive data type olur.
            String

         */

        //char data type: 2 byte
        // tek karakterler icin kullanilir. Ornegin ==> A, a, ?, 5
        //Note: char data typeinda degerler tek tirnak icine konulmalidir
        //Ornek 1: char data type'inda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
        //Data Type + Variable Name + Assignment Operator (Atama Operatoru) + Variable degeri + noktali virgul;
            char         isminIlkHarfi                            =                     'A'         ;

        System.out.println(isminIlkHarfi);

        //boolean data type:
        //boolean'lar sadece iki farkli deger alabilir: true (dogru) veya false(yanlis)
        //Ornek 2: boolean data type'inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.

        boolean emeklimisin = false ;
        System.out.println(emeklimisin);


        //byte data type :
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte: -128 den +127 e (dahil)kadar tamsayi degerleri icin kullanilir
        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.

        byte ogrenciYasi = 33;
        System.out.println(ogrenciYasi);


        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir
        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.


        short siteNufusu = 1300;
        System.out.println(siteNufusu);

        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz


        int ulkeNufus = 1130416052;
        System.out.println(ulkeNufus);


        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
        //Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        long cellNumberInHumanBody = 975230865423032L;
        System.out.println(cellNumberInHumanBody);

        //Note: Eger long'a atadiginiz deger int'lerin araligindaysa sonuna L koymaya gerek yok
        //ama intlerin araligi disinda ise bunun Long olduğunu sayinin sonuna L koyarak javaya söylemeliyiz.



        //float data type:
        //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
        //float memory'de 4 byte yer kaplar.
        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun
        //Float olusturdugunuzda sonuna F ya da f koymalisiniz, cunku java ondalikli sayilari otomatik olarak double kabul eder.

        float gomlekFiyati = 299.99F;
        System.out.println(gomlekFiyati);


        // double data type:
        //double memory de 8 byte yer kaplar, virgülden sonra ki rakam daha fazla alir
        //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)
        //Ornek 8: Hucre agirligi icin bir tane variable olusturun

        double hucreAgirligi = 0.0000000000012;
        System.out.println(hucreAgirligi);
        //Note ==> "E" exponent yani turkcede üs demek. 1.2 carpi 10 üzeri -11 demek.








    }

}
