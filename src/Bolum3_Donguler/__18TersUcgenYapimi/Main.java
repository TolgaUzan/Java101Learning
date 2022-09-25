package Bolum3_Donguler.__18TersUcgenYapimi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
         yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10

 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *

         */

        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * (number - i) + 1; k++) {
                System.out.print("*");
            }

            System.out.println("");


        }
    }
}
