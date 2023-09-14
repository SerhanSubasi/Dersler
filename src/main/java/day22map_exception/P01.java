package day22map_exception;

public class P01 {
    public static void main(String[] args) {

int a= 12;
int b= 1;
String s = "My Java";

getCharFromString(s,a,b);


    }
public static void getCharFromString (String s, int a, int b) {

    try {
        int idx = a/b;
        char ch = s.charAt(idx);
        System.out.println(ch);
    } catch (ArithmeticException e) {
        System.out.println("Bölen 0 olamaz.");
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("String indexi taştı");
    }



}


}



