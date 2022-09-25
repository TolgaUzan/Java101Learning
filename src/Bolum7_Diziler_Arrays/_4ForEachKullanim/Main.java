package Bolum7_Diziler_Arrays._4ForEachKullanim;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ForEach Sınıf objeleri
        Person person1=new Person("tolga","uzan",29);
        Person person2=new Person("mehmet",".",60);
        Person person3=new Person("buket",".",22);
        Person person4=new Person("çiğdem",".",50);
        List<Person> kisiList= new ArrayList<>();
        kisiList.add(person1);
        kisiList.add(person2);
        kisiList.add(person3);
        kisiList.add(person4);
        //Sınıf objeleri üstünde gezinmek
        for (Person kisi:kisiList) {
            System.out.println(kisi.getName());
            System.out.println(kisi.getSurname());
            System.out.println(kisi.getAge());
            System.out.println("*******************");
        }
        //ForEach Array üstünde
        int[] list = {1,2,3,4};
        String[] sList={"Tolga","Mehmet","Buket","Çiğdem"};
        //ForEach ArrayList üstünde
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("tolga");
        arrayList.add("mehmet");
        arrayList.add("buket");
        arrayList.add("çiğdem");

        for (String s:sList) {
            System.out.println(s);
        }
        for (Integer i:list) {
            System.out.println(i);
        }
        for (String s:arrayList) {
            System.out.println(s);
        }//ŞEKLİNDE KULLANIMI MEVCUT .

        int[][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int[]row:matris) {
            for (int col:row) {
                System.out.print(col);
            }
            System.out.println();
        }



        //gibi kullanabiliriz
        //Not : Collectionframework hiyerarşisinde Iterable Interface 'i ile ilişkisi olanları
        //Bu şekişde sıralayabiliyoruz
        //Map Interfaceini sıralamak için farklı şekilde bir kullanım vardı hatırladıgım kadarıyla
        //Onuda ilede göreceğiz.




        /*
        ForEach Kullanımı
        Java'da ForEach deyimi adında da anlaşılacağı gibi bir döngüyü ifade eder.
        Genelde dizilerdeki ve listelerdeki elemanları daha hızlı şekilde ulaşmak için kullanılan kısa bir yöntemdir. Kısacası for döngüsünün modifiye edilmiş halidir.

        for (veritipi degisken: diziAdi) {
             // kod bloğu
        }
        Örnekte Java'da ForEach kullanımını görmektesiniz, yine bir for döngüsü
        oluşturuyoruz ama iki parametreyi iki nokta ile ayırıyoruz.
        İlk kısmında dizinin döndüreceği veri tipini ve for içinde dizinin
        elemanı olarak kullanacağınız değişkeni tanımlıyorsunuz, diğer kısımda
        ise dizimizin ismini yazıyoruz.

        Bu örneğimizde arabalar dizisinin forEach ile nasıl kullanıldığını görmektesiniz.

        String[] arabalar = {"BMW", "Mercedes", "Ford", "Ferrari"};
        for (String i : arabalar) {
         System.out.println(i);
        }

        // Çıktısı
        // BMW
        // Mercedes
        // Ford
        // Ferrari
        Çok boyutlu dizilerde forEach kullanımı

        public class Main {public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] u : matris) {
            for (int elem : u) {
                System.out.println(elem);
            }
        }
    }
}
         */
    }
}
