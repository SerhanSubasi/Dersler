package day14constructorsdatetime;

import day10Loopsarrays.p1;

import java.util.Scanner;

public class P1Runner {

    public static void main(String[] args) {

P1 arac = new P1 ("Serhan", "Subasi", 1994);
        System.out.println(arac.model);
        System.out.println(arac.marka);
        System.out.println(arac.yıl);

        arac.nasıl();
        arac.dururMu();

    }
}
