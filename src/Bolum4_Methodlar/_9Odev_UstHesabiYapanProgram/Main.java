package Bolum4_Methodlar._9Odev_UstHesabiYapanProgram;

import java.util.Scanner;

public class Main {

    static int power(int a, int b){
        if(a == 1 | b == 0)
            return 1;

        return power(a,b-1) * a;
    }
    public static void main(String[] args) {
        /*
        Recursive Metotlar ile Üslü Sayı Hesaplama
        Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma
        işlemini "Recursive" metot kullanarak yapan programı yazınız.

Senaryo

Taban değeri giriniz :2
Üs değerini giriniz : 0
Sonuç : 1
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125
         */
        Scanner scanner= new Scanner(System.in);
        System.out.print("1. Sayı: ");
        int a = scanner.nextInt();
        System.out.print("2. Sayı: ");
        int b = scanner.nextInt();

        System.out.println("Sonuç: " + power(a, b));
    }
}
