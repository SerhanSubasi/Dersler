package day16staticoop;

public class Student {


    /*

    1) Static variable veya static methodlar (class member) tüm objeler için ortak elemandır.
    2) İşte bu static class memberlar üzerinde yapılan değişiklikler tüm objectleri etkiler.
    3) static class memberlar class-a, non static class memberlar objectlere monte edilir.
    4) static class memberlara ulaşmak için object oluşturmaya gerek duyulmaz.
        ama non-static class memberlara ulaşmak için object oluşturmak şarttır.

    5) Bu nedenle static variable'ların diğer adı class variabledır.
        non-static variable'ların diğer adı instance variable veya object variable'dır.
     */

    public static String studentName ="Ali Can"; //static

    public int age =18; //non-static


    public static void staticMethod() {
        System.out.println("Ben static methodum");
    }

    public void nonStaticMethod () {
        System.out.println("Ben static olmayan methodum");
    }


    public static int Sayı = 14;
    public void nonStaticSayı () {}

}
