package day10Loopsarrays;

import java.util.Scanner;

public class day10Practice01 {
    public static void main(String[] args) {

        /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz

 */
        //Bu örnekte hoca önce sonsuz loopu oluşturdu sonradan breakleri ekledi gereksinimlere göre.

        Scanner input = new Scanner(System.in);

        int counter = 0;

        do {

            if (counter == 4){
                System.out.println("Hesabınız bloke olmuştur");
                break;
            }


            System.out.println("Lütfen kullanıcı adınızı giriniz");
            String userName = input.next();
            System.out.println("Lütfen password'ünüzü giriniz");
            String psw = input.next();

            if ( userName.equals("admin") && psw.equals("pwd123")) {
                System.out.println("Hesabınıza hoş geldiniz");
                break;
            }

            counter++;

        } while (true);





















    }
}
