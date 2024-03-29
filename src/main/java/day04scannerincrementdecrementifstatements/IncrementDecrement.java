package day04scannerincrementdecrementifstatements;

public class IncrementDecrement {
    public static void main(String[] args) {



        // Increment

        int a = 5;
        System.out.println(a);

        a = a + 2; //7
        System.out.println(a);

        a += 2; //9 olacak. Bu da yukarıdaki gibi ekleme kodunun daha kısası.
        System.out.println(a);

        // Sonuc 5 7 9 diye arttı.

        //Decrement

        int c = 8;
        System.out.println(c);
        c = c - 3;  //5
        System.out.println(c);
        c -= 3;   //2
        System.out.println(c);

        //Increment 2

        int d = 6;
        System.out.println(d);

        d = d * 2;
        System.out.println(d);

        d *= 2;
        System.out.println(d);

        //Decrement 2

        int e = 24;
        System.out.println(e); //24
        e = e/2;
        System.out.println(e); //12
        e /= 2;
        System.out.println(e); //6


        // 1 ile increment kullanımında bu Syntax kullanılmalı.

        int f = 13;     // 1 arttırdık
        f ++;

        int h = 9;      // 1 düşürdük
        h --;

        System.out.println(f);
        System.out.println(h);

        //post-increment / pre-increment


        int i = 10;
        int k = i++;

        System.out.println(k);//10  i artirilmadan k ya konuldugu icin k nin degeri 10 olur
        System.out.println(i);//11  i satir sonunda artirildigi icin 11 olur



        int m = 15;

        int n = ++m;

        System.out.println(m);//16 m satir sonunda artirildigi icin m nin degeri 16 olur
        System.out.println(n);//16 m artirildiktan sonra n ye konuldugu icin n nin degeri de 16 olur

        //Ornek

        int p = 17;
        int r = p--;

        System.out.println(p);
        System.out.println(r);

        int s = 20;
        int t = --s;

        System.out.println(s);
        System.out.println(t);




    }
}
