package Bolum8_MathveStringClassMethodlari._3Pratik_SayiTahminOyunu;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int hak=5;
    public static void main(String[] args) {
        /*
        Java dilinde programın 0-100 arasında rastgele seçtiği
        bir sayıyı kullanıcının tahmin etmesini istediğimiz bir
        "Sayı Tahmin Oyunu" yapıyoruz.
         */

        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int randomSayi=random.nextInt(0,100);

        System.out.println("Sayı Tahmin Oyununa Hoş Geldiniz .. ");
        System.out.println("5 Hakkınız var 0-100 arası sayı giriniz! İpucu vereceğiz.. !");

        while(hak>0){
            System.out.println("Lütfen bir sayı giriniz : ");
            int sayi= scanner.nextInt();
            if(sayi<100 && sayi>0){
                if(sayi==randomSayi){
                    System.out.println(sayi+" Doğru Tebrikler !! KAZANDINIZ !");
                    break;
                }else if(sayi>randomSayi){
                    System.out.println("İpucu:"+sayi+"> küçültün! ");
                }else if(sayi<randomSayi){
                    System.out.println("İpucu:"+sayi+"< büyültün! ");
                }

                hak--;
                System.out.println(hak+" Kalan hak !!");
                if(hak==0){
                    System.out.println(randomSayi+" 'dı . :(:(:( Bir dahaki Sefere Bol Şans");
                    System.out.println("Çıkış yapıldı sayılır .! ");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.exit(0);
                }
            }else{
                System.out.println("Girilen sayı hatalı!");
            }
        }



    }
}
