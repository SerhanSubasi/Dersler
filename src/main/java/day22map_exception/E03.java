package day22map_exception;

public class E03 {
    public static void main(String[] args) {

    String s = "Java";
        getCharFromString(s,2);
        getCharFromString(s,4);


    }
    // Stringlerde var olmayan indexler kullanıldığında Java bize StringIndexOutOfBoundsException atar.

    public static void getCharFromString(String s, int idx){


        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan indez kullanma hatası yaptınız. " + e.getMessage());
e.printStackTrace();        // consoldaki tüm detayları yazdırır.
            System.out.println(e.getCause());    // hatanın sebebini yazdırır.
        }


// ctrl + alt + t ile try catch kısayoluna erişebiliriz.
// serr kısayolu ile kırmızı yazı yazdırabiliriz.

    }



}
