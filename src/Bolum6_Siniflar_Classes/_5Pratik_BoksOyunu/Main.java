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

        Fighter marc = new Fighter("Tolga" , 12 , 100, 90, 35);
        Fighter alex = new Fighter("Mehmet" , 10 , 95, 100, 40);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();



    }
}
