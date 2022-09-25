package Bolum3_Donguler.__10UstluSayiHesapla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java ile kullanıcının girdiği değerler ile üslü sayı
        hesaplayan programı yazıyoruz.

        Ödev
        Java ile kullanıcının girdiği değerler ile üslü sayı
        hesaplayan programı "For Döngüsü" kullanarak yapınız.
         */


        Scanner scanner = new Scanner(System.in);

        int sayi,ussu;
        System.out.println("Üssü alınacak sayı ;");
        sayi = scanner.nextInt();
        System.out.println("Üs sayi ; ");
        ussu = scanner.nextInt();

        int sonuc=1;
        //3^4= 3*3*3*3 tür.
        for(int i=1;i<=ussu;i++){
            sonuc*=sayi;
        }
        System.out.println(sonuc);

    }
}
