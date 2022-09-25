package Bolum3_Donguler._9FaktoriyelHesap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java ile faktöriyel hesaplayan program yazıyoruz.

        Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak
        r elemanlı farklı grupların sayısı n’in r’li
        kombinasyonu olarak adlandırılır. N’in r’li
        kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
         */
        // (n!) = 1*2*3*4*..n
        Scanner scanner = new Scanner(System.in);
        int n,r,totalN=1,totalR=1,nEksiR,totalNeksiR=1;
        double NRKombinasyon;

        System.out.print("N kümesinin eleman sayısını giriniz : ");
        n = scanner.nextInt();
        System.out.print("R kümesinin eleman sayısını giriniz : ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            totalN *= i;
        }

        for (int i = 1; i <= r; i++){
            totalR *= i;
        }

        nEksiR = n - r;

        for (int i = 1; i <= nEksiR; i++){
            totalNeksiR *= i;
        }

        NRKombinasyon = totalN / (totalR * totalNeksiR);

        if (n > r){
            System.out.println("N'in R'li kombinasyonu : " + NRKombinasyon);

        }else {
            System.out.print("R sayısı N sayısından büyük olamaz !");
        }



    }
}
