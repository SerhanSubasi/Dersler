package day16staticoop;

public class stdRunner {
    public static void main(String[] args) {

        //Student name static olduğu için ona ulaşmak için object oluşturmadık.
        //static class memberlara ulaşmak için sadece class ismi yeterlidir.
        System.out.println(Student.studentName);



        // age non-static olduğundan dolayı ona ulaşmak için object oluşturmak zorundayız.
        Student ali = new Student();    //object
        System.out.println(ali.age);


        Student.staticMethod(); //method
        ali.nonStaticMethod();  //method

        String s ="a";
        s.toUpperCase();         //non-static çünkü yukarıda object oluşturduk "s"


        System.out.println(Student.Sayı);   //Student. dediğimiz an sayı geldi, çünkü static.


Student objeOlusturmaliyiz = new Student(); //Student. dediğimizde gelmedi bu yüzden Obje oluşturduk.
objeOlusturmaliyiz.nonStaticSayı(); //Oluşturduğumuz objeye. dediğimizde şimdi geldi.

    }


}
