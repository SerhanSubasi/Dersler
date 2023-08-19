package day03wrapperconcatenationoperators;

public class WrapperClass {

    public static void main(String[] args) {

        //Java, primitive data typelarına bazı faydalı methodlar ekleyerek yeni bir veri yapısı oluşturmuştur.
        //İşte bu yeni yapı, "Wrapper Class" olarak adlandırılır.

        //primitive     : char      - boolean - byte - short - int      - long - float - double
        //Wrapper Class : Character - Boolean - Byte - Short - Integer  - Long - Float - Double

        int n = 12;

        Integer m = 12;

        //primitive'i Wrapper Class'a çevirmeye "AutoBoxing" denir. int ==> Integer

        int num = 13;                   //Autoboxing
        Integer wrapperNum = num;

        //Wrapper Class'ı primitive'e çevirmeye "Unboxing" denir.   Byte ==> byte

        Byte k = 14;                    //Unboxing
        byte primitiveK = k;

    }
}
