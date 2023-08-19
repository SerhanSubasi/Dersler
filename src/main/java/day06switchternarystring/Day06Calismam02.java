package day06switchternarystring;

public class Day06Calismam02 {
    public static void main(String[] args) {

int a = 13;
int b = -3;

       Object result = a>0 && b>0 || a<0 && b<0 ? a*b : "Farklı işaretli sayıları çarpamıyorum";
        System.out.println(result);




int num2 = 33;

 String result2 = num2>99 && num2<1000 ? "Sayı üç basamaklıdır" : "Sayı üç basamaklı değildir";
        System.out.println(result2);




int year = 2023;

String resultYear = year%100==0 ? year%400 ==0 ? "Leap Year" : "Not Leap Year": year%4 ==0 ? "Leap Year" : "Not Leap Year";
        System.out.println(resultYear);









    }
}
