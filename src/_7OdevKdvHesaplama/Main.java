package _7OdevKdvHesaplama;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        KDV Tutarı Hesaplayan Program
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
        KDV tutarını hesaplayıp ekrana bastıran programı yazın.

        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;

        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı
        hesaplayan programı yazınız.
         */

        double kdv1=0.08;
        double kdv2=0.18;
        Scanner scanner= new Scanner(System.in);

        System.out.print("\t\tKdv Hesaplama: \nLütfen Tutar Giriniz :");
        double tutar= scanner.nextDouble();
        //0dan büyük ve 1000 den küçükse   /    true; *kdv1 - false *kdv2
        double kdv= (tutar>0 && tutar<1000) ? tutar*kdv1 : tutar*kdv2;
        double toplam=kdv+tutar;
        System.out.println("Girilen Tutar: "+tutar
                        +"\nKdv Tutarı: "+ kdv
                        +"\nToplam Tutar : "+toplam);

    }
}
