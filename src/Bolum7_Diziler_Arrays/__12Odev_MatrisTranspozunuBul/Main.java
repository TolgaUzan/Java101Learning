package Bolum7_Diziler_Arrays.__12Odev_MatrisTranspozunuBul;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu
        bulan programı yazınız.

        Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları
        ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris,
        başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin
        transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun.
        Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

        Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.

        Senaryo
        Matris :
        2    3    4
        5    6    4
        Transpoze :
        2    5
        3    6
        4    4
         */


        int[][] matris={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Transpozu alınacak dizi: ");
        for (int i = 0; i < matris.length ; i++) {
            for (int j = 0; j < matris.length ; j++) {
                System.out.print(matris[i][j]);
            }
            System.out.println();
        }
        System.out.println("Dizinin transpozu: ");
        for (int i = 0; i < matris.length ; i++) {
            for (int j = 0; j < matris.length ; j++) {
                System.out.print(matris[j][i]);
            }
            System.out.println();
        }




    }
}
