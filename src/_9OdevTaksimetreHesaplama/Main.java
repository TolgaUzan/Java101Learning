package _9OdevTaksimetreHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana
        yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine
        20 TL alınacaktır.Taksimetre açılış ücreti 10 TL'dir.
         */
        int minimum=20;
        int acilis=10;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Takside Kaç Km Yol Gittiniz.");
        int km=scanner.nextInt();
        double tutar= km*2.20;
        double sonuc =(tutar>=20) ? acilis+tutar : minimum;
        System.out.println("Taksimetre : "+sonuc);


    }
}
