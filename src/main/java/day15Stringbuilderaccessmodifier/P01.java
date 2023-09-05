package day15Stringbuilderaccessmodifier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class P01 {
    public static void main(String[] args) {

        LocalDate berlinDate = LocalDate.now(ZoneId.of("Europe/Berlin"));
        System.out.println(berlinDate);

        LocalTime berlinTime =  LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(berlinTime);

        LocalDateTime berlinLDT =  LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(berlinLDT);

StringBuilder sb1 = new StringBuilder("Java is fucking hard");
      //  System.out.println(sb1.reverse());

        sb1.insert(0,"Ali ");
        System.out.println(sb1);

        sb1.deleteCharAt(1);
        System.out.println(sb1);

        sb1.delete(3,8);
        System.out.println(sb1);        //  Ai is fucking hard

        sb1.append(" ?");
        System.out.println(sb1);    //Ai is fucking hard ?

        sb1.replace(5,6," not ");
        System.out.println(sb1);    // Ai is not fucking hard ?

        String str = sb1.toString().toUpperCase();
        System.out.println(str);    // Aİ İS NOT FUCKİNG HARD ?

        StringBuilder sb2 = new StringBuilder(str);

        StringBuffer sbf = new StringBuffer("Safa and Yusuf is handsome");
        System.out.println(sbf);


    }
}
