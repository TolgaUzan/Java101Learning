package Bolum3_Donguler.__20FibonacciSerisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java döngüler ile fibonacci serisi bulan program yazıyoruz.
        Fibonacci serisinin eleman sayısını kullanıcıdan alın.

        Fibonacci Serisi Nedir ?
        Fibonacci serisi, her sayının kendinden önceki ile toplanması
        sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide
        sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
        yani bir sayı kendisinden önceki sayıya bölündüğünde altın
        orana gittikçe yaklaşan bir dizi elde edilir.

        Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam,
        bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ
        tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

        9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
         */

        Scanner scanner=new Scanner(System.in);

        System.out.print("Lütfen eleman sayısını giriniz : ");

        int sayi = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 +" " +n2 + " ");
        for(int i = 1;i <= (sayi - 2);i++){
            int result = n1 + n2;
            System.out.print(result + " ");
            n1 = n2;
            n2 = result;
        }

    }
}
