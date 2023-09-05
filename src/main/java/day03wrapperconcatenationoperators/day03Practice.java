package day03wrapperconcatenationoperators;

import java.util.Scanner;

public class day03Practice {
    public static void main(String[] args) {

        //Wrapper Class: Character, Boolean, Byte, Short, Integer, Long, Float, Double

int sayi = 21;
Integer wrapperSayi = sayi;
    System.out.println(wrapperSayi);

Short rakam = 120;
short shortRakam = rakam;
        System.out.println(shortRakam);

 String s = "karpuz";
 int d = 10;
 int m = 15;

        System.out.println(s+d+m);      //karpuz1015
        System.out.println(s+d*m);      //karpuz150
        System.out.println(s+(d+m));    //karpuz25
        System.out.println(d+s+m);      //10karpuz15
        System.out.println(d+m+s);      //25karpuz
        System.out.println(d*m+s);      //150karpuz

short kisi = 10;
short ucret = 15;
        System.out.println(ucret/kisi);     // 1

int kisiler = 20;
float ucretler = 50F;
        System.out.println(ucretler/kisiler); // 2.5

    /*
        Cay     &&      Kahve       Sonuc
        yep     &&      yep         true
        nope    &&      nope        false
        yep     &&      nope        false
        nope    &&      yep         false

        Cay     ||      Kahve       Sonuc
        yep     ||      yep         true
        nope    ||      nope        false
        yep     ||      nope        true
        nope    ||      yep         true

    !true ==> false
    !!false ==> false
    !false ==> true
     */

  boolean first = 2 > 6; //false
  boolean second = 4< 6; //true
  boolean third = 2+6> 3*4; //false
  boolean fourth = 4+4 !=7; //true
  boolean fifth = 3+4*2 < 12; //true

        System.out.println(first && second); //false
        System.out.println(first || second); //true
        System.out.println(second && fourth && fifth); //true
        System.out.println(first || third); //false


int age = 66;
long yas = age;

        System.out.println(yas);

long longYas = 47;
int intAge = (int) longYas;
        System.out.println(intAge);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your level");
        byte level = input.nextByte();

        System.out.println(level);


    }
}
