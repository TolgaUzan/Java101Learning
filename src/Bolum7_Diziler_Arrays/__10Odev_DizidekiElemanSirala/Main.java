package Bolum7_Diziler_Arrays.__10Odev_DizidekiElemanSirala;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java dilinde, dizideki elemanları küçükten büyüğe sıralayan
        programı yazınız. Dizinin boyutunu ve dizinin elemanlarını
        kullanıcıdan alınız.

Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99


Dizinin boyutu n : 6
Dizinin elemanlarını giriniz :
1. Elemanı : 1000221
2. Elemanı : 22
3. Elemanı : -1
4. Elemanı : 999
5. Elemanı : 0
6. Elemanı : 254
Sıralama : -1 0 22 254 999 1000221
         */

        int[] dizi=new int[10];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Başlamak için Enter Please ;\n");
        System.out.println("10 Tane sayı giriniz ");
        scanner.next();
        long baslangic = System.currentTimeMillis();
        for(int i=0;i<10;i++){
            System.out.println("Enter number : ");
            int sayi=scanner.nextInt();
            dizi[i]=sayi;
        }

        Arrays.sort(dizi);
        System.out.println("[");
        System.out.println(Arrays.toString(dizi));
        System.out.println("]");
        long bitis=System.currentTimeMillis();
        System.out.printf("Geçen süre : %.3f saniye",(double)(bitis-baslangic)/1000);


    }
}
