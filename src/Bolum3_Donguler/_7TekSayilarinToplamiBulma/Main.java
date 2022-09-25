package Bolum3_Donguler._7TekSayilarinToplamiBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java döngüler ile negatif bir değer girilene kadar
        kullanıcıdan girişleri kabul eden ve girilen değerlerden
        tek sayıları toplayıp ekrana basan programı yazıyoruz.

        Ödev
        Java döngüler ile tek bir sayı girilene kadar
        kullanıcıdan girişleri kabul eden ve girilen
        değerlerden çift ve 4'ün katları olan sayıları
        toplayıp ekrana basan programı yazıyoruz.
         */


        //Ödev Cevap


        Scanner scanner=new Scanner(System.in);

        int sum=0;
        int number;
        do{
            System.out.println("Enter number;");
            number=scanner.nextInt();
            if(number%2==0 && number%4==0){
                sum+=number;
            }
        }
        while(number%2==0);
        System.out.println("Sum:"+sum);





        //Tek sayıların toplamını gösteren yapı
        /*int sayi;
        int toplam=0;
        do{

            System.out.println("Sayi girin");
            sayi=scanner.nextInt();
            if(sayi%2==1){
                toplam+=sayi;
            }
        }while (sayi>0);
        System.out.println("Toplam : "+toplam);
        */

    }
}
