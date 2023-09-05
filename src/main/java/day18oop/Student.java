package day18oop;

public class Student {
    //Encapsulation - kapsülleme
/*
Encapsulation nedir? Data hiding (Veriyi saklamaktır)
Data nasıl saklanır?
Access modifierlarını private yaparak datayı diğer classlardan görünmez hale getiririm. Böylece datayı saklarım.

//Encapsulation yaptığımız datayı istersen diğer classlardan okuyabiliriz.
Nasıl okuruz?
get method oluşturarak Encapsulate edilmiş datanın değerini okuyabiliriz.

1) get mothodlar public olur.
2) get methodun return type'ı okuduğu variable ile aynı olur.
3) get method bir boolean variable için oluşturulduysa, ismi is ile başlar.

// Encapsulation yaptığımız datayı istersek diğer classlardan nasıl değiştirebiliriz? -İnterview
set mothod oluşturarak Encapsulate edilmiş datanın

1) set methodlar hep public olur.
2) set methodun return type'ı hep void olur. Çünkü sadece set edecez biz verecek değeri.
3) set method parametre kullanır, parametrenin data type'ı set edilmek istenen variable ile aynı olur.

Not: Encapsulation ile 1 obje oluşturup onu set ederek tekrar tekrar başka halde kullanabiliriz. Memory friendly.
 Not: Get == getter set == setter  getter & setter == Java beans
 */



public String stdName = "Ali Can";
public int age = 17;

private String stdID = "AC1234567";     //kapsülledik gibi şu an private yaparak.
private double notOrt = 3.87;
private boolean succesful = false;

    public String getStdID() {      //Generate ==> getter ile yaptık
        return stdID;
    }

    public double getNotOrt() {     //Generate ==> getter ile yaptık
        return notOrt;
    }

    public boolean isSuccesful() {      //Generate ==> getter ile yaptık
        return succesful;               // boolean ise is ile başlar.
    }


    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }

}
