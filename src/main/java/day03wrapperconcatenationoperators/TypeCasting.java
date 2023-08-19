package day03wrapperconcatenationoperators;

public class TypeCasting {

    public static void main(String[] args) {

        /*

        Numeric primitive data typelarının birbirine dönüştürülmesine "Type Casting" denir.
        Numeric Data Type ==> byte - short - int - long -float - double

        Note1: Küçük Type'ın büyük Data Type'a otomatik genişlemesine "AutoWidening" denir. (Otomatik Genişletme)

        Note2: Büyük Type'ları küçük Typelara daraltmaya ExplicitNarrowing denir, (Açıktan Daraltma)
        bunu sadece kod yazan yapar çünkü bu riskli bir iştir ve JAVA risk almaz.
         */

        // Örnek:  byte data type'ını int data type'ına çeviriniz.

        byte age = 13;
        int ageInt = age;   //AutoWidening denir.

        //Örnek: int data type'ını short data type'ına çeviriniz.

        int weight = 313;
        short weightShort =(short) weight;  //ExplicitNarrowing




    }
}
