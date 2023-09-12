package day21maps;

import java.util.Arrays;
import java.util.HashMap;

public class Ödev {
    public static void main(String[] args) {

        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1


String s = "Hello Henry!";

        s = s.replaceAll("\\p{Punct}","");
        s = s.replaceAll("\\s","");

        System.out.println(s);


     String words [] = s.split("");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> occ = new HashMap<>();

        for ( String w : words ) {
            Integer numsOfOcc =  occ.get(w);
            if (numsOfOcc == null) {
                occ.put(w,1);
            } else {
                occ.put(w, numsOfOcc+1);
            }
        }
        System.out.println(occ);


    }
}
