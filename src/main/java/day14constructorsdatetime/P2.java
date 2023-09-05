package day14constructorsdatetime;

import java.time.LocalDate;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {


        LocalDate  simdikiZaman = LocalDate.now();
        System.out.println(simdikiZaman);

        LocalDate spesifikZaman = LocalDate.of(2020, 8, 11);
        System.out.println("spesifikZaman = " + spesifikZaman);

        System.out.println(simdikiZaman.getMonthValue());
        System.out.println(simdikiZaman.getYear());
        System.out.println(simdikiZaman.getDayOfWeek());

        System.out.println(simdikiZaman.getMonth());
        System.out.println(simdikiZaman.getDayOfWeek());

//ileri tarihe nasıl gidilir?
        System.out.println(simdikiZaman.plusYears(2).plusMonths(3).plusDays(1));
        System.out.println(simdikiZaman.minusYears(2).minusMonths(3).minusDays(1));

LocalDate sdg = LocalDate.of(1993, 4,29);
LocalDate zdg = LocalDate.of(1989, 2,28);

boolean dogumGünüKiyasi = sdg.isBefore(zdg);
        System.out.println(dogumGünüKiyasi);

boolean dgk = sdg.isAfter(zdg);
        System.out.println("dgk = " + dgk);


        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

  // Scanner input = new Scanner(System.in);
  // System.out.println("Lütfen Yıl, Ay ve Gün'ü sırasıyla giriniz");

  // int yıl = input.nextInt();
  // int ay = input.nextInt();
  // int gun = input.nextInt();

  // LocalDate verilenTarih = LocalDate.of(yıl,ay,gun);

  // if (verilenTarih.isBefore(LocalDate.now())) {
  //     System.out.println("Geçersiz tarih girdiniz");

  // } else {
  //     System.out.println("Zamanı girebilirsiniz");
  // }

//Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen doğum tarihinizi giriniz");

        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

LocalDate tarih = LocalDate.of(y,m,d);
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());

    }
}
