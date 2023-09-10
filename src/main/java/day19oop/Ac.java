package day19oop;

public interface Ac {

/*
1) Bir interface'i bir classın parentı yapmak için, implements keywordünü kullanırız.

2) Java parentlar class olduğunda multiple parenta müsade etmez. Ama biz bazen multiply parenta ihtiyaç duyabiliriz.
Bu ihtiyacı gidermek için Java interface isimli bir yeni yapı oluşturdu ve bu yapı sayesinde
bir classın çoklu interface parentı olabiliyor. "impelments Ac, Engine, Security"

3) interfacelerin içine concrete method konulamaz. Çünkü concrete methodlarda body var
ve body o Method'un işi nasıl yapacağını belirtir. Ancak işin nasıl yapılacağı bir çok detay içerebilir
ve bu child classlarda kafa karışıklığına sebep olur. Halbuki sadece yapılması gereken işi söyleyip nasıl yapılacağını child'a bırakırsanız, child classın
kafa karışıklığını engellemiş olursunuz.

4) interfacelerdeki tüm methodlar otomatik olarak publictir, abstractır ancak static değildir.

5) intercafeler concrete Method içermezler. Dolayısıyla interface'in içindeki Abstract Methodlar
 child classlar tarafından kullanılması mecburidir. Bu yüzden interfaceler'e "to do list" de denir.

6) Çoklu interface parentların her birinin içine aynı isimli methodlar koyabiliriz.
Mesela AC'nin Engine'in ve Security'nin içlerine run() Method'u koymak gibi.

Child class herhangi birini Override ettiğinde hepsini Override etmiş gibi olur. Sonra da Body'i child classta
yazarak uygulamasını yapmış olur.

7) Interfacelerdeki tüm variablelar otomatik olarak (default olarak) final'dır, bu yüzden interface içindeki variable'ı oluşturduğumuzda
mutlaka değer ataması yapmalısınız.

8) Interfacelerdeki tüm variablelar otomatik olarak (default olarak) final, public ve static'tir.
Interface'lerde variable çağırırken interface adını kullanarak çağırırız. Bu hem static olmanın gereğidir, hem de okunurluğu artırır.

9) Normalde interca içine concrete method konulamaz ama baz özel durumlarda concrete method koymak gerekirse,
a) default keywordünü kullanarak bunu yapabiliriz.
b) static keywordünü kullanarak bunu yapabiliriz.

==> static keywordünü kullanarak oluşturduğumuz concrete methodlara ulaşmak için object oluşturmaya gerek yoktur interface ismi yeterlidir.
==> default keywordünü kullanarak oluşturduğumuz concrete methodlara interfacein child classından
object oluşturarak ulaşılabilir.

10) Interfacelerden object oluşturulamaz. Interfacelerin construuctorı yoktur.

child           parent
class           class       ==> extends
interface       interface   ==> extends
class           interface   ==> implements
interface       class       ==> OLAMAZ

11) Abstract class ile interface arasındaki farklar nelerdir?

a) Abstract classlar hem Abstract Method hem de concrete Methodlar içlerebilir.
fakat interfaceler  Abstract Method içerir.

AMA interfacelerde istersek default ve static keywordlerini kullanarak concrete Method oluşturabiliriz.


b) Abstract classlar multiple inheritance'ı desteklemez, ama interface multiple inheritance'ı destekler.
c) Abstract classlar içinde her türlü variable oluşturulabilir, interfaceler içindeki variable'lar otomatik olarak
public static ve final olmak zorundalar.

d) interface concrete classın childi olamaz ama Abstract class'ın childı olabilir.

e) Abstract classlarda constructor vardır ama object üretemez, interfacelerde constructor yoktur
bu yüzden object üretilemez.



 */

    public static final int price= 2000;//silik çünkü default olarak public static final, int price= 2000; şeklinde de yazılabilirdi.

    public abstract void cool ();   //default olarak public abstract zaten

void run();

default void eco(){     //başına default yazarsak interface içinde concrate method oluşturabiliriz Java8'de gelmiştir. Ancak bu access modifier değildir.
    System.out.println("uses gas less");
}

}
