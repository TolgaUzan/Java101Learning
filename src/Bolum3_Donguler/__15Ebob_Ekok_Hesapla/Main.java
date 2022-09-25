package Bolum3_Donguler.__15Ebob_Ekok_Hesapla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.
        EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne
        bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
        ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
        18’in bölenleri : 1, 2, 3, 6, 9, 18
        24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24
        Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.
        EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne
        bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
        ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.
        6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …
        8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …
        Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.
        EKOK = (n1*n2) / EBOB
        Ödev
J       ava ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
         */

        int sayi1,sayi2,enbuyuk,ebob=1,ekok=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("2 Sayının EBOB ve EKOK 'u :");
        System.out.print("Sayi1 girin:");
        sayi1=scanner.nextInt();
        System.out.print("Sayi2 girin:");
        sayi2=scanner.nextInt();
        enbuyuk=sayi1;
        if(enbuyuk>sayi2){
            enbuyuk=sayi1;
        }else{
            enbuyuk=sayi2;
        }
        int i=1;
        while(i<=enbuyuk){
            if(sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
            i++;
        }
        System.out.println("En büyük ortak bölen :"+ebob);
        ekok=(sayi1*sayi2)/ebob;
        System.out.println("En küçük ortak bölen :"+ekok);



    }
}
