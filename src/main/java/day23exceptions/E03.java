package day23exceptions;

public class E03 {
    public static void main(String[] args) {

        /*
        1) Exception olsa da olmasa da çalıştırılması gereken kodlar var ise, "finally block" içine yazarız.
        2) Database ile bağlantıyı kesme işini yapan kodlar gibi kodlar, her halükardo çalıştırılmalıdır.
        İşte bu tarz kodları finally block içine koyarız.
        3) try tek başına kullanılamaz, try  + 1 catch olur - try + cok catch olur
            try ile coklu catch ve finally block kullanılabilir.
4) coklu finally block kullanilamaz


         */

int a= 12;
int b = 0;
int c [] = {3,5,7,9};
getNumberFromIntArray(c,a,b);


    }

    public static void getNumberFromIntArray(int [] c, int a, int b) {


        try {
            int idx = a/b;
            int element = c[idx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Cut the connection with the Database");
        }


// finally ile  database ile bağlantıyı kesiyoruz.
// exception classı ile aslında hepsini içine alabiliyoruz.




    }
}
