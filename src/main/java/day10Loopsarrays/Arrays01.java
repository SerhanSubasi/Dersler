package day10Loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
//Array dizi demek, aynı data tipinbdeki çoklu dataları depolamak için oluşturduğu yapıdır.



     //Array nasıl oluşturulur?
     String stdNames [] = new String[5]; //5 tane yer ayırdı içlerinde de null var şu an.
     // başta hangi tipi belirtiyorsan o tipi koyarsın. String ise String.

    //Arrayler nasıl yazdırılır?
    //sout ile ismini (stdNames bu örnekte) yazarsan referansını verir.
        System.out.println(stdNames);

    //Arrayin içindekini eskisi gibi konsola yazdırmak istersen     Arrays.toString gerekiyor içine de isim.
        System.out.println(Arrays.toString(stdNames));


     //toString() methodunu kullanmadan sadec e array ismi ile yazdırırsanız java o Arrayin adresini yazdrır.
     // İNdex bunda da geçerlidir. 5 yazdık ya, 0-4 arası index değerleri.

stdNames [2] ="Alperen";
stdNames [4] ="Cemil";
stdNames [3] ="Tuba";
stdNames [1] ="Ahmet";
stdNames [0] ="Serhan";
        System.out.println(Arrays.toString(stdNames));

//Array'den specific bir elemanı almak?
        System.out.println(stdNames[0]);

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.
//Note: Stringlerde kullandığımız lenght() methodtur. Arraylerde kullandığımız lenght variable'dır.

String cities [] = new String[5];
        cities [0] = "Miami";
        cities [1] = "Sivas";
        cities [2] = "Frankfurt";
        cities [3] = "Yozgat";
        cities [4] = "Ankara";

        // 1.yol for loop
        int totalChar =0;
        for (int i = 0; i <cities.length; i++) {
            totalChar = totalChar + cities[i].length();
        }

        System.out.println(totalChar);

        //2.yol for-each loop (enhanced loop - zenginleştirilmiş)
        // for each arrayler ve collactionlarla kullanılıyor.

int sum =0;
        for (String w : cities ){
           sum= sum + w.length();
        }

        System.out.println(sum);


    }
}
