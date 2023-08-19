package day08loops;

public class forLoops01 {
    public static void main(String[] args) {


/* Örnek: Ekrana 5 kere "Hi" yazdırın.
5 defa sout hi yazdırmaktansa loop kullanılır.
 4 adet loop vardır


for (   Başlangıç değeri    ;   Loopun çalışma şartı      ;     Artırma / Azaltma     ) {
    Tekrarlamak istediğimiz kodlar
}

*/

for (     int i=1        ;       i<6         ;    i++     ) {

    System.out.println("Hi");
}


//Example 2: 11'den 14'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

 for (   int s=11   ;  s<15   ;  s++  ) {
     System.out.println(s);
 }

 //Example 3: 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz


for (int i=40 ; i>22 ;  i--    ) {
    if (i%2==0) {
        System.out.println(i);
    }
}






    }
}
