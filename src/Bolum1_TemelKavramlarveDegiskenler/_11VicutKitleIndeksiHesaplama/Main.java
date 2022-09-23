package Bolum1_TemelKavramlarveDegiskenler._11VicutKitleIndeksiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir
        değişkene atayın. Aşağıdaki formüle göre kullanıcının
        "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        Formül
        Kilo (kg) / Boy(m) * Boy(m)

        Çıktısı
        Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        Lütfen kilonuzu giriniz : 105
        Vücut Kitle İndeksiniz : 35.49215792320173
         */

        double kilo,boy;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Vicut Kitle İndeksi\nLütfen Kilonuzu Giriniz :");
        kilo=scanner.nextDouble();
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz Örn(1,70):");
        boy=scanner.nextDouble();
        double indeks=kilo/(boy*boy);
        System.out.println("\tVücut Kitle İndeksiniz :"+indeks);
    }
}
