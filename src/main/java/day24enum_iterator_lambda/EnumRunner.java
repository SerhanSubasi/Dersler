package day24enum_iterator_lambda;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        Cities Hatay = Cities.HATAY;
        System.out.println(Hatay);

        String AntalyaCityNAme = Cities.ANTALYA.getCityName();
        System.out.println(AntalyaCityNAme);

        String postalNoOfAnkara = Cities.ANKARA.getPostalCode();
        System.out.println(postalNoOfAnkara);

        int plateCodeOfIstanbul = Cities.İSTANBUL.getPlateCode();
        System.out.println(plateCodeOfIstanbul);

        ////Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen plaka kodunu giriniz");
        int plaka = input.nextInt();

        // Values methodu Enum içindeki tüm dataları bir array içinde bize verir.
        Cities sehirler[] = Cities.values();
        //  System.out.println(Arrays.toString(sehirler)); // Tüm sehirleri verdi.

        if (plaka > 81 || plaka <=0) {
            System.out.println("Girmiş olduğunuz plaka geçersizdir.");
        } else {
            for (Cities w : sehirler) {
                if (plaka == w.getPlateCode()) {

                    System.out.println("Girmiş olduğunuz plaka " + w.getCityName() + " iline aittir.");
                    break;
                }


            }

        }
    }
}