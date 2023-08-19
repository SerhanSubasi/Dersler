package day07stringmanipulations;

import java.util.Scanner;

public class day07Calismam01 {
    public static void main(String[] args) {

        /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun
         */



        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen password giriniz");
        String psw = input.nextLine();

        boolean characterControl = psw.length()>7;       //En az 8 character olsun
        System.out.println("characterControl = " + characterControl);

        boolean spaceControl = !psw.contains(" ");
        System.out.println("spaceControl = " + spaceControl);      //Space characteri password'de olmasin

        boolean upperCaseControl = psw.replaceAll("[^!A-Z]" , "").length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl);

        boolean lowerCaseControl = psw.replaceAll("[^a-z]" , "").length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        boolean degitControl = psw.replaceAll("[^0-9]" , "").length()>0;
        System.out.println("degitControl = " + degitControl);

        boolean isValid = characterControl && spaceControl && upperCaseControl && lowerCaseControl && degitControl;

if (isValid) {
    System.out.println("Password geçerli");
} else {
    System.out.println("Password geçersizdir");
}




    }
}
