package day15Stringbuilderaccessmodifier;

public class StudentRunner {    //Classlar protected veya private olamazlar.
    public static void main(String[] args) {

Student ali = new Student();
        System.out.println(ali.stdName);
        System.out.println(ali.stdAddress);
        System.out.println(ali.stdMail);

    }
}
