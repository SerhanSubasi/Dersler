package day23exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) throws IOException {

/*
1) FileNotFoundException ve IOException Compile Time Exceptionlardır. Yani codu yazarken hata alırız.
2) FileNotFoundException path'in doğruluğu ve dosyanın varlığı ile ilgilidir.
    IOException tüm input ve output işlemleri ile ilgilidir.
3) IOException Class, FileNotFoundException classın parentıdır.
    istenirse FileNotFoundException yerin IOException da kullanılabilir.
4) IDExcepton Class ve FineNotFoundException beraber kullanıcak ise FileNotFoundException üstte olmalıdır.

 */



        try {
            FileInputStream fis = new FileInputStream("src/main/java/day23exceptions/file.txt");

            int k =0;
            while ( (k=fis.read() ) != -1) {
                System.out.print( (char) k);    // console'da ascii değer görmemek için char ekledik ki harfler çıksın

            }
        } catch (FileNotFoundException e) {

        }


    }
}
