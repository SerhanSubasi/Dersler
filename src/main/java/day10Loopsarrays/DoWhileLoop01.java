package day10Loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

       /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz

 */ //Bu örnekte hoca önce sonsuz loopu oluşturdu sonradan breakleri ekledi gereksinimlere göre.

Scanner input = new Scanner(System.in);

int counter =0;
do {
    if (counter==4) {
        System.out.println("Hesabınız bloke olmuştur");
      break;
    }

    System.out.println("Lütfen kullanıcı adınızı giriniz");
    String userName = input.next();

    System.out.println("Lütfen password giriniz");
    String password = input.next();
if (userName.equals("admin") && password.equals("pwd123")){
    System.out.println("Hesabınıza hoş geldiniz");
    break;
}

counter++;

}while (true);












    }
}
