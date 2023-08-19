package day06switchternarystring;

public class Ternary01 {
    public static void main(String[] args) {

        //Ornek : Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0

        int c =4;
        int result = c < 0 ? -1 * c : c;
        System.out.println(result);

        //Ornek: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.


        int a = 3;
        int b = 13;
        // condition        ?           ilk çıktı      :        ikinci çıktı        ;
        Object result2 = (a>0 && b>0) || (a<0 && b<0) ?      a*b        :       "Farklı işaretleri çarpamıyorum" ;
        System.out.println(result2);

// Object, farklı typelardaki dataları tek bir yerde toplar hata verdirtmez. int + String burada Object'de birleşti.
        // "Objecté bütün Non-primitive data typelarının (Class) ortak parent'ıdır.
        // "Object" classın parentı yoktur. (Hz.Adem gibi bu)





















    }
}
