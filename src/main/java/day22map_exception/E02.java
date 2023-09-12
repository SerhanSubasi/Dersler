package day22map_exception;

public class E02 {
    public static void main(String[] args) {

        String s = "1234a";

        convertStringToInt(s);

    }

// içinde rakamlar dışında bir character olan stringi sayıya çevirmek isterseniz java NumberFormatException atar.
    public static void convertStringToInt (String s) {

        try {
            int intS = Integer.valueOf(s);
            System.out.println(intS + 1);

        } catch (NumberFormatException e){
            System.out.println("Bir String'i sayıya dönüştürebilmek için rakam dışı character girmemelisiniz.");
            System.out.println(e.getMessage());
        }



    }
}
