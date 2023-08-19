package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Day04Calismam {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Adınızı ve Soyadınızı giriniz");
        String fullName = input.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        byte age = input.nextByte();
        System.out.println("Lütfen boyunuzu giriniz");
        float height = input.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz");
        short weight = input.nextShort();
        System.out.println("Lütfen medeni durumunuzu giriniz");
        String maritalStatus = input.next();
        System.out.println("Lütfen en sevdiğiniz Formula 1 takımını giriniz");
        String f1TeamAndPilot = input.next();



        System.out.println("name = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);
        System.out.println("f1TeamAndPilot = " + f1TeamAndPilot);

















    }
}
