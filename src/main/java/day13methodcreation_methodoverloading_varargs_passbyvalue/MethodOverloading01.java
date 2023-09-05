package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {

//Overloading demek javada aynı isimde farklı işler yapabilen methodlar oluşturmak demek.
/*
1) Method Overloading yaparken method ismi değiştirilmez
2) Method Overloading yaparken parametreler değiştirilir
    a) Parametre değiştirilirken parametrelerin data typeları değiştirilebilir
    b) Parametre değiştirilirken parametrelerin data typeları farklı ise yer değiştirilebilir.
    c) Parametre değiştirilirken parametrelerin sayısı değiştirilebilir.
3) Java için ismi ve parametreleri aynı olan iki method tamamiyle aynıdır.
    Bu yüzden ismi + parametre Method Signature olarak adlandırılır.

4) Method overloading olustururken return type'ı degistirmenin hic bir etkisi yoktur
5) Method overloading olustururken access modifier i degistirmenin hicbir etkisi yoktur
6) Method overloading olustururken static veya non-static yapmanin hicbir etkisi yoktur
7) Method overloading olustururken body i  degistirmenin hicbir etkisi yoktur

8) private methodlar overload edilebilir
private olmak baska classlara gidildiginde problem olur, biz overloading ayni classta yapariz

9) static methodlar overload edilebilir
overloading yapmak icin method isimini degistirmeden method signature i degistiririz, dolayisiyle method signature degistirildiginde
yeni bir method olusturmus oluruz bu nedenle static olmasi bir seyi degistirmez






// Herkes tarafından görülen yani yapılan tüm değişiklikler görülene static deriz. (Staticse dünya malıdır artık o)
// sadece kendisiyle alakalı olanlara da non-static diyoruz.

 */



   add(3,5);


    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void add(double a, double b) {
        System.out.println(a + b);
    }
    public static void add(double a, int b) {
        System.out.println(a + b);
    }
    public static void add(int a, double b) {
        System.out.println(a + b);
    }
    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    //isim + parametre: Method Signature denir.
    //Java return type, access bodyde yazan kısım vs hiç bakmaz, method signature'a bakar overloading'de.
    //ambiguous : belirsiz demek


}
