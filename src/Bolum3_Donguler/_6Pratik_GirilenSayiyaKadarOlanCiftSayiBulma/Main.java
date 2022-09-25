package Bolum3_Donguler._6Pratik_GirilenSayiyaKadarOlanCiftSayiBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift
        olan sayıları bulan programı yazıyoruz.

        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan
        programı yazınız.
         */

        //Sorunun cevabı
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayi girin:");
        int sayi=scanner.nextInt();
        int toplam=0;
        int sayac=0;
        for(int i=1;i<=sayi;i++){
            if(i%3==0 || i%4==0){
                toplam+=i;
                sayac++;
            }
        }
        System.out.println(toplam/sayac);


        // Çift sayıları while ve for ile yazdırma
        /*
        int i=1;
        while(i<=sayi){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }*/

        /*
        for(int i=1;i<=sayi;i++){

            if(i%2==0){
                System.out.println(i);
            }

        }*/


    }
}
