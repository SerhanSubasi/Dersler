package day16staticoop;

import java.time.LocalDate;

public class StaticBlock {

    //bir variable oluşturduğunuzda değer atamazsanız o variable'ı "initialize" etmediniz demektir. (inişialayz)

    static double pi;      //şu an buna değer vermedik,-double pi = 0; yapmadık.-  buna java default verdi. "0"


    public static int price;    //bu değişeceği için değer girmedik baştan.


    //birden fazla static block var ise yukarıdan aşağıya çalışır.
    static {

        LocalDate currentDate = LocalDate.now();
        if (currentDate.getMonthValue()==2){    //şubat ayındaysan 2. aydaysan 1000 olsun fiyatı
            price=1000;
        } else {                                // diğer aylarda 2000 olsun.
            price=2000;
        }
    }


static  {
    pi = 3.14;      // Bu aşağıda olsa bile static block önce çalışırdı.
    System.out.println("Static block 1");
}

//static block oluşturduk. Main method'dan önce pi hazır olmuş olacak.
// master chef patates soğan soymazla uğraşmaz, başkası hazırlar o yaptırır. O mantık var.
//bazen main method çalıştırılmadan önce variable'ların hazır hale getirilmesi gerekebilir.
// bu yüzden static blocklar kullanılır.
//static variable'lar static blocklar içinde initialize edilirse, o class'ın içinde her şeyden öcne
//hazır hale getirilmiş olur.


    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println("main method");

    }
}
