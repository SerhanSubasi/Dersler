package day09loops;

public class day09Practice02 {
    public static void main(String[] args) {

        //Example : verilen sayıda ondalık kısımdaki rakamların toplamını bulun
        //            28.587 ==> 5+8+7=20
/*
        double num = 28.587;
        String sNum = String.valueOf(num);
        String decimalPart = sNum.split("[.]")[1];
        int intDecimalPart = Integer.valueOf(decimalPart);

        int sum = 0;
        for (int i = intDecimalPart; i >0 ; i=i/10) {
            sum = sum + i%10;

        }
        System.out.println(sum);
*/

double num = 47.264;
String sNum = String.valueOf(num);
String decimalPArt = sNum.split("[.]") [1];
int intDecimalPart = Integer.valueOf(decimalPArt);

int sum = 0;
        for (int i = intDecimalPart; i >0 ; i=i/10) {
            sum = sum + i%10;
        }

        System.out.println(sum);





    }
}
