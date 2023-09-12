package day22map_exception;

public class E05 {
    public static void main(String[] args) {
// Birden fazla hata alabilme senaryosu

        int a = 12;
        int b = 1;
        String s = "My Java";

    getCharFromString(s,a,b);


    }

    public static void getCharFromString (String s, int a, int b) {


        try {
            int idx= a/b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero ");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullandınız");
        }

/*
try kısmında birden fazla exception oluşturma ihtimali olan kod varsa, çoklu catch kullanabiliriz.
Çoklu catch kullandığımızda exception classlar arasında parent child ilişkisi yoksa catchlerin sırası önemli değildir.
Ama koddaki sıralamaya uymak tavsiye edilir.

Çoklu catch kullandığınızda Exception classlar arasında parent child ilişkisi varsa catchlerin sırası önemli hale gelir
ve child olan class üstte olmalıdır.

 */



    }

}
