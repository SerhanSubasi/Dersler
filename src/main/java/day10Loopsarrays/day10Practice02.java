package day10Loopsarrays;

import java.util.Arrays;

public class day10Practice02 {
    public static void main(String[] args) {

      String names [] = new String[4];

        names [0] = "Serhan";
        names [1] = "Didem";
        names [2] = "Badiş";
        names [3] = "Sylvanas";

        System.out.println(Arrays.toString(names));

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        // icerdigi karakter sayilari toplamini ekrana yazdirin.

        String elemans [] = new String[5];

        elemans [0] = "Antalya";
        elemans [1] = "Ankara";
        elemans [2] = "İstanbul";
        elemans [3] = "İzmir";
        elemans [4] = "Isparta";

        int totalChar = 0;
        for (int i = 0; i < elemans.length; i++) {
         totalChar = totalChar + elemans[i].length();
        }
        System.out.println(totalChar);



        int total = 0;
        for (  String w :  elemans   ) {
            total = total + w.length();
        }
        System.out.println(total);




    }
}
