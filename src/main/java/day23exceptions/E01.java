package day23exceptions;

import java.io.FileInputStream; // input output'un kısaltılmışı
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    public static void main(String[] args) throws IOException { // More actions ile Java'ya yaptırdık burayı. İstediğimiz kadar ekleyebiliriz devamına.


        /*
        1) Run Button'a bastıktan sonra console'da alınan exceptionlara Runtime Exception denir.
        ArithmeticException, NullPointerException vs.
        RunTime Exceptionlara Enchecked Exception da denir.

        2) Code yazarken kırmızı alt çizgi şeklinde alınan Exceptionlar da vardır. Bunlara da Compile Time Exception
        denir, ce Compile Time Exceptionlara Checked Exception da denir.


        Interview sorusu
        throw ile throws arasındaki farklar nelerdir?

        1) throw, method bodysi içinde kullanılır. throws ise method parantezinden sonra signature yanında kullanılır.
        2) throw, method bodysi içinde istenilen yerde istenildiği kadar kullanılabilir.
           throws ise method signature'dan hemen sonra ve sadece 1 kere kullanılır.
        3) throwdan sonra new keywördü ve constructor kullanarak obje oluşturulur
           throwsdan sonra ise sadece Exception class ismi yazılır.

         4) throw belli şartlar için Exception fırlatmada kullanılır
         throws ise bir methodun belli bir exception'un fırlatılabileceğini belirtmek için kullanılır.


         */


        FileInputStream fis = new FileInputStream("src/main/java/day23exceptions/file.txt");

        int k =0;
        while ( (k=fis.read() ) != -1) {
            System.out.print( (char) k);    // console'da ascii değer görmemek için char ekledik ki harfler çıksın

        }




    }

}
