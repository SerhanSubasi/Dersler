package day05ifelseswitchternary;

import java.util.Scanner;

public class day05Calismam06 {
    public static void main(String[] args) {

     //Example  Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı sırada olduğunu öğrenmek istediğiniz gün ismini giriniz");
        String dayName = input.next();


switch (dayName.toLowerCase()) {
    case "sunday" :
        System.out.println("1");
        break;
    case "monday" :
        System.out.println("2");
        break;
    case "thuesday" :
        System.out.println("3");
        break;
    case "wednesday" :
        System.out.println("4");
        break;
    case "thursday" :
        System.out.println("5");
        break;
    case "friday" :
        System.out.println("6");
        break;
    case "saturday" :
        System.out.println("7");
        break;
    default:
        System.out.println("Lütfen geçerli bir gün ismi giriniz");
}












    }
}
