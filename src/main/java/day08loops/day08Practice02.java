package day08loops;

public class day08Practice02 {
    public static void main(String[] args) {


//Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"

        String kelime = "I love Java";
        for (int i = 0; i < kelime.length(); i++) {
            char ch = kelime.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }

        System.out.println();

        String s = "Didemko ve Serhankocum";
        for (int i = 0; i < s.length(); i++) {
            char mh = s.charAt(i);
            if (mh == 'c') {
                break;
            }
            System.out.print(mh);
        }

        System.out.println();

        String d = "Didemciğimin güzel yüzüs";
        for (int i = 0; i < d.length(); i++) {
            char lh = d.charAt(i);
            if (lh == 's') {
                break;
            }
            System.out.print(lh);
        }
        System.out.println();

//example 2 :Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        String h = "Pwd12?Ab";
        for (int i = 0; i < h.length(); i++) {
            char yue = h.charAt(i);
            if
                (yue >= 'a' && yue <= 'z') {
                continue;
            } else{
                System.out.print(yue);
            }

        }
        System.out.println();

String a = "SylERdsjHAN<3";

        for (int i = 0; i < a.length(); i++) {
            char ad = a.charAt(i);
            if (ad >= 'a' && ad<= 'z') {
                continue;
            }
            System.out.print(ad);
        }
        System.out.println();
String q = "DjrthrİbdfDesrkeEbgrM<3";
        for (int i = 0; i < q.length(); i++) {
            char qe = q.charAt(i);
            if (qe >= 'a' && qe<= 'z') {
                continue;
            }
            System.out.print(qe);
        }
        System.out.println();

        //example 3  Bir String'i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

String j = "avaJ";
String ters = "";

        for (int i = j.length()-1; i >=0; i--) {
            ters = ters + j.charAt(i);

        }
        System.out.println(ters);

        System.out.println();


        String yeni = "mediD ev nahreS";
        String t = "";

        for (int i = yeni.length()-1; i >=0; i--) {
           t = t + yeni.charAt(i);
        }
        System.out.println(t);



















    }
}
