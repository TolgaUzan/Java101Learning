package Bolum4_Methodlar._3MethodlardaOverloading;

public class Main {

    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    static void sum(String sum){
        System.out.println(sum);
    }
    static void sum(double a,double b){
        System.out.println(a+b);
    }

    static void show(int a, char b) {
        System.out.print("PATİKA PATİKA ");
    }

    public static void main(String[] args) {


        //Method Overloading basitçe ...

        sum(1,2);
        sum(2,4,3);
        sum(5,7,3,2);
        sum("TOPLAMA");
        sum(21.3,2.4);
        //Aynı method ismi ile farklı parametreler göndererek kullanabilirim
        //bunada MethodOverloading deniyor.Aşırı Yükleme




        /*
        Metotlarda Overloading (Aşırı Yüklenme)
        Java'da, iki veya daha fazla metot, parametreler açısından farklılık gösteriyorsa (farklı sayıda parametre, farklı türde parametre veya her ikisi) aynı isime sahip olabilir. Bu duruma metotlarda "Overloading" yani aşırı yüklenme işlemi denir.

        Buradaki amaç aynı işlemi farklı parametrelerle yapacak olan metot ismini tek seferde kullanmaktır. Overloading işlemi "Nesne Yönelimli Programlamada" da çok kullanılmaktadır.

        void func() { ... }
        void func(int a) { ... }
        float func(double a) { ... }
        float func(int a, float b) { ... }
        Burada func() metodu (overloading) aşırı yüklenmiştir. Bu metotlar aynı isime sahiptir ancak farklı parametreler kabul eder.

        Not: Yukarıdaki metotların dönüş türleri aynı değildir. Bunun nedeni, metot aşırı yüklemesinin dönüş türleriyle ilişkili olmamasıdır. Aşırı yüklenmiş metotlar aynı veya farklı dönüş türlerine sahip olabilir, ancak parametreler açısından farklılık göstermeleri gerekir.

        public class JavaPatika {static void ekranaYaz(int a) {
             System.out.println("Parametreler : " + a);
        }

        static void ekranaYaz(int a, int b) {
            System.out.println("Parametreler : " + a + " ve " + b);
        }

        public static void main(String[] args) {
            ekranaYaz(5);
            ekranaYaz(10, 2);
            }
        }
        // Çıktısı :
        // Parametreler : 5
        // Parametreler : 10 ve 2
         */
    }
}
