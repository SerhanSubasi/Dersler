package day22map_exception;

public class E01 {


/*
Exception beklenmedik bir problem demektir. JAva çözemediği bir sorunla karşılaştığında exception classı devreye girer.
Exception classı bize karşılaşılan sorunun cinsini ve bu sorunun nereden kaynaklandığını ve sebebini verir.
Java exception firlattığında kodun calısmasını durdurur ve bizden bir karar vermemizi bekler. Bu kısıma log denir.
==> Eger gereksinimlere göre kodumuzun çalışmaya devam etmesini istiyorsak try catch ile exception oluşturması muhtemel
kodlarımızı try catch bloğu içine yazmalıyız.

==> Exception'ı halledebilmek için 2 temel yol vardır.
    a) Exception'a uygun çözümler üretebilirsiniz. Buna Exception Handling denir.
    bunun için try catch kullanılır, try block içinde yapılması istenen islemi javadan yapması istenir.
    Java işlemi problemsiz bir şekilde yaparsa catch block java tarafından okunmaz.
    try blockta işlem yapılırken Exception oluşursa catch block devreye girer ve catch block içindeki kodlar çalışır.
     try blockta işlem yapılırken Exception oluşursa try block içindeki hata sonrası kodlar çalıştırılamaz.
    b) Exception oluştuğunda bunu ilan eder ve geri çekilirsiniz, buna da throw exception denir.


==> catch parantezi içindeki karşılaşmamız muhtemel olan exception class ismini ve bir obje ismini (e),
catch blockuna ise exception ile karşılaştığınızda yapılmasını istediğimiz kodları yazarız.

==> Yazdığımız kod çalışmadığında problemi bulmak için loglara bakarız.



 */


        public static void main(String[] args) {

divide(12,0);


    }





// ArithmethicException yazdığınız code da matematiksel islem kullanıyorsanız alabilecğeiniz bir exception cesididir.
    // if else hata çözümde kesinlikle tavsiye edilmez. Her olasılığı bilemeyiz.
    public static void divide(int a, int b) {
try {
                System.out.println(a/b);
    System.out.println("Try içi görev tamamlandı");
            } catch (ArithmeticException e) {
    System.out.println("Sıfıra bölünemez");
            }

        System.out.println("try catch sonrası kod akışına devam ediyor");


    }



}
