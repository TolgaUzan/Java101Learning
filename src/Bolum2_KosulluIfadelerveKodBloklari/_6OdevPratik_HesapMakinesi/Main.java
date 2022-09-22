package Bolum2_KosulluIfadelerveKodBloklari._6OdevPratik_HesapMakinesi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ödev
        Basit hesap makinesini switch-case kullanarak yapınız.
        Toplama Çıkarma Çarpma Bölme

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesap Makinesi");


        while (true) {
            try {
                System.out.println("Yapmak istediğiniz işlemi seçin" +
                        "(+), (-), (*), (/) 'e " +
                        "\nÇıkış için (q)basiniz.");
                String islem = scanner.nextLine();
                if (islem.equals("q")) {
                    System.out.println("Çıkış yapıldı..");
                    break;
                } else if(islem.equals("+") || islem.equals("-") || islem.equals("*") || islem.equals("/")){

                    System.out.println("Birinci sayiyi giriniz");
                    int sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayiyi giriniz");
                    int sayi2 = scanner.nextInt();
                    scanner.nextLine();


                    switch (islem) {
                        case "+":
                            System.out.println("Toplama sonucu:" + (sayi1 + sayi2));
                            break;
                        case "-":
                            System.out.println("Çıkarma sonucu:" + (sayi1 - sayi2));
                            break;
                        case "*":
                            System.out.println("Çarpma sonucu:" + (sayi1 * sayi2));
                            break;
                        case "/":
                            if (sayi2 != 0) {
                                System.out.println("Bölme sonucu:" + ((double) sayi1 / sayi2));
                                break;
                            }
                            System.out.println("Bir sayı sıfıra bölünemez.");
                            break;
                        default:
                            break;
                    }
                }else{
                    System.out.println("Lütfen işlemi düzgün girin");
                }

            } catch (InputMismatchException e) {
                System.out.println("Lütfen sayı giriniz.");
            }

        }


    }
}

