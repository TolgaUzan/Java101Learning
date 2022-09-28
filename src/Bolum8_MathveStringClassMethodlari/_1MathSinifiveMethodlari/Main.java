package Bolum8_MathveStringClassMethodlari._1MathSinifiveMethodlari;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
           Math Sınıfı ve Metotları
           Java bazı durumları bizim için önceden yazdığı sınıflar ile bizlerin
           işini kolaylaştırmıştır. Bunlardan bir tanesi de Math sınıfıdır.
           Adında da anlaşılacağı gibi Java'da Math sınıfı matematiksel
           fonksiyonlar sunmaktadır. Java Math sınıfı, sayılar üzerinde matematiksel
           işlemler gerçekleştirmenize izin veren birçok metoda sahiptir.

            Math sınıfının kullanımı şu şekildedir;
            Math.MethodAdi(Parametreler)

            Math.abs(x) xin mutlak değerini verir.


         */
        System.out.println(Math.abs(2)); //Mutlak değeri döner
        System.out.println(Math.cbrt(2)); //KüpKökünü döner
        System.out.println(Math.ceil(2.78)); //En yakın tam sayıya yuvarlanmış x değeri döner
        System.out.println(Math.floor(2.78)); //En yakın tam sayıya yuvarlanmış x değeri döner
        System.out.println(Math.log10(100)); //xin 10 tabanındaki logaritmasını verir
        System.out.println(Math.log(10)); //Xin dogal logaritmasını (e tabanında) verir
        System.out.println(Math.max(1,2)); //2 sayıdan maxı verir
        System.out.println(Math.min(1,2)); //2 sayıdan min döner
        System.out.println(Math.pow(2,3)); //2 üzeri 3 verir
        System.out.println(Math.random()); //Parametre almıyor 0.0 ile 1.0 arasında değer döner
        System.out.println(Math.round(10.1f)); //float En yakın tam sayıya yuvarlanmış int verir
        System.out.println(Math.rint(10.1d)); //double En yakın tam sayıya yuvarlanmış int verir
        System.out.println(Math.signum(-100)); //X in işaretini verir - yada + pozitif olarak
        System.out.println(Math.sqrt(2)); //X in karekök verir.









    }
}
