package day05ifelseswitchternary;

import java.util.Scanner;

public class day05Calismam04 {
    public static void main(String[] args) {

        /*
        Kullanicinin vermis oldugu gün isimlerine bakarak HaftaSonu veya Hafta ici olduguna karar veren kodu yaziniz
                   Monday ==> Week Day       Saturday ==> Weekend Day


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day name");
        String dayName = input.next();

        if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Thuesday") || dayName.equalsIgnoreCase("Wednesday")
    || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Week Day");
        } else if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend Day");
        } else  {
            System.out.println("Please enter invalid day");
        }
 */

//2. Yol

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day name");
        String dayName = input.next();


        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Thuesday") || dayName.equalsIgnoreCase("Wednesday")
                || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday");

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Monday");

        if (isWeekDay) {
            System.out.println("Weekday");
        } else if (isWeekendDay) {
            System.out.println("Weekend Day");
        } else {
            System.out.println("Please enter invalid day name");
        }




    }
}
