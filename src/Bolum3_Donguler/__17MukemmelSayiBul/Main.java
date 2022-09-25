package Bolum3_Donguler.__17MukemmelSayiBul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını
        bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
        değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan
        programı Java dilinde yazınız.

        Mükemmel Sayı Nedir ?
        Bir sayının kendisi hariç pozitif tam sayı çarpanları
        (kalansız bölen sayıların) toplamı kendisine eşit olan
        sayıya mükemmel sayı denir.

            Senaryolar
        Bir sayı giriniz: 28
        28 Mükemmel sayıdır
        Bir sayı giriniz: 1
        1 Mükemmel sayı değildir.
        Bir sayı giriniz: 496
        496 Mükemmel sayıdır
         */

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter number ; ");
        int number= scanner.nextInt();
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println(number+" is a perfect number.");
        }else {
            System.out.println(number + " is not a perfect number");
        }



    }
}
