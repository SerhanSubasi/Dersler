package day02variables;

public class Variables02 {

    public static void main(String[] args) {

        //Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.

        String ogrenciAdi = "Ali Can";
        System.out.println(ogrenciAdi);

        //null 0 demek degildir. 0 da codingte bir degerdir
        //null hiclik demektir.
        //null ici bos obje demektir aynı zamanda.

/*
primitive ve non-primitive data type arasindaki farklar nelerdir?
1) primitive'ler sadece bizim atadigimiz degeri icerir.
    non-primitiveler bizim atadigimiz deger ve fazladan method'lar icerir.

2) primitivler kücük harfle baslar
    non-primitive'ler buyuk harfle baslar

3) primitive'leri JAVA uretmistir ve 8 tanedir,
    non-primitive'leri JAVA ve programcilar uretebilir ve sinirsiz sayidadir.

4) primitive'ler memory'de data typelarina göre sabit boyutta bellek kullanirlar,
    non-primitiveler memory'de buyuklugune gore degisen boyutlarda bellek kullanabilirler.
 */


        //Ogrenci notlari icin iki adet variable olusturun ve toplamlarini ekrana yazdirin
        //1. yol
        byte note1 = 50;
        byte note2 = 70;
        System.out.println(note1+note2);






















    }
}
