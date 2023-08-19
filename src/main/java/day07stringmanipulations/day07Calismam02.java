package day07stringmanipulations;

public class day07Calismam02 {
    public static void main(String[] args) {

        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
//           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        String tvPrice = tv.replace("$" , "");
        String laptopPrice = laptop.replace("$","");

        Double totalPrice = Double.valueOf(tvPrice) + Double.valueOf(laptopPrice);
        System.out.println("totalPrice = " + totalPrice); //1332.98


        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "   ali cAN   " ==> AC

        String name = "   ali cAN   ";
        char char1 = name.trim().toUpperCase().charAt(0);
        char char2 = name.trim().toUpperCase().split(" ") [1] .charAt(0);
        System.out.print(char1);
        System.out.print(char2);
        System.out.println();

//Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
//karakterleri dynamic olarak aliniz
//abc@gmail.com ===> gmail

    String mail = "abc@gmail.com";
    int startingIndex = mail.indexOf("@") +1;
    int endingIndex = mail.indexOf(".");
    String companyName = mail.substring(startingIndex, endingIndex);
        System.out.println(companyName);



    }
}
