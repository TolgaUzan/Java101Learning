package _10OdevDaireAlanveCevreHesapla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını
        ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;

        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan
        programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Dairenin Alanı, Çevre ve Dilim Alanı Hesaplama" +
                "\nDairenin yarıçapını giriniz :");
        int r=scanner.nextInt();
        System.out.print("Merkez açının ölçüsünü giriniz: ");
        int a=scanner.nextInt();
        double alan=Math.PI*r*r;
        double cevre=2*Math.PI*r;
        double dilimAlan=Math.PI*(r*r)*a/360;
        System.out.print("\tDairenin Alanı : "+alan+
                           "\n\tDairenin Çevresi : "+cevre+
                           "\n\tDairenin Diliminin Alanı : "+dilimAlan);
    }
}
