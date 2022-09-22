package Bolum2_KosulluIfadelerveKodBloklari._9OdevPratik_HavaSicakliginaGoreEtkinlik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi
        farklı çözüm yolları bulunuz.
         */

        Scanner scanner=new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Giriniz : ");
        int sicaklik=scanner.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsin.");
        }else if(sicaklik>=5 && sicaklik<15){
            System.out.println("Sinema gidebilirsin.");
        }else if(sicaklik>=15 && sicaklik<25){
            System.out.println("Piknik yapabilirsin.");
        }else if(sicaklik>=25){
            System.out.println("Yüzmeye gidebilirsin.");
        }






    }
}
