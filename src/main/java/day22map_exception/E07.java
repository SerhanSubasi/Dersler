package day22map_exception;

public class E07 {
    public static void main(String[] args) {

        /*
         1) throm keywordü bir methodun bodysi içinde istedğimiz yerde istediğimz koşullar için isteidğimiz kadar Exception atmamızı sağlar
         2) throw keywordu yazıldıktan sonra bir exceğtin class objecti oluşturulur.
         3) Exception class constructor'ının parantezi içinde istediğiniz Exception türünü girebiliriz.



         */



        // Java'ya hata vermesini öğretiyoruz

      printAge(63);

        try {
            printAge(-5);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("main method try sonrası çalışmaya devam etti");

    }

    public static void printAge (int age) {
        if (age<0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            System.out.println(age);
        }


    }
}
