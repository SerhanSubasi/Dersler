package day17oop;

public class Vehicle {

    /*
    Child classdan bir object olusturdugunuzda constructorlar
    en ustteki parent classtan baslatilarak alta doğru calistiriliri

    Child classtaki constructor'tan Parent classtaki constructor'a gidebilmek için super() kullanılır.
    Parent classta birden fazla constructor varsa istenilen constructor super() ifadesinin parentezi içine
    yazılan parametreler ile seçilir.

    Aynı class içindeki constructorları seçmek için this() kullanılır, Aynı class'ta birden fazla constructor varsa
    istenilen constructor this() ifadesinin parantezi içine yazılan parametreler yardımı ile seçilebilir.

    super() ifadesini yazmak isteğe bağlıdır, yazmasanız da orada vardır o görünmezdir. Ama yazılması tavsiye edilir kod okunurluğu için.
    super() ve this() ifadeleri constructor içinde her zaman ilk satırda olmalıdır.
    Bir constructor içinde ya super ya this olmalıdır ikisi birden olmaz.

Inheritance'da variable ve methodları çağırmak için this veya super kullanılır.

this aynı class içindeki variableları ve methohları çağırmak için kullanılır
super parent class içindeki variableları ve methodları çağırmak için kullanılır.


     */
    public Vehicle(){
        super();
        System.out.println("Vehicle 1");
    }
    public Vehicle (int price){
        System.out.println("Vehicle 2");
    }
}