package day16staticoop;

public class Animal {
    /*

    1) Inheritance
    2) Polymorphism
    3) Encapsulation
    4) Abstraction

   1) Inheritance: Özellikleri bir classtan diğerine alır. Ev yapmak için çimento lazımsa fabrika açmazsın, gider hazırı alırsın.

   Özellikleri bir classtan diğer classlara alan kavramdır, mesela; Bir class oluşturacağız ama daha önce oluşturulmuş bir class
   bizim istediğimiz özelliklerin bir çoğunu kapsıyor. O zaman yeni oluşturduğumuz classı özelliklerini kullanmak istediğiniz class'a
   child yaparız.
   */

// parent: tepedeki ortak özelliklerin olduğu class. Super de denilir.
// child: istenildiğinde parent'tan özellikleri alabilen class. Sub da denilir.
// extends keyword ile kimin parent kimin child olduğunu Java'ya söyleriz.

 /*
 1) Inhentiance sayesinde;
    a) Code tekrarlarından kurtuluruz.
    b) Code tamiri (maintenance) kolay olur.
    c) Child Class'ları daha atomic yaparız.

 2) Bir class'ı başka bir class'ın child class'ı yapmak için
    extends keywordünü kullanırız.

 3) Child class objectleri Parent class'tan method ve variableları kullanabilirler.

 4) Parent class objectleri child class'tan method ve variableri kullanamazlar. (Baba evladına üzüm bağı bağışmaış, evlat bir salkım vermemiş)

 5) Java'da bir class'ın sadece bir tane parent'ı olur, çoklu parent'a Multiple Inheritance derler.
    tekli parent'a single Inheritance derler. Java Multiple inheritince'ı desteklemez ve single kullanır.

 6) Apartman şeklindeki inheritance yapısına " Multilevel Inheritance " denir, ve Java bunu destekler.

 7) Object class her class'ın parentıdır. Java da object class haric her classın parentı vardır.

 8) Aşağıdan yukarıya giden Multilevel Inheritance ilişkisine "IS A Relationship" denir. Kediler memelidir, memeliler Animaldır ...
    Yukarıdan aşağıya giden Multilevel Inheritance ilişkisine "HAS A Relationship" denir. Animal, memeliye shaiptir, memeli kediye...

 9) Java'da her class'ın bir tane default constructor'ı vardır. Ancak bu default constructor class'ın içinde görünmez. Çünkü
    default constructor Object class'ının içindedir. Object class'da tüm classların parent'ıdır.

 10) Child classtan bir object oluşturduğunuzda constructorlar en üstteki parent classtan başlatılarak alta doğru çalıştırılır.





  */

public void eat() {
    System.out.println("Animals eat...");
}

public void drink() {
        System.out.println("Animals drink...");
    }




}
