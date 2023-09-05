package day10Loopsarrays;

import java.util.Arrays;

public class day10Practice03 {
    public static void main(String[] args) {

        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        //1.YOL
        int days [] = new int[6];
        days [0] = 20;
        days [1] = 23;
        days [2] = 19;
        days [3] = 44;
        days [4] = 15;
        days [5] = 32;

        Arrays.sort(days);
        System.out.println(days[0] + days[days.length - 1]);

        //2.YOL

int minimum = days[0];
int maximum = days[0];

        for ( int w  : days ) {
           minimum = Math.min(minimum,w);
           maximum = Math.max(maximum, w);
        }

        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(minimum + maximum);










    }
}
