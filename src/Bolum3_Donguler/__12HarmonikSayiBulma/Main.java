package Bolum3_Donguler.__12HarmonikSayiBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java ile girilen sayının harmonik serisini bulan program
         yazacağız.

        Harmonik Seri Formülü :
        1+(1/2)+(1/3)+(1/3)+(1/4)+..(1/n)
         */

        Scanner scanner= new Scanner(System.in);

        System.out.println("Harmonik Hesap\nSayi girin");
        int sayi=scanner.nextInt();
        double sonuc=0;
        for(double i=1;i<=sayi;i++){
            sonuc+=(1/i);
        }
        System.out.println(sonuc);
    }
}
