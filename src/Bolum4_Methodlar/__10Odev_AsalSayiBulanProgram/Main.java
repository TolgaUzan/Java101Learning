package Bolum4_Methodlar.__10Odev_AsalSayiBulanProgram;

import java.util.Scanner;

public class Main {
    static boolean asal(int n, int j){

        if(n == j)
            return true;

        if(n % j == 0)
            return false;

        return asal(n, j + 1);
    }
    public static void main(String[] args) {
        /*
        Java dilinde "Recursive" metot kullanarak,
        kullanıcıdan alınan sayının "Asal" sayı olup
        olmadığını bulan programı yazın.

        Senaryo
        Sayı Giriniz : 39
        39 sayısı ASAL değildir !


        Sayı Giriniz : 17
        17 sayısı ASALDIR !
         */

        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        sayi = scanner.nextInt();
        System.out.print(asal(sayi,2) ? sayi + " sayısı ASALDIR !" : sayi + " sayısı ASAL değildir !" );



    }
}
