package day04scannerincrementdecrementifstatements;

public class ıfStatements01 {
    public static void main(String[] args) {

// if Statements bazı kodların bazı şartlara göre aktive olması için if statements kullanılır.

 //statements ifade demek. hüküm bildiren cümle demek.

 // if you study hard, you will learn java. ==>

 // eğer ilk kısım doğruysa son da doğru ( çalışırsa öğrenir) yanlışsa yanlış (çalışmazsa öğrenemez)

 /*
     if (you study hard) {
     you will learn java    ==> javacası

     }
  */

        //Ornek 1:  Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin

        int number = 13;

        if (number > -1 && number < 10) {
            System.out.println("Rakam");

        }



//Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir!" yazdirin.

        int n = 123;

        if (n>99 && n<1000) {

            System.out.println("Sayi üç basamaklidir!");
        }

// && çift and olduğu için baştaki şart false ise java gerisini okumaz. ama tek olsaydı okur ve toplamını alırdı.





    }
}
