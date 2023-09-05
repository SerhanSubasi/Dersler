package day18oop;

public class Animal {
    //Overriding

    /*
    1) Parent classtaki methodu child class içinde özelleştirerek kullanmaya "Overriding" denilir.
    2) Overriding'de method parantezine, method ismine yani method signature'a dokunulamaz!
    Method bodysi değiştirilir.
    3) Parent classta override edilmiş eat() methoduna Overriden Method denir.
        Child classta override edilmiş eat() methoduna Overriding Method denir.

    4) Private methodlar override edilemezler
    5) Child classtaki methodun access modifierı Parent classtaki override edilmiş (Overriden Method) Methodun access modifier'ından
    dar olamaz! . Aynısı olabilir veya daha genişi olabilir.

    Overriden Method ==> protected ==> Overriding method ==> protected + public
    Overriden Method ==> default ==> Overriding method ==> default + protected + public
    Overriden Method ==> private ==> Overriding method ==> override olmaz ki access modifier olsun. (bknz: 4. madde)

    6) Child classta override edilen methodun return type'ı ile parenttaki Method'un return type'ı arasında IS - A ilişkisi varsa
    return type değiştirilebilir.

    7) Methodun return type'ı primitive ise OVerriding yaparken return type değiştirilemez. Çünkü return type ya aynı olur ya da parenttan seçilir,
     ama primitivelar arasında parent child ilişkisi olmadığından parenttan seçmek mevzu bahis olamaz. tek seçenek AYNISI OLMALIDIR.

    8) Child'ta override edilen methodun return type'ı ile, parenttaki methodun return type'ı arasında
    "IS A" ilişkisi yoksa, return type değiştirilemez. Mesela; Integer wrapper class ile Long wrapper class arasında
    "IS A" ilişkisi yoktur, dolayısıyla return type Integer olduğunda Longa değiştirilemez.

    9) Method'un return type'ı void ise, Overriding yaparken return type değiştirilemez. Yani void ise void olarak kalmalıdır.

    10) static methodlar override edilemezler. Çünkü static methodlar tüm childlar için ortak methodlardır.
    Bir child bir ortak methodu değiştirdiğinde diğer childlar bundan olumsuz etkilenebilir.
    Bu yüzden Java static methodların override edilmesine izin vermez.

    11) Final methodlar override edilemezler. Final methodların bodysi değiştirilemez ama Override ederken method bodyi değiştiririz.
    bu bir çelişkidir, bu yüzden java final methodların override edilmesine müsade etmez.

            a) final keywordünü Variablelar ile kullanabilirsiniz
                i) eğer variable final ise mutlaka değer atanmalıdır.
                ii) ilk atanan değer değiştirilemez
            b) final keywordünü Methodlar ile kullanabilirsiniz
                i) eğer method final ise bodysi değiştirilemez.
                ii) method bodysi değiştirilemeyince override yapmak mümkün olmaz.
            c) final keywordünü classlar ile kullanabilirsiniz
                i) class final ise o classın childı olamaz.

   12) Polymorphism = Method Overloading + Method Overriding.
   Polymorphism: Çok şekilliliktir.

     */




    public void eat() {
        System.out.println("Animals eat");
    }


    public void drink() {
        System.out.println("Animals drink");
    }

    public Animal create() {
        return new Animal();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Integer multiply (Integer a, Integer b) {

        return a*b;
    }

}
