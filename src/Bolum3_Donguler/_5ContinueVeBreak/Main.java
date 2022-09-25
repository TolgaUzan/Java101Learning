package Bolum3_Donguler._5ContinueVeBreak;

public class Main {
    public static void main(String[] args) {

        /*
        Continue ve Break Komutları
        Continue Deyimi
        Java'da "continue" deyimi , döngü içinde bir koşul oluştuğunda
         o döngüyü tamamlamadan bir sonraki kademeye geçmeye yarar.

        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
            continue;
         }
         System.out.println(i);
        }
        Örnekte görüldüğü gibi eğer i değişkeni 5 sayısına eşit olduysa,
        o kod bloğundan sonraki kodlar çalışmayıp döngü bir sonraki
        adıma geçiş yapacaktır.

        Break Deyimi
        Buraya kadar gördüğümüz bütün döngüler belirlediğimiz bir
        koşula göre kontrol ediliyor ve bu koşul sağlandığı sürece
        çalışıyordu. Bazı durumlarda, döngü koşulu sağlansa bile başka
        bir nedenden ötürü döngüyü sonlandırmak isteyebiliriz.
        Bu tarz durumlarda break deyimini kullanırız. Bu deyim,
        içinde kullanıldığı döngüyü anında sonlandırır.

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
            break;
        }
        System.out.println(i);
        }
        Örnekte görüldüğü üzere döngü içinde ki koşul tamamlanmadan
        i değişkeni 5 değerine ulaştığında "break" komutu ile döngümüzü
        bitirebiliriz.
         */



        for(int i=0;i<10;i++){
            if(i==5){
                System.out.println("i 5 oldu es geçtim.Döngü başına");
                continue;
            }
            System.out.println(i);
        }

        //break kır ;
        int sayi=0;
        while(sayi<10){
            if(sayi==7){
                System.out.println("sayi7 ise döngüyü kır.");
                break;
            }
            System.out.println(sayi);
            sayi++;
        }

        //Tek sayıları bastırmak istiyorum
        int sayi2=0;
        while(sayi2<=10){

            sayi2++;
            if(sayi2 % 2 ==0){
                continue;
            }
            System.out.println(sayi2);
        }


    }
}
