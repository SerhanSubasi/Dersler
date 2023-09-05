package day18oop;

public class StudentRunner {
    public static void main(String[] args) {

Student ali= new Student();

        System.out.println(ali.getStdID()); //ali.getStdID() ile görebildik getter yapınca generate ile.
        System.out.println(ali.getNotOrt());
        System.out.println(ali.isSuccesful());  //sadece görmek için kullanılır.

        System.out.println("--------------------------------------");
        ali.setStdID("VH12345678");         //set ettik değiştirdik adını.
        System.out.println(ali.getStdID());
        ali.setNotOrt(3.13);
        System.out.println(ali.getNotOrt());    //set ettik 3.13 oldu artık.
        ali.setSuccesful(true);
        System.out.println(ali.isSuccesful());  //set ettik ve true oldu artık.

    }
}
