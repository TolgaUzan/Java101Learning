package Bolum4_Methodlar._8Pratik_GelismisCalculator;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.floor;

public class Main {


    public static int a() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number:");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter Number:");
            scanner.nextLine();
        }
        int a = scanner.nextInt();
        return a;
    }

    public static int b() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number:");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter Number:");
            scanner.nextLine();
        }
        int b = scanner.nextInt();
        return b;
    }

    public static void topla(int a, int b) {
        System.out.println("Toplam :" + (a + b));
    }

    public static void cikar(int a, int b) {
        System.out.println("Kalan :" + (a - b));
    }

    public static void carp(int a, int b) {

        System.out.println("Carpım :" + (a * b));
    }

    public static void bol(int a, int b) {
        System.out.println("Bolum :" + (a / (double) b));
    }

    public static void ustAlma(int a, int b) {
        int sonuc = 1;
        for (int i = 1; i < b; i++) {
            sonuc *= a;
        }
        System.out.println("Sonuc: " + sonuc);
    }

    public static void modAl(int a, int b) {
        System.out.println("Sonuc: " + a % b);
    }

    public static void dikdortgenCevre(int a, int b) {
        System.out.println("Dikdörtgen Çevre: " + (2 * (a + b)));
        System.out.println("Dikdörtgen Alanı: " + (a * b));
    }

    public static void faktoriyel(int a) {
        int faktoriyel = 1;
        for (int i = 1; i <= a; i++) {
            faktoriyel *= i;
        }
        System.out.println(a + "!= " + faktoriyel);
    }

    public static void main(String[] args) throws InterruptedException {
        /*Gelişmiş Hesap Makinesi
         */
        Scanner scanner = new Scanner(System.in);
        String islemler = "***** Basit Hesap Makinesi *****\n        0- Çıkış Yap\n" +
                "        1- Toplama İşlemi\n" +
                "        2- Çıkarma İşlemi\n" +
                "        3- Çarpma İşlemi\n" +
                "        4- Bölme işlemi\n" +
                "        5- Üslü Sayı Hesaplama\n" +
                "        6- Faktoriyel Hesaplama\n" +
                "        7- Mod Alma\n" +
                "        8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "Bir işlem seçin : ";

        int islem;
        while (true) {
            System.out.print(islemler);
            while (!scanner.hasNextInt()) {
                System.out.print("Bir işlem seçin : ");
                scanner.nextLine();
            }
            islem = scanner.nextInt();
            switch (islem) {
                case 0: System.out.println("Çıkış Yapılıyor .. ");

                    Thread.sleep(1000);
                    System.out.println("İyi günler ! ");
                    System.exit(0);
                    break;
                case 1:
                    topla(a(), b());
                    break;
                case 2:
                    cikar(a(), b());
                    break;
                case 3:
                    carp(a(), b());
                    break;
                case 4:
                    bol(a(), b());
                    break;
                case 5:
                    ustAlma(a(), b());
                    break;
                case 6:
                    faktoriyel(a());
                    break;
                case 7:
                    modAl(a(), b());
                    break;

                case 8:
                    dikdortgenCevre(a(), b());
                    break;
                default:
                    System.out.println("Geçersiz işlem.");
                    break;
            }
            Thread.sleep(2500);

        }

/*
        Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.
                Hesap makinesinin fonksiyonları :
        0- Çıkış Yap
        1- Toplama İşlemi
        2- Çıkarma İşlemi
        3- Çarpma İşlemi
        4- Bölme işlemi
        5- Üslü Sayı Hesaplama
        6- Faktoriyel Hesaplama
        7- Mod Alma
        8- Dikdörtgen Alan ve Çevre Hesabı
         */
    }
}
