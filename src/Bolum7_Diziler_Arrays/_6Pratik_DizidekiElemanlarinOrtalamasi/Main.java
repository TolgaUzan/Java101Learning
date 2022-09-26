package Bolum7_Diziler_Arrays._6Pratik_DizidekiElemanlarinOrtalamasi;

public class Main {

    public static void main(String[] args) {


        System.out.println("****************");
        double[] list = {1, 2, 3, 4.2, 5.23};
        double ortalama = 0.0;
        for (int i = 0; i < list.length; i++) {
            ortalama += list[i];
        }
        double result = (ortalama / list.length);

        System.out.print(result);

        System.out.println();



        /*
Dizideki Elemanların Ortalamasını Hesaplayan Program
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum / numbers.length);
    }
}
Ödev
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
         */

        double[] list2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        for (int row = 0; row < list2.length; row++) {

            sum = sum + (1 / list2[row]);
            System.out.print(row + ". row" + " " + "Sum is:\t");
            System.out.format("%.2f", sum);
            System.out.println();
        }
        System.out.print("Harmonic Average is: ");
        System.out.format("%.2f", sum / list2.length);

    }
}
