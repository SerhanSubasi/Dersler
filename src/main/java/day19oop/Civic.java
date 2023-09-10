package day19oop;

public class Civic implements Ac, Engine, Security {
    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("AC runs super");
    }


    //interface
        /*
      class yerine interface tercih edilince, multi parent olabiliyor.
        interface'ler teyze gibidir, birden fazla olabilir.
class oluştururken class yerine Interface seçeriz.

implements kullanarak child ilişkisi kuraroz Interface'de. Extends yerine.
        */







}
