package day12ArrayLists;

public class MethodCreation01 {
    public static void main(String[] args) {

        /*
        Java'da method nasıl oluşturulur?

        1) main methodun dışında, classın içinde oluşturulur.
        2) Access Modifier + return type + Method ismi + () + { }
        3) Oluşturulan method nasıl kullanılır?
        a) Method oluşturmak methodu çalıştırmak için yeterli değildir.

         */

//Method call : "Main method içinde bir method kullanılmasınıa method call denir.
        int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);
    }

//Ornek 1: toplama işlemi yapan bir method oluşturunuz.

    public static int toplamaYap (int a, int b) {
    return a+b;         // bize geri ver dedik toplamı

//Main Method içine method ismi ve parametreleri yapmaya Method Call deniyor.
    }


}
