package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class P01 {
    public static void main(String[] args) {

        int toplam = toplamaYapar(5,9);
        System.out.println(toplam);

        carpımYapar(4,5,2);




    }


    protected static int toplamaYapar (int a, int b) {
        return a+b;
    }
    public static void carpımYapar (int c, int d, int e) {
        System.out.println(c*d-e);
    }







}
