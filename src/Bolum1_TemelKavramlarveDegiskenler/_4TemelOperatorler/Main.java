package Bolum1_TemelKavramlarveDegiskenler._4TemelOperatorler;

public class Main {
    public static void main(String[] args) {

        /*
        Java'da operatörler aşağıdaki gibi listelenebilir:

        Atama Operatörleri
        Aritmetiksel Operatörler
        İlişkisel ve Eşitlik Operatörler
        Koşul Operatörler
        Mantıksal Operatörler
         */

        //Atama Operatörleri ;
        /*
        a = b Basit atama sağdakinin değeri sola atanır.
        a+=b  a = a+b dir.
        a-=b  a = a-b dir.
        a*=b  a = a-b dir.
        a/=b  a = a-b dir.
        a%=b  a = a%b dir.
         */
        int a = 1;
        int b = a;
        System.out.println(b);

        //Karşılaştırma Operatörleri ;
        /*-karşılaştırmayı true yada false dönerler.
        a==b Eşitlik
        a!=b Eşit Değil
        a>b  Büyüktür
        a<b  Küçüktür
        a>=b Büyük yada Eşittir
        a<=b Küçük yada Eşittir.
         */

        System.out.println(a>=b); //true
        System.out.println(a<b); //false

        //Mantıksal Operatörler ;
        /*
        a && b  And ve
        a || b  Or veya
        !(a&&b) Not değil
         */
        //Or koşuldan biri doğruysa true döner .
        System.out.println(a>b || a==b);//true
        //And koşuldan ikisi doğruysa true yoksa false döner.
        System.out.println(a>b && a==b);//false
        // !Not  Koşulun tersini döndürür
        boolean yanlis= a>b;
        System.out.println(!yanlis);//doğru


        //Aritmetik Operatörler
        /*
        Toplama : a + b
        Çıkarma : a – b
        Çarpma : a * b
        Bölme : a / b
        Mod alma : a % b Sayının bölümünden kalan.
        1 arttırma : a++;
        1 eksiltme : b--;
         ++a; ve --b;
         kullanımıda önce çıkarır sonra b' yi gösterir.
         yada önce toplar sonra a' yı gösterir.

         */

        byte x = 0;
        int z= b++; //önce atar sonra toplar.
        System.out.print(z); //0 dır.

        //Koşul Operatörü
        /*
        Java'da Koşul Operatörleri ifadelerin sonucunda oluşacak olayları belirler.

        a = 5 ;
        b = (a == 1) ? 1 : 0
        Çıktısı : 0
         */




    }
}
