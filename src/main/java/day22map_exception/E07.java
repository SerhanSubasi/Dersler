package day22map_exception;

public class E07 {
    public static void main(String[] args) {

        // Java'ya hata vermesini öğretiyoruz

      printAge(63);
      printAge(-5);

    }

    public static void printAge (int age) {
        if (age<0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            System.out.println(age);
        }


    }
}
