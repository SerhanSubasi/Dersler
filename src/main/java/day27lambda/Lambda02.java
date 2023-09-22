package day27lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("src\\main\\java\\day27lambda\\LamdaTextFile")).forEach(System.out::println);


        //Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.
Files.lines(Paths.get("src\\main\\java\\day27lambda\\LamdaTextFile")).
        map(String :: toUpperCase).
        forEach(System.out::println);

        //Example 3: Verilen text file icindeki text'lerde "map" kelimesinin olup olmadigini kontrol eden kodu yaziniz.
boolean result1= Files.lines(Paths.get("src\\main\\java\\day27lambda\\LamdaTextFile")).anyMatch(t->t.contains("map"));
        System.out.println("result1 = " + result1);

        //Example 4: Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
       List<String> words = Files.lines(Paths.get("src\\main\\java\\day27lambda\\LamdaTextFile")).
                map(t->t.replaceAll("\\p{Punct}","").split(" ")).
                flatMap(Arrays::stream). // Array formatındaki kelimeleri normala çevirdi. Elde kelimeler kaldı. Array duvarlarını yıktık.
                distinct().
                collect(Collectors.toList());
        System.out.println(words);
        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.

        long numOfLetters = Files.lines(Paths.get("src\\main\\java\\day27lambda\\LamdaTextFile")).
                map(t-> t.replaceAll("[^a-zA-Z]","").split("")).
                flatMap(Arrays::stream).count();    //count sayar.
        System.out.println("numOfLetters = " + numOfLetters);

       List<String> letters = Files.lines(Paths.get("src\\main\\java\\day27lambda\\LamdaTextFile")).map(t->t.replaceAll("[^a-zA-Z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                sorted().collect(Collectors.toList());  //collect listin içine koyar
        System.out.println("letters = " + letters);

        /*
        Foreach, count, collect, reduce, match methodlardan sonra başka methodlar önermez. Terminal Methodlardır.
        Kendisininden sonra method kullanımına izin verenlere : Intermediate Methodlar
        Kendisinden sonra method kullanımına izin vermeyenlere: Terminal Methodlar denir.
         */

    }
}
