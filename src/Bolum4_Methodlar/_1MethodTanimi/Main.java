package Bolum4_Methodlar._1MethodTanimi;

public class Main {

    public static int ustHesapla(int sayi,int uzeri){
        int sonuc=1;
        for(int i= 1;i<=uzeri;i++){
            sonuc*=sayi;
        }
        return sonuc;

    }
    static void toplama(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {

        /*Örneğin;
        f(x) = 2x + 5
        f(6) = 2*6 + 5 =17
        f(x,y,z) = 3x + 2y+5z
        f(2,3,4) = 3*2 + 2*3 +5*4=26 gibi Fonksiyonlar yazabiliriz.

        Diyelimki 2 üzeri 3 hesaplamak istiyorum.
        Ama bunu lazım olunca başka yerlerdede kullanıcam diyelim,
        Bunu method kullanarak ustHesapla şeklinde int döndüren bir metod olarak
        yapabilirim yada void olarak içinde sout ile sadece çıktı veren bir method
        yazabilirim .Erişim belirleyicisi public olduğu için istediğim yerde kullanırım.
        Bunu gönderdiğim paremetrelerle kolaklıkla yapabilirim .*/
        int sayi=2, uzeri=3 ,sonuc=1;

        for(int i= 1;i<=uzeri;i++){
            sonuc*=sayi;
        }
        System.out.println(sonuc);


        toplama(1,2);
        toplama(5,6);
        toplama(2,9);
        int methodResult= ustHesapla(4,5);
        System.out.println(methodResult);

        int sacmaIslem= (methodResult-12) * (methodResult%5);
        System.out.println(sacmaIslem);

        System.out.println(ustHesapla(3,2));
        //gibi method kullanarak istediğim yerden çağırırım.


    }


      /*

        Metotlar (Fonksiyonlar)
        Java'da Metotlar sadece çağrıldığında kullanılan kod bloklarıdır. Metotlara bir diğer adlandırma olarak Fonksiyonlar'da denilmektedir. Bunun sebebi bu kod yapısının matematikte ki fonksiyon mantığına çok benzemesidir. Java'da metotlarımızın içerisine veri aktarmak için ise parametre girebilmekteyiz.

        Neden Metot Kullanırız ?
        Programlamada metot kullanmamızın sebebi, bir çok yerde kullanacağımız kodu tek seferde yazıp lazım olduğunda çağırmaktır. Örnek vermek gerekirse, programımız içerisinde bir çok yerde matematikteki "üs alma" işlemini gerçekleştirmiş olalım. Her defasında üs alma işlemi için aynı kodları yazmak yerine bu kodları metot olarak yazıp lazım olduğunda çağırmak işlerimizi kolaylaştıracaktır. Ayrıca metotlar "Nesne Yönelimli Programlamanın" yapı taşlarındandır. Programlamada karmaşık bir problemi daha küçük parçalara bölmek, programınızın anlaşılmasını kolaylaştırır ve yeniden kullanılabilir hale getirir.

        Metot Tanımlama
        Java'da metotların sözdizimi şu şekildedir :

        veriTipi metotAdi(parametre1, parametre2, ....) {
         // kod bloğu
        }
        veriTipi : Metotlar geriye bir değer döndürebilir, bu değerin veri tipini metot tanımlanırken belirtilir. Örneğin metot geriye "integer" veri tipinde bir değer döndürecekse "veriTipi" kısmına "int" anahtar sözcüğü yazılmalıdır. Eğer metotlar geriye bir değer döndürmeyecekse "void" anahtar sözcüğü kullanılır.
        metotAdi : Metodumuzun benzersiz ismidir ve bu isimlendirme ile metotlar çağrılır.
        kod bloğu : Bu kısım metot çağrıldığı zaman, program tarafından çalışacak kod bloğudur.
        parametre1/parametre2 : Bu kısım metot içerisine aktarma istediğimiz verilerdir ve parametre olarak adlandırılır.
        Örneğin :

        int toplama(int a,int b) {
        // kod bloğu
        }
        Yukarıda ki örnekte bir metot tanımladık. Bu metodun adı "toplama" ve geriye döndürdüğü veri tipi "int" türüdür.

        Metot Çağırma
        Java'da önceden yazdığımız metotları erişimi olduğu yerlerde çağırabiliriz. Java'da bir metodu çağırmak için metodun adını ve ardından iki parantez () ve bir noktalı virgül yazılmalıdır. Aşağıda ki örnekte toplama(); adlı metodun nasıl çağrıldığı hakkında bir örnektir.

        public class JavaPatika {static int toplama(int a, int b) {
        return a + b;
        }
        public static void main(String[] args) {
        int sonuc = toplama(5, 2);
        System.out.println(sonuc);
        }
        }

        // Çıktısı "7"
         */
}
