package Bolum6_Siniflar_Classes._5Pratik_BoksOyunu;

public class Main {
    public static void main(String[] args) {
        /*
        Boks Maçı
        Java Sınıflar ile boks maçını simüle eden programı yazıyoruz.

        Ödev
        Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile
        hesaplayan sistemi entegre ediniz.
         */

        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 40);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 30);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();



    }
}
