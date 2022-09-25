package Bolum7_Diziler_Arrays._1DizilerinGenelMantiklari;



public class Main {
    public static void arrayPrint(int[] array){
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] reverse(int[] list)
    {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--)
        {
            result[j] = list[i];
        }

        return result;
    }

    public static void main(String[] args) {

       int[] array={1,2,3,4,5,6,7,8,9,10};
       arrayPrint(array);
       int[] yeniArray= reverse(array);
        arrayPrint(yeniArray);
        //Tanımlama şekilleri
        int arrayInt2[]={1,2,3};
        int[] arrayInt = new int[]{1,2,3,4,5};
        double[] arrayDouble={1.2,4.5,6.0};
        String[] arrayString= new String[3];//3 elemanlı
        arrayString[0]="Tolga";//1.eleman
        arrayString[1]="Tolga";//2.eleman
        arrayString[2]="Tolga";//3.eleman
        //arrayString[3]="Eleman sayısından fazla";
        //Not index out of bound hatası dizinin adedinden fazla ekleme yapmışızdır
        for(String s:arrayString){
            System.out.println(s);
        }//forEach ile dizinin üzerinde rahatlıkla gezebilirim
        for(Integer number:arrayInt){
            System.out.println(number);
        }

        //bunun ile aynı şey
        System.out.println("DoubleArray  list:");
        for(int i=0;i<arrayDouble.length;i++){
            System.out.println(arrayDouble[i]);
        }
        /*
        Dizilerin Genel Mantıkları-
        Java'da Diziler (Arrays) , her değer için ayrı değişkenler oluşturmak yerine,
        birden çok değeri tek bir değişkende depolamak için kullanılır.
        Değişkenler hafızada tek bir değer tutmamızı sağlar. Fakat bazı durumlarda,
        birden çok veriyi bir arada bulundurmak isteriz. Örneğin, bir sınıfta okuyan
        20 öğrenci olsun. Bu 20 öğrenci için hafızada ayrı ayrı 20 tane değişken
        oluşturmak yerine, tek bir değişken kullanarak 20 öğrencinin koleksiyonunu tutmak isteyebiliriz.

        Bu gibi durumlarda dizileri kullanırız. Dizi, aynı türden birden fazla değişkeni
        tutmamızı sağlayan hafıza birimidir. Kısaca, dizileri aynı türden
        elemanları gruplamak için kullanırız. Dizi oluşturduktan sonra dizinin
        içerisindeki elemanlara indeks numarasıyla ulaşır ve değiştiririz.
        Ayrıca, çok boyutlu diziler oluşturmak da mümkündür. Tek boyutlu
        dizi kullanabileceğimiz gibi 2 veya 3 boyutlu diziler de oluşturabiliriz.
        2 boyutlu dizilere matris denir.

        Dizi (Array) kavramı programlama dillerinde bir veri tipini ifade eder.
        Bu veri tipi liste halindeki ardışık verileri bir arada tutan yapıya denilir.
        Bu ardışık yapıya ait elemanlara indis yoluyla erişim sağlanabilir.
        Diziler sabit boyutludur ve tanımlanırken boyutları belirtilir.


        Dizileri Fonksiyonlardan Geri Döndürmek-
        Fonksiyonlar belli bir işi yapıp sonucunda değer dönebilen veya dönmeyen kod bloklarıdır.
        Fonksiyonlar için altın kural, her fonksiyonun tek bir işi olmalıdır. Örneğin:
        dizi ortalaması alma işi yapan bir fonksiyon dizileri ekrana yazdırma işini yapmamalıdır.
        Veya dizilerin ortalamasını alma işi ile dizileri toplama işlemi aynı fonksiyon içinde
        olmamalıdır. Her biri ayrı fonksiyonlar olmalıdır.
        public static int[] reverse(int[] list)
        {
         int[] result = new int[list.length];

             for (int i = 0, j = result.length - 1; i < list.length; i++, j--)
         {
           result[j] = list[i];
        }

         return result;
        }
         */

    }
}
