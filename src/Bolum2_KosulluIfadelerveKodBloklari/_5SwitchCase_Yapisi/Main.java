package Bolum2_KosulluIfadelerveKodBloklari._5SwitchCase_Yapisi;

public class Main {
    public static void main(String[] args) {
        /*
        Switch-Case Yapısı
        Java'da birden çok kod bloğunu koşullara bağlamak için "switch"
        deyimi kullanılır. Switch Case; tanımlanmış olan yalnızca bir değişkenin,
         alacağı değerlere bağlı olarak, farklı sonuçlar döndürmesini sağlayan
         bir yapıdır. Switch kısmında kullanılacak olan değişkenler
         "byte, short, int, char veya String" veri tipine sahip olmalıdır.
         */

        //Not break; unutulursa alttındaki tüm kod satırları çalışır.

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default: break;
            // değer hiç bir şeye eşit değilse bu kod bloğu çalışacak
        }


    }
}
