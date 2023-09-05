package day14constructorsdatetime;

public class Car {
    /*
    Constructor nedir?
    Classtan object oluşturmamızı sağlayan code blocklarıdır.
    Class oluşturduğumuzda java bize otomatik olarak bir contructor verir.
    Ama bu constructor gözle görüşmez, gözle görülmeyen otomatik olarak java tarafından verilen bu constructorlara
    biz "default" constructor diyoruz.
    default constructor ==> Car () {}

    siz kendi constructorınızı oluşturduğunuz zaman Java default constructorı siler.
    Az önce honda olanlar gitti sildi java onu kıskanç çünkü,

Constructor nasıl oluşturulur?
Acces Modifier + Class ismi + () + {}

Bunu sağ tık generate ile hızlıca da oluşturabiliriz.

İnterwiev sorusu: Method ile contructor arasındaki fark nedir?
1) Methodlarda Return Type olur, Constructorlarda olmaz.
2) Methodlar yaptıkları işe göre isimlendirilirler, Constructorlar ise her zaman Class ismiyle isimlendirilirler.
3) Methodlar bir aksiyon yapmak için oluşturulur, Constructorlar ise object oluşturmak içindir.
4) Method isimleri küçük harfle başlar, Constructor isimleri ise Class ismi ile aynı olunca büyük harfla başlar.

Parametreli Constructorlar oluşturarak aynı classtan farklı özelliklere sahip objectler oluşturabiliriz.


     */


    //Variablelar oluşturalım
    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;


    public Car(String make, String model, int year, boolean hybrid) {   //Özelliklerini değiştirmek için yapıyoruz.
        this.make = make;   //değiştiridimiz yeni özelliklerle bağdaştırıyoruz şimdi constructor'ı.
        this.model= model;
        this.year = year;
        this.hybrid = hybrid;       //Şimd istersen bmw oluştur istersen tofaş oluştur kafana göre.
    }

    public Car(){   //Bu esnek bir kalıp değil Honda üretir hep.

    }

    public Car(String make, String model){
this.make = make;       // yalnızca marka ve modelli olan
this.model = model;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    //Methodlar oluşturalım
    public void hareket() {
        System.out.println("Honda hızlı hareket eder");
    }

    public void dur() {
        System.out.println("Honda güvenli bir şekilde durur");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
//Yazabilmek için alt ins ve toString diyeceğiz.


}
