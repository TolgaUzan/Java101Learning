package Bolum3_Donguler._8GirilenSayidanKucuk2ninKuvvetiBul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java döngüler ile girilen sayıya kadar olan 2'nin
        kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Ödev
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
        kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number.");
        int sayi=scanner.nextInt();
        System.out.println("4ün kuvveti=");
        for(int i=1;i<sayi;i*=4){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("5in kuvveti=");
        for(int i=1;i<sayi;i*=5){
            System.out.print(i+",");
        }





    }
}
