package day22map_exception;

public class E06 {
    public static void main(String[] args) {


        String s = "Java";
        getNumberOfChars(s);

        String t = "";
        getNumberOfChars(t);

        String u = null;
        getNumberOfChars(u);
    }

    //String'in değeri null olduğu zaman string classdaki methodları kullanamazsınız
    //Çünkü Java NullPointerException atar.

    public static void getNumberOfChars (String s) {

        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);
        } catch (NullPointerException e) {
            System.err.println("null değeri için string methodları kullanılamaz");
        }
    }




}
