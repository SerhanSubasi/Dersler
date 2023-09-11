package day21maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String,Integer> stdAges = new HashMap<>();

stdAges.put("Ali", 18);
stdAges.put("Can", 19);
stdAges.put("Tom", 33);
stdAges.put("Veli", 63);
stdAges.put("Ahmet",41);

// keyi tekrarlı kullandığınızda hata vermez, en son verilen etnry'nin değerini kabul eder.
  stdAges.put("Tom", 35);   // ancak best practice değildir.
        System.out.println(stdAges);

        // replace() methodu valueları keyleri kullanarak upgrade etmeye yarar.
stdAges.replace("Tom", 39); // put yerine replace kullanırız, replace daha okunurdur. Yerine koyduk diye.
        System.out.println(stdAges);

        // replace("Tom, 39,41); methodu map içinde key olarak tom ve Valuesi 39 ise 41'e dönüştürür 38 olsa dönüştürmezdi şarta bağladı.
stdAges.replace("Tom",39,41);

stdAges.putIfAbsent("Ayşe",77); // burada önceden Tom vardı onu eklemedi çünkü o var. Kontrol etti yoksa ekledi Ayşe'yi.
        System.out.println(stdAges);

// absent: mevcut olmayan

        // get() ve getOrDefault() methodları eğer aranan eleman mapte var ise ikisi de aynı işi yapar

        System.out.println(stdAges.get("Tom"));
        System.out.println(stdAges.getOrDefault("Tom", 0));


        // eğer eleman mapte yok ise get methodu null verir.
        // getorDefault() methodu ise bizim belirttiğimiz değeri verir.
        System.out.println(stdAges.get("Jerry"));       //null
        System.out.println(stdAges.getOrDefault("Jerry", 0)); // 0 velirttik ve 0 verdi.

        // containsValue() method'u valueların içinde aranan değer olup olmadığını kontrol eder.
        System.out.println(stdAges.containsValue(19));  // true çünkü var içinde
        System.out.println(stdAges.containsValue(99));  // false çünkü içinde yok

        // containsKey() method'u keylerin içinde aranan değer olup olmadığını kontrol eder.
        System.out.println(stdAges.containsKey("TOM")); //false çünkü key sensitive
        System.out.println(stdAges.containsKey("Tom")); //true çünkü Tom var.

        // remove("Tom") methodu key kullanarak entry silmeya yarar.
        stdAges.remove("Tom");      // Tom adaya veda etti.
        System.out.println(stdAges);

        // remove("Can",9) method'u hem key hem de value'u kontrol eder. Eslesirse siler yoksa etmez.
        stdAges.remove("Can",9);        //Can silinmedi çünkü 9 içermiyor, 19 içeriyor. 19 yazsaydık silerdi
        System.out.println(stdAges);



    }

}
