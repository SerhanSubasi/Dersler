package day11multidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {

        //Example : Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47

int small = ages[0] [0];
int large = ages[0] [0];


        for ( int [] w : ages ) {       //{ {15, 4}, {12, 43, 21} };
            for ( int k : w ) {         // 15,4,12,43,21
                small = Math.min(small,k);
                large = Math.max(large,k);
            }
        }
        System.out.println(small);
        System.out.println(large);
        System.out.println(large + small);



    }
}
