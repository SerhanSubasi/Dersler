package day26lambda;

import java.util.stream.IntStream;

public class lambda03 {
    public static void main(String[] args) {


        int sum = getSumFromSevenToSeventy();
        System.out.println(sum);
        int sum2 = carpim();
        System.out.println(sum2);
        int sum3 = getFactorial(5);
        System.out.println(sum3);
       int sum4 = getSumOfEvensBetweenTwoInteger(3,7);
        System.out.println(sum4);
    }

    //4)7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy() {
        return IntStream.
                rangeClosed(7, 70).
                reduce(Math::addExact).
                getAsInt();
    }

    public static int carpim() {
        return IntStream.    // tüm integarları verir bize.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    public static int carpim2() {
        return IntStream.
                range(3, 10).    //range kullanırsak 1 fazla yazmalıyız. RangeClosed iyidir.
                        reduce(Math::multiplyExact).
                getAsInt();
    }

    //6)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.

    public static int getFactorial(int x) {
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("Geçersiz data girdiniz");
            return -1;
        } else {
            return IntStream.   // LongStream de var, değer çok uzun çıkacaksa.
                    rangeClosed(1, x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }
    }

    //7)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz. //veren dedi yazdıran demedi o yüzden int yazdık void değil
     public static int getSumOfEvensBetweenTwoInteger(int a, int b) {

        if (a>b){
            int temp = a;   //tempurary'den geliyor geçici demek, geçici bir tabak oluşturduk ve ondan ona ondan ona aktardık.
            a=b;
            b=temp;
        }

       return IntStream.
               range(a + 1, b).
               filter(Utils::isNumberEven).
               sum();    //reduce(Math::addExact) yerine doğrudan sum var.

    }






}
