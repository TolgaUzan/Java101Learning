package Bolum3_Donguler.__16SayininMinMaxBul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
        Java ile klavyeden girilen N tane sayma sayısından en büyük
        ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22

         */

        Scanner scanner= new Scanner(System.in);
        int sayi,n,enBuyuk=0,enKucuk=0;

        System.out.print("Kaç adet sayı gireceksiniz :");
        n=scanner.nextInt();


        for(int i=1; i<=n;i++){
            System.out.print("Sayi girin enter basın:");
            sayi=scanner.nextInt();
            if (i==1){
                enBuyuk=sayi;
                enKucuk=sayi;
            }else{
                if(sayi>enBuyuk) enBuyuk=sayi;
                else if (sayi<enKucuk) enKucuk=sayi;
            }
        }
        System.out.println("En büyük :"+enBuyuk);
        System.out.println("En küçük :"+enKucuk);

    }
}
