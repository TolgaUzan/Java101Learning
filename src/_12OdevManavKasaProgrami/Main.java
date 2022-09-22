package _12OdevManavKasaProgrami;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin
        kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        --
        Örnek Çıktı
        Armut Kaç Kilo ? :0
        Elma Kaç Kilo ? :1
        Domates Kaç Kilo ? :1
        Muz Kaç Kilo ? :2
        Patlıcan Kaç Kilo ? :3
        Toplam Tutar : 21.68 TL
         */
        double a=2.14, e=3.67,d=1.11,m=0.95,p=5;

        System.out.println("Manava Hoşgeldiniz.");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ?");
        double aK=scanner.nextDouble();
        System.out.println("Elma Kaç Kilo ?");
        double eK=scanner.nextDouble();
        System.out.println("Domates Kaç Kilo ?");
        double dK=scanner.nextDouble();
        System.out.println("Muz Kaç Kilo ?");
        double mK=scanner.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ?");
        double pK=scanner.nextDouble();
        double total=(a*aK)+(e*eK)+(d*dK)+(m*mK)+(p*pK);
        if(total<0){
            System.out.println("Şu aralar sıkışığım :D");
        }
        else if(total%10<=1){
            System.out.println("Toplam Tutar :"+(total)+"\n"+(total-1)+" versen yeter abi");
        }
        else{
        System.out.println("Toplam Tutar :"+total+"\n Yine Bekleriz.");
        }
    }
}
