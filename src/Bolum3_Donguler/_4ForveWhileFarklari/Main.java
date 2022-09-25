package Bolum3_Donguler._4ForveWhileFarklari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        For ve While Döngüsü Arasındaki Farklar
        Java’da for, while ve do-while olmak üzere 3 adet döngü deyimi
        bulunmaktadır. Birbirinden farklı bu döngülerden hangisini
        kullanacağız ?

        Hiç bir algoritmada hangi döngünün kullanılması gerektiği ile
        ilgili kesin bir yargı ve kural söz konusu değildir. Bu döngüler
        uygun şekilde tasarlandıkları sürece aynı işi yapabilirler.
        Ama genellikle, kaç kere döneceği belli olmayan, koşulun
        bir girdiye göre denetlendiği durumlarda While ya da do-while
        döngüsü kullanılırken, diziler gibi, tekrar sayısı belirli
        olan durumlarda ise for döngüsü kullanılması tercih edilir.
        Ama yine bu yazılımcının kendisine bağlıdır.

        Kullanıcıdan negatif sayı girene kadar sürekli sayı isteyen
        bir program yapalım örnek olarak
         */

        Scanner scanner=new Scanner(System.in);
        int sayi;

        //Sonunu bilmediğimiz bir işi for ile yapmış olduk
        for (boolean isRun= true; isRun;){

            System.out.println("For döngü Sayi giriniz.");
            sayi= scanner.nextInt();
            if(sayi<0){
                isRun=false;
            }
        }



        System.out.println("For döngüsü bitti.\nwhile başladı");
        //Birde while ile yapalım
        sayi=scanner.nextInt();
        while(sayi > 0){
            System.out.println("while döngü Sayi giriniz.");
            sayi= scanner.nextInt();
        }



        System.out.println("while döngüsü bitti.\nDo while başladı");
        //şimdi birde Do while ile yapalım

        do{
            System.out.println("doWhile Sayi giriniz.");
            sayi= scanner.nextInt();
        }while(sayi>0);


        //1 den 10 a kadar olan sayıları yazdıralım şimdi .

        for(int i=1;i<=10;i++){
            System.out.print(i+",");
        }
        sayi=1;
        while(sayi<=10){
            System.out.print(sayi+",");
            sayi++;
        }


        //Sonunu bilmediğim noktada while daha karlı görülüyor.
        //Not olarak
        // Collection daki itemları sıralamak içinde tabiki
        //ilerde foreach kullanacağım .

    }
}
