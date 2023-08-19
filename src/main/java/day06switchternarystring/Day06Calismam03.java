package day06switchternarystring;

public class Day06Calismam03 {
    public static void main(String[] args) {


String s = "Learn Java earn 4400$ money";
int charLenght = s.length();
        System.out.println(charLenght);

char firstChar = s.charAt(0);
        System.out.println(firstChar);
char lastChar = s.charAt(s.length()-1);
        System.out.println(lastChar);
String firstFour = s.substring(0,4);
        System.out.println(firstFour);
String middleFour = s.substring(5,7);
        System.out.println(middleFour);
String lastAll = s.substring(8);
        System.out.println(lastAll);
boolean isIt = s.contains("easy");
        System.out.println(isIt);
boolean isIt2 = s.startsWith("Java");
        System.out.println(isIt2);
boolean isIt3 = s.endsWith("easy");
        System.out.println(isIt3);
String change = s.replace("money" , "dollars");
        System.out.println(change);
String change2 = s.replace("e" , "");
        System.out.println(change2);
String change3 = s.replaceAll("[0-9]","*");
        System.out.println(change3);



    }
}
