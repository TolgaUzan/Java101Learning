package Bolum3_Donguler.__11ArmstrongBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
        Armstrong Sayı Nedir ?
        N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
        sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

        Örneğin 407 sayısını ele alalım.
        (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
        Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.


        Ödev :Bir sayının basamak sayılarının toplamını hesaplayan
        program yazınız.

        Örnek : 1643 = 1 + 6 + 4 + 3 = 14
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number;");
        int sayi=scanner.nextInt();
        int geciciSayi=sayi;
        int basamakSayisi=0;
        int toplam=0;
        int basamakDegeri=0;
        int basamakToplam=0;

        //basamak sayısı bul
        while(geciciSayi>0){
            geciciSayi/=10;
            basamakSayisi++;
        }

        geciciSayi=sayi;
        do{
            basamakDegeri= geciciSayi%10;
            basamakToplam+=basamakDegeri;
            int kuvvet=1;
            for(int i=1;i<=basamakSayisi;i++){
                kuvvet*=basamakDegeri;
            }
            toplam+=kuvvet;
            geciciSayi/=10;
        }while(geciciSayi>0);

        if(sayi==toplam){
            System.out.println("Bu sayı bir armstrong sayisidir.");
            System.out.println("Sayinın basamak toplamı : "+basamakToplam);
        }else{
            System.out.println("Bu sayı bir armstrong sayisi degildir..");
            System.out.println("Sayinın basamak toplamı : "+basamakToplam);
        }




    }
}
