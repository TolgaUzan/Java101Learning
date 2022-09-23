package Bolum1_TemelKavramlarveDegiskenler._6OrnekNotOrtalama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih,
         Müzik derslerinin sınav puanlarını kullanıcıdan
         alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak,
        eğer kullanıcının ortalaması 60'dan büyük ise ekrana
        "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        Not : If ve Else kullanılmayacak...
         */

        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Matematik Notu Giriniz:");
        matematik=scanner.nextInt();

        System.out.println("Fizik Notu Giriniz:");
        fizik=scanner.nextInt();

        System.out.println("Kimya Notu Giriniz:");
        kimya=scanner.nextInt();

        System.out.println("Türkçe Notu Giriniz:");
        turkce=scanner.nextInt();

        System.out.println("Tarih Notu Giriniz:");
        tarih=scanner.nextInt();

        System.out.println("Muzik Notu Giriniz:");
        muzik=scanner.nextInt();
        double ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6;

        boolean gectiMi=(ortalama>60);
        String sonuc= gectiMi ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız.";


        System.out.println("Ortalamanız :"+ortalama);
        System.out.println(sonuc);





    }
}
