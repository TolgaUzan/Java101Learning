package Bolum7_Diziler_Arrays.__11Odev_DizidekiElemanlarinFrekansi;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani
frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
         */

        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        //5 10 10 10 20 20 20 20
        int say = 1;
        int a = 0;
        Arrays.sort(dizi);


        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] != a) {

                for (int j = 0; j < dizi.length; j++) {

                    if ((i != j) && (dizi[i] == dizi[j])) {
                        say++;
                        a = dizi[i];
                    }
                }
                System.out.println(dizi[i] + " sayısı " + say + " kere tekrar edildi.");
                say = 1;

            }
        }
    }
}