package Bolum1_TemelKavramlarveDegiskenler._3StringVeriTipi;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //String Sınıfı Veri tipi

        /*
        String sınıfından üretilir.
        String primitive bir tip değildir.
        String sınıfları temel olarak bir dizi metin,
        karakterini depolamaya yarayan nesnelerdir.
        içerisinde birçok metodu bulundurur.
        Ve nesne türetilemez.içindeki metodlar "immutable" .

        Tanımlama  ;
        String words = " Kelime ";
         */

        String name= "Tolga";
        String surname= "Uzan";
        System.out.println(name+" "+surname);



        //Formatlı yazı tipleri

        //Formatlı yazım şekillleri.
        /*
        %c karakter
        %d decimal integer tam sayılar
        %f float ondalıklı sayı için
        %x hexadecimal integer
        %s string için
        %b boolean için
        %h hachcode olarak
        %n yeni satır
         */

        boolean b= true;
        char c ='c';
        int i  = 100 ;
        double d= 0.1539;
        String s = "Tolga";

        System.out.println("Boolean: "+ b + "Char: "+c+"Int :"+ i + "double: "+d+ "String: "+ s);

        System.out.printf("Boolean : %b Char: %c Int: %d Double %.1f String %s",b,c,i,d,s);

        //String .format()metodu ile örneğin double bir değerin çıktısını yuvarlayabilirim .
        String str = String.format("Double değeri yuvarlandıktan sonra : %.2f",d);
        System.out.println();
        System.out.println(str);

        //Double sayıları formatlamak için DecimalFormat sınıfından obje üretip .format
        //metoduylakullanabilirim .
        DecimalFormat ftm= new DecimalFormat(".###");//.### - .000da olur 3 basamak göster dedim
        System.out.println(22.0/7);
        System.out.println(ftm.format(22.0/7));

        //NumberFormat sınıfı
        NumberFormat fmt= NumberFormat.getCurrencyInstance();
        double pantolon = 59.99;
        fmt= NumberFormat.getCurrencyInstance(Locale.CANADA);//CanadaDoları gibi
        System.out.println(ftm.format(pantolon));
        fmt= NumberFormat.getCurrencyInstance(Locale.US);//Dolar olarak yazdıracaktır .
        System.out.println(ftm.format(pantolon));
        System.out.println(ftm.format(pantolon));//TL olarak yazdıracaktır .
        NumberFormat ftm1 = NumberFormat.getPercentInstance();  //herhangibirdouble yüzde olarak gösterebilirim.
        ftm1 = NumberFormat.getPercentInstance(Locale.CANADA);//20% olarak veriyor
        System.out.println(ftm1.format( 1.0/5  ));



        //Geçen süreyi daha spesifik kaliteli formatta gösrebiliriz.
        Scanner scanner= new Scanner(System.in);
        long baslangic = System.currentTimeMillis();
        System.out.println("Devam etmek için enter basın ");
        scanner.next();
        long bitis = System.currentTimeMillis();
        System.out.println(bitis);
        System.out.printf("Geçen süre : %.3f saniye",(double)(bitis-baslangic)/1000);



    }
}
