package day09loops;

import java.util.Scanner;

public class day09Practice01 {
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

        for (int i = 1; i <=4; i++) {
            System.out.println("Week :" +i);
            for (int j = 1; j <=7 ; j++) {
                System.out.println("Day :" +j);
            }
        }

        //Örnek 2:

        for (int i = 2; i <=5 ; i++) {
            System.out.println("Serhanko :" +i);
            for (int j = 2; j <=6; j++) {
                System.out.println("Didemko :" +j);
            }
        }

/*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */
/*
        for (int i = 1; i <=3 ; i++) {

            for (int j = 1; j <=5 ; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
*/

   Scanner input = new Scanner(System.in);
        System.out.println("Satır (row) sayısını giriniz");
int row = input.nextInt();
        System.out.println("Sütun (column) sayısını giriniz");
int column = input.nextInt();
        System.out.println("Yazmak istediğiniz karakteri giriniz");
        String character = input.next();


        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=column ; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }







    }
}
