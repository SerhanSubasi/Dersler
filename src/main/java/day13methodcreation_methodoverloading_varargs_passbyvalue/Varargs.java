package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class Varargs {
    public static void main(String[] args) {

int sum = toplamaYap(5,6,7);
        System.out.println("sum = " + sum);

int sonucum = cıkarmaYapar(5,6,7,8,2,3,1);
        System.out.println("sonucum = " + sonucum);

    }

    //Java farklı sayıdaki parametrelerin hepsini kabul eden bir yapı oluşturdu.
    // Bu yapıya Varargs diyoruz. Variable argumants gibi açılımı çoklu değişken datalar.
    // Varargs arka planda Array yapısını kullanır.
   //Kullanılamayan kod hata verir, buna "unused code" denir.


  public static int toplamaYap (int... a){      //... koyarak devam ediyor diyoruz varargs oldu o.
    int sum = 0;
      for (  int  w :  a ) {
          sum = sum+w;
      }
    return sum;

  }

  public static int cıkarmaYapar (int... c){
        int sum = 0;
      for (  int  w : c   ) {
          sum = sum-w;
      }
      return sum;
  }

    //1) Bir method parantezinde birden fazla varargs kullanilmaz
    //2) Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir

/*
   public static int add (int a, int b) {
        return a+b;
    }

    public static int add (int a, int b , int c) {
        return a+b+c;
    }

    public static int add (int a, int b,int c,int d){
        return a+b+c+d;
    }
*/



}
