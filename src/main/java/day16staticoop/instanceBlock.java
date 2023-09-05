package day16staticoop;

public class instanceBlock {
    //Eğer tüm constructorların içinde çalışması gereken kodlar var ise tekrardan kurtulmak için bu kodları
    //instance block içine yazarız.

    public int year;

    public instanceBlock() {        //default oluşturduk generate ile
    }

    public instanceBlock(int year) {        //parametleri oluşturduk genarete ile

        this.year = year;
    }

    {
        System.out.println("Hi");                 //instanceBlock sadece süslü parantez açarak oluşturulabilir.
    }                                       // Hi kodunu üstteki hepsine yazmak yerine blocka yazdık.





}
