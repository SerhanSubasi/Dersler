package day23exceptions;

public class InvalidStudentGradeException extends Exception{
/*
1) Compile Time Exception için extends sonrası Exception yazarız.
 */

    public InvalidStudentGradeException(String message) {
            super(message);     // git parenttan al gel der super
    }

    /*

    1) Custom Exception class oluşturmak için Exception class'a extends etmeliyiz.
    Exception class'a extend ederek oluşturduğumuz Custom Exception
    Eğer Runtime Custom Exception oluşturmak istersek RuntimeException Class'a extend yapmalıyız.


2) Custom Exception Class oluştururken eğer mesaj verebilen obje üretmek isterseniz constructoru buna göre seçebilirsiniz.
ve bu constructor parenttaki  constructorı çağırmalıdır, Bu constructor mesaj verecek veya vermeyecek şekilde oluşturulabilir.

3) Custom Exception Class oluştururken ismin sonunda Exception kelimesini kullanmalıyız, InvalidStudentGradeException örneğindeki gibi.


*/


}
