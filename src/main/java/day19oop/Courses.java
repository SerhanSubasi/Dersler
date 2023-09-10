package day19oop;

public abstract class Courses {

    //Abstraction: Bir classtan obje oluşturmak istemiyorsak ve sadece child classların yapmaları gereken görevleri
    /*
Bodysi olmayan Methodlara soyut methodlar yani abstract method denir.
bastract yaparakn childların NE yapması gerektiğini belirtiriz, NASIL yapmalarını değil!
Matematik dersi zorunlu abstarct yaptık onu, 6.7.8. sınıflar içlerini kendi müfredatıyla dolduracaklar.
     */

    /*
    1) Eğer bir classtan object oluşturulmasını istemiyorsak ve bu classı sadece child classların
    yapmak zorunda oldukları görevleri belirlemek için kullanıyorsak; "abstraction" yaparız.

    2) Bazen parent classtaki methodun bodysi hiç bir child class tarafından kullanılmaz. Bu durumda parenttaki
    Method'a body yazmak hiç kullanılmadığı için mantıklı değildir. Biz de o Method'a body yazmayız.

    3) Method'un bodysini yazmayınca Java bize hata verir, biz de abstract keywordünü kullanarak javaya
    bu method'un bodysi olmayacak deriz.

    4) Abstract keywordünü kullanınca elde ettiğimiz abstract method normal classlara konulamaz.
    Bu durumda classı da abstract yapmalıyız.

    5) Parenttaki method abstract ise, bütün concrete (somut) child classlar o methodu override etmek zorundadır.
    Bu yüzden tüm childlar için mecburi olmasını istediğimiz methodları abstract yaparız.

    6) Bodysi olan (concrete) Methodlar, abstract classların içine yazılabilir (art methodu örnek). Abstract Methodlar
    concrete classların içine yazılamazlar! Concrete Methodlar child classlar tarafından override edilmek zorunda değildir.

    7) Abstract ketword ile method body bir method'ta aynı anda kullanılamaz.

    8) Final Methodlar abstract olamazlar. Çünkü Override edilemezler. Halbuki Abstract Methodlar Override edilmek için
    oluşturulurlar. Böylece çelişki olmasın diye Java Abstract Methodların final olmasına izin vermez.

    9) Abstract classların içinde Abstract Methodlar olur. Abstract Methodlar'ın bodysi olmadığından eksik Methodlar gibi
    düşünülebilir. Yani Abstract class içinde eksik yapı barındırır. Bu nedenle Java Application'ı korumak için
    Abstract classlardan object oluşturulmasına izin vermiyor.

    10) Abstract classların constructorları vardır ancak obje oluşturamazlar.

    11) Bir Abstract classın Abstract çocuğu da olabilir, concrete çocuğu da olabilir. Eğer child  Abstract ise
    Abstract methodları Override etmek zorunda değildir. Concrete ise Override etmek zorundadır.

    12) abstract methodlar private olamazlar cunku child classlar abstract methodlari override etmek zorundadirlar
    private yapinca kullanima kapali olur, Bu celiskidir, dolayisiyla java abstract methodlarin private olmasina müsaade etmez

    13) classlar final oldugunda child classa sahip olamazlar. Ama abstract classlar icin child class olmalidir
    cunku child classlar abstract parent taki methodlari kullanirlar. Bu yüzden java abstract classlarin final
    olmasina müsaade etmez.

     */

    public abstract void Math();

public void art(){
    System.out.println("Learn art");
}









}