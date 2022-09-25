package Bolum4_Methodlar._4MethodlardaLocalDegiskenler;

public class Main {

    static int a = 12;
    static int b = 44;

    static void denemeMethod(int a, int b) {

        System.out.println(a + " " + b);
    }

    static void deneme2() {

        System.out.println(a + b);
    }

    public static void main(String[] args) {

        /*
                Local Değişkenler
        üst Parentdaki değişkeni alt tarafa miras bırakır gibi düşünebiliriz.
        ama bir alt satırdaki değişkene üst taraftan erişemeyiz
        ancak aynı{..} içinde yada üstten alabiliyor.
        Global Değişken tanımlayarak farklı methodlar içerisinde aynı değişkene
        ulaşabiliriz.

        Değişkenler tanımlandıkları kod bloklarına aitlerdir.
        */
        deneme2();
        denemeMethod(1, 2);
        int a = 10;
        int b = 5;

        if (a > b) {
            a = 5;
            b = 7;
            System.out.println(a + " " + b);
        }
        a = 9;
        b = 11;
        System.out.println(a + " " + b);






        /*
        Lokal Değişken Kavramı
        Java'da lokal değişkenler, kod blokları içerisinde tanımlanan değişkenlerdir
        ve sadece tanımlandıkları kod blokları içerisinde kullanılabilirler.
        Diğer metot ve sınıflar üzerinden erişimleri yoktur.
        Lokal değişkenler tanımladıkları ({...}) kod blokları arasında kullanılırlar.

        public class JavaPatika {
	        static void ekranaBas(){
             // Hatalı kullanım
             System.out.println(a);
        }

        public static void main(String[] args) {
        int a = 10;
        if (a < 10) {
            int b = 20;
            System.out.println(a);
        }
             // Hatalı kullanım
            System.out.println(b);
            }
        }
        Bu örnekte if blokları arasında tanımlanmış olan integer türünde
        ki "b" değişkeni, if bloğunun dışında ekrana bastırılmak istenildiğinde
         hata ile karşılaşılacaktır. Çünkü "b" değişkeni if blokları arasında tanımlanmıştır ve tanımlandığı kod blokları arasında kullanılabilir.

        Dikkat edilmesi gereken diğer bir nokta, main metodun içerisinde
        tanımlanmış olan "a" değişkeni if bloğu içerisinde kullanılabilir,
        çünkü if bloğu main metodun bir parçasıdır. Ama "a" değişkeni ekranaBas();
        metodu içerisinde kullanılamaz, bunun sebebi ise ekranaBas() ve main metodu
        farklı iki kod bloklarıdır.
         */


    }
}
