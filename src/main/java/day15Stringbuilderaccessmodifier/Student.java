package day15Stringbuilderaccessmodifier;

public class Student {
   /*
   ACCESS MODIFIER

    1) Public
    2) Protected
    3) Default
    4) Private

   public > protected > deafult > private

   public    ==>    Her classtan kullanılabilir
   protected ==>    Başka packagelardan kullanılamaz, ancak başka packagelarda child classlar içinden kullanılabilir.
   default   ==>    Başka packagelarda kullanılamazlar
   private   ==>    Sadece oluşturuldukları class içinden kullanılabilirler.

  Not: Protected ile default farkı interview sorusu olabilir.

    */

    public String stdName = "Ali Can";
    protected String stdAddress = "Istanbul";

    //default access modifierlarda default keyword yazılmaz. Başına hiç bir şey yazılmayınca default olur o.
    //deafult olanlar başka packagelardan kullanılamazlar, önceki day packagelarında hep aynı isimle oluşturduk str num vs ama sorun olmadı işte bu yüzden.
    String stdMail = "Alican@gmail.com";

    private String ssnId = "123456789";



}
