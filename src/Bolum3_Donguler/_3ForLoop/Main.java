package Bolum3_Donguler._3ForLoop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        /*
        For Döngüsü
        Java'da döngüler konusunda öğrendiğimiz gibi For döngüsü ile
        bir koşul belirterek döngülerimizi oluşturabiliriz.

        for (durum 1; durum 2; durum 3) {
        // çalışacak kod bloğu
        }
        For döngüsü şu şekilde işler: İlk olarak döngüde sayaç işlevi
        görecek bir değişken oluşturulur. Bu değişkenin ilk değeri [durum 1]
         ile belirtilen kısımda verilir. Bu değişken [durum 3] kısmında
         isteğe göre artırılır veya azaltılır. Döngünün hangi koşulda
         çalışacağı ise [durum 2] kısmında boolean bir ifadeyle belirtilir.

        for (int i = 0; i < 10; i++) {
        System.out.println(i);
        }
        Bu For Döngüsü örneğinde 1'den 10'a kadar olan sayıları ekrana yazdırdık.
        İlk durumda, i adında türü int olan ve varsayılan değeri 0 olan bir
         değişken tanımladık. Bu değişken bizim kodumuzda sayaç görevi görecektir.
        İkinci durumda, döngünün çalışması için gerekli koşulu tanımlar
        (i, 10'ten küçük olmalıdır). Koşul doğruysa döngü yeniden başlayacak,
         yanlışsa döngü sona erecektir.
        Üçüncü durumda, döngüdeki kod bloğu her çalıştığında değeri 1
        arttıran kodumuzu yazdık.
         */


        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);

        //For
        for(int i=1; i<10 ; i++){
            System.out.print(i+" ,");
        }
        System.out.println();
        //Foreach
        for (Integer i: integerArrayList) {
            System.out.print(i+" ,");
        }
        System.out.println();
        //aynısı while ile de yapabilirdim

        int k=1;
        while(k<10){
            System.out.print(k+" ,");
            k++;
        }


    }
}
