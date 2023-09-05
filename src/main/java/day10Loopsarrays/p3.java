package day10Loopsarrays;

public class p3 {
    public static void main(String[] args) {

//Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int ages [] = new int[6];
        ages [0] = 34;
        ages [1] = 54;
        ages [2] = 13;
        ages [3] = 67;
        ages [4] = 11;
        ages [5] = 21;

int minimum = ages[0];
int maximum = ages[0];

        for (  int  w  :   ages   ) {
            minimum = Math.min(minimum,w);
            maximum = Math.max(maximum,w);
        }
        System.out.println(minimum + maximum);













    }
    }
