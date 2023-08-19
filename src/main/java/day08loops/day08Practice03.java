package day08loops;

public class day08Practice03 {
    public static void main(String[] args) {

//Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
// 578 ==> 5+7+8 = 20

  int sum = 0;

        for (int i = 578; i >0; i= i/10) {
            sum= sum+ i%10;

        }
        System.out.println(sum);

int sayı = 0;
        for (int i = 8549; i >0 ; i= i/10) {
            sayı=sayı + i%10;

        }
        System.out.println(sayı);

int sayi = 0;
        for (int i = 234; i >0; i=i/10) {
            sayi=sayi+i%10;
        }
        System.out.println(sayi);


        // Bir stringteki tekrarsiz karakterleri veren kodu yaziniz
        //          mehmet ==> ht

        String t = "mehmet";
        String unique = "";

        for (int i = 0; i <t.length() ; i++) {
            char ch = t.charAt(i);
            if (t.indexOf(ch) == t.lastIndexOf(ch)) {

                unique = unique + ch;
            }
        }
        System.out.println(unique);

        String s = "Serhan";
        String essiz = "";

        for (int i = 0; i <s.length() ; i++) {
            char sh = s.charAt(i);
            if (s.indexOf(sh) == s.lastIndexOf(sh)){
                essiz = essiz + sh;
            }
        }

        System.out.println(essiz);


String yepisyeni = "Didemko";
String benzersiz = "";

        for (int i = 0; i < yepisyeni.length(); i++) {
            char th = yepisyeni.charAt(i);
            if (yepisyeni.indexOf(th) == yepisyeni.lastIndexOf(th)) {
                benzersiz = benzersiz + th;
            }
        }
        System.out.println(benzersiz);


//Example 1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26

int total = 0;

        for (int i = 5; i <=8 ; i++) {
            total = total + i;
        }
        System.out.println(total);



int toplam = 0;

        for (int i = 3; i <=9; i++) {
            toplam = toplam + i;
        }
        System.out.println(toplam);


int toplam2 = 1;
        for (int i = 7; i <=9 ; i++) {
            toplam2 = toplam2 * i;
        }
        System.out.println(toplam2);


   int total2 = 1;

        for (int i = 1; i <=9; i++) {
            total2 = total2 * i;
        }
        System.out.println(total2);


    }
}
