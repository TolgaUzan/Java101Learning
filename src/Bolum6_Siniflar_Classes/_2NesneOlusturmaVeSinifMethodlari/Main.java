package Bolum6_Siniflar_Classes._2NesneOlusturmaVeSinifMethodlari;

public class Main {
    public static void main(String[] args) {
        /*

            Örnek Cars sınıfı. .

            İçerisinde ;
            private properties özellik değişkenleri
            ve örnek methodlarını oluşturdum .
            Constructor yapıcı method ve ulaşabilmem için
            Getter setter yapımı oluşturdum.

            Main method içerisinde objemizi oluşturalım .
         */


        Cars bmw=new Cars("Bmw",4,2,"Kırmızı",230);

        Cars toyota=new Cars();
        toyota.setMarka("toyoya");
        toyota.setKapi(4);
        toyota.setHiz(200);
        toyota.setRenk("beyaz");
        toyota.setTeker(4);

        toyota.kapıAc();
        toyota.hizArttir(22);
        System.out.println(toyota.getHiz());
        toyota.hizArttir(86);
        System.out.println(toyota.getHiz());


        System.out.println(bmw.getMarka());
        bmw.kapıAc();
        bmw.hizArttir(15);
        System.out.println(bmw.getHiz());
    }
}
