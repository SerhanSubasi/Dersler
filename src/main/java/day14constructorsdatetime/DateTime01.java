package day14constructorsdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //LocalTime.now ile anı tam olarak veriyor.
        LocalTime myCurrentTime = LocalTime.now();      //13:32:11.651998700 nano saniyesini verdi.
        System.out.println(myCurrentTime);

        //Yine benzer methodlarla geçmişe ileriye gidebiliriz.

        /*
DateTime Class ta kullanilan tarih saat formatlari
    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a ==> 12'li saat sistemi AM, PM
    HH : mm : ss==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */

        //time objesini formatladık
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm");
        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println(formattedTime);  //15 : 32

        //Date objesini formatlayalım
        LocalDate date1 = LocalDate.of(2022, 8, 28);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
String formattedDate =  dtf2.format(date1);
        System.out.println("formattedDate = " + formattedDate);

                                                                //28/Ağustos/2023
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(dtf3.format(date1));

//Baska bir zaman dilimindeki tarih ve zamanı nasıl alırız

        //Tokyoda ayın kaçı
LocalDate tokyoZaman = LocalDate.now(ZoneId.of("Asia/Tokyo"));                                    //now. içine zoneID.of verirsen oluyor.
        System.out.println(tokyoZaman);

//Amsterdam'da ayın kaçı
        LocalDate amsterdamZaman = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(amsterdamZaman);
//Tokyo'da saat kaç
 LocalTime tokyoSaat = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoSaat);

//LocalDateTime ile çözüm
        LocalDateTime almanya = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("almanya = " + almanya);     //2023-08-29T10:10:56.028895700
                                                        //T'ye kadar olanı Date, kalanı Time.

                                            //29 * Aug * 2023 - 11 : 18  ==> Böyle görmek istiyoruz aşağıda

DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm");
        String formatedAlmanya =  dtf4.format(almanya);
        System.out.println("formatedAlmanya = " + formatedAlmanya);     //29 * Ağu * 2023 - 10 : 18




    }
}
