package Bolum7_Diziler_Arrays._7Pratik_DiziMaxveMinDegerBulma;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dizideki Elemanların Max ve Min Değerlerini Bulan Program
        //Dizi içindeki en küçük en büyük sayı bulma benim çözümüm

        Integer[] array = {-100,-34,-55,-77,88,100,56, 34, 1, 5, 233, -1, -31, 22, 12, 11, 7, 65, 44};
        Arrays.sort(array);
        System.out.println("En küçük : " + array[0]);
        System.out.println("En büyük : " + array[array.length - 1]);

        /*
        Ödev  Çözümüm --
        Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en
        büyük en yakın sayıyı bulan programı yazınız.

        Dizi : {15,12,788,1,-1,-778,2,0}
        Girilen Sayı : 5
        Girilen sayıdan küçük en yakın sayı : 2
        Girilen sayıdan büyük en yakın sayı : 12
 */
        Scanner scanner = new Scanner(System.in);
        int sayi, enyakinK = 0, enyakinB = 0;
        System.out.println("-100 ile 100 arasında bir sayı girin:");
        sayi = scanner.nextInt();
        System.out.println("Senin sayına en yakın sayılar ..");
        Arrays.sort(array);
        for (int i : array) {
            if (i < sayi) {
                enyakinK = i;
            }
        }
        Arrays.sort(array, Collections.reverseOrder());
        for (int i : array) {
            if (i > sayi) {
                enyakinB = i;
            }
        }
        System.out.println("Sayina en yakın küçük sayı :" + enyakinK);
        System.out.println("Sayina en yakın büyük sayı :" + enyakinB);




    }
}
