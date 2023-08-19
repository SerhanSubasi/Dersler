package day09loops;

import java.util.Scanner;

public class ForLoops01 {
    public static void main(String[] args) {



         /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....
    */


        for (int i = 1; i <=4 ; i++) {
            System.out.println("Week : " + i);

            for (int j = 1; j <=7 ; j++) {
                System.out.println("       Day :" +j);
            }
        }


           /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */
/*
        for (int i = 1; i <=3 ; i++) { //dıştaki loop satır için, satır sayısı kadar çalıştırıyoruz.

            for (int k = 1; k <=5 ; k++) { // içteki loop yan yana yazdığından sütünler için sütün sayısı kadar çalıştı.
                System.out.print("x ");
            }
            System.out.println();   // satır yan yana print ile yazdırıldığından pointeri bir sonraki satıra almak için kullandık
        }

        System.out.println();

*/


Scanner input = new Scanner(System.in);
        System.out.println("Satır (row) sayısını giriniz ");
        int row = input.nextInt();

        System.out.println("Sütun ( column) sayısını giriniz");
        int column = input.nextInt();

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=column ; j++) {
                System.out.println("X ");
            }
            System.out.println();
        }









    }
}
