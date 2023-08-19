package day03wrapperconcatenationoperators;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1. adım: Scanner class'tan object oluştur.

        Scanner input = new Scanner(System.in);

        //2. adım: Kullanıcıya ne istediğinize dair bilgi veriniz.

        System.out.println ("Lutfen yasinizi giriniz");

        //3. adım: Uygun Method'u kullanarak kullanıcının verdiği datayı Memory'e yerleştiriniz.

        byte age = input.nextByte();

        System.out.println(age);

    }
}
