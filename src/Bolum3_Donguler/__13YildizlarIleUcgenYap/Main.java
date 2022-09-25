package Bolum3_Donguler.__13YildizlarIleUcgenYap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
        Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int k = 1; k <= (sayi - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = sayi-1; i >0; i--) {
            for (int j = 1; j <= (sayi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
