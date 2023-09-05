package day14constructorsdatetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {

// Her uygulamada yapılan işlem nanosaniyesine kadar takip edilir. Her app'te DateTime vardır.

    //İçinde bulunduğumuz zaman dilimindeki tarihi verir.
      LocalDate myCurrentDate =  LocalDate.now();   //LocalDate.now'ı yine LocalDate kavanozuna koyduk
        System.out.println(myCurrentDate);

        System.out.println(myCurrentDate.getMonthValue());  //get.MounthValue ile sadece ayı aldı getirdi.
        System.out.println(myCurrentDate.getYear());        //getYear ile sadece yılı aldı getirdi.
        System.out.println(myCurrentDate.getDayOfMonth());  //getDayOfMonth ile sadece günü aldı getirdi.

        System.out.println(myCurrentDate.getMonth());       //getMonth Mount return ediyor. Bu AUGUST String değil. Enum bunlar.
        System.out.println(myCurrentDate.getDayOfWeek());   //getDayOfWeek de bir enumdır. Haftanın gününü yazarak verdi.

        //ileri tarihe nasıl gidilir?
        System.out.println(myCurrentDate.plusDays(3).plusMonths(2).plusYears(1)); // Bugünden 3 gün 2 ay 1 yıl sonra 2024-10-31.
        System.out.println(myCurrentDate.minusYears(1).minusDays(2).minusMonths(3)); //Bugünden 2 gün 3 ay 1 yıl önce 2022-05-26.

        //Specific bir tarih objesi nasıl oluşturulur?
        LocalDate date1 = LocalDate.of(1980,8,10);   // LocalDate.of ile  ==> 1980-08-10
        LocalDate date2 = LocalDate.of(1990,8,10);   // LocalDate.of ile  ==> 1980-08-10
        System.out.println(date1);


      boolean r1 =  date1.isBefore(date2);  //  date1, date2'den önce mi diye sorduk true geldi.
        System.out.println(r1);

        boolean r2 = date1.isAfter(date2);  // date1, date2'den sonra mı diye sorduk false geldi.
        System.out.println(r2);


        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Plase enter year, month and day numbers in the given order");

        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();


        LocalDate givenDate = LocalDate.of(year, month,day);


        if(givenDate.isBefore(LocalDate.now())){
            System.out.println("Invalid date");
        }else {
            System.out.println("Enter time for the ticket");
        }

//Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
      System.out.println("Please enter year, month, and day numbers in the given order");
      int y = input.nextInt();
      int m = input.nextInt();
      int d = input.nextInt();

      LocalDate date = LocalDate.of(y,m,d);

      System.out.println(date.getDayOfWeek());



    }
}
