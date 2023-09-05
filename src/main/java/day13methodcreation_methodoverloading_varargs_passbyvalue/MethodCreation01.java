package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodCreation01 {

    //Main Method entry point olarak geçer. Önce ondan başlar daha sonra aşağıya iner.
    //Aşağıdaki ismi verilen oluşturduğumuz methoda iner oradak işlemi yapar ve return ile yukarı geri çıkartır.

    public static void main(String[] args) {
         int carpmaSonucu = multiply(3,5);   //Arguman
        System.out.println("carpmaSonucu = " + carpmaSonucu);

          int toplam = soru(2, 4, 5);     //Arguman
        System.out.println("toplam = " + toplam);

          print("Serhan Subaşı");   //Arguman

    }   //Main method kapanış parantezi



//ornek 1 : 2 sayiyi carpma islemi yapan bir method olusturunuz
protected static int multiply(int a, int b) {   //Parametre

        return a * b;
}
//Methodun kullanacağı variable yerine "Parametreler" denir.
// Main method içinde girilen değer kısmına ise "Argumanlar" denir.

//Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.

public static int soru (int c, int d, int e) {      //Parametre

        return c*d+e;
}

//Ornek 3: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.

public static void print(String str){      //Parametre

        System.out.println(str);
}

// yeni bir data üretmeyen methodların return type'ı void olur.
// void kullanılıyorsa (yeni bir data üretilmiyorsa) return yazmaya gerek yok.






}// class kapanış parantezi
