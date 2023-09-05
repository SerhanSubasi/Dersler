package day15Stringbuilderaccessmodifier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Practice01 {
    public static void main(String[] args) {
        LocalDate madridgDate = LocalDate.now(ZoneId.of("Europe/Madrid"));
        System.out.println(madridgDate);

        LocalTime madridTime = LocalTime.now(ZoneId.of("Europe/Madrid"));
        System.out.println(madridTime);

        LocalDateTime madridDT = LocalDateTime.now(ZoneId.of("Europe/Madrid"));
        System.out.println(madridDT);


        StringBuilder sb1 = new StringBuilder("Java is easy");
       // System.out.println(sb1.reverse());  //avaJ

        sb1.insert(0, "M");
        System.out.println(sb1);        //MJava is easy

        sb1.deleteCharAt(0);
        System.out.println(sb1);        //Java is easy

        sb1.delete(0,5);
        System.out.println(sb1);        //is easy

        sb1.append(" Python?");         //is easy Python?
        System.out.println(sb1);

        sb1.replace(7,14," to learn Java");
        System.out.println(sb1);        //is easy to learn Java?

        String str = sb1.toString().toUpperCase();
        System.out.println(str);        //İS EASY TO LEARN JAVA?    - Artık bir String.

        StringBuilder sb2 = new StringBuilder(str); //Artık bir StringBuilder.

        StringBuffer sbf = new StringBuffer("Practice is done");
        System.out.println(sbf);    //Practice is done


    }
}
