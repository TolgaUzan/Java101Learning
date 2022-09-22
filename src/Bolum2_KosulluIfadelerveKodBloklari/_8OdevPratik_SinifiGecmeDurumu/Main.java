package Bolum2_KosulluIfadelerveKodBloklari._8OdevPratik_SinifiGecmeDurumu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

        Geçme Notu : 55

        Ödev
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */
        Scanner scanner= new Scanner(System.in);
        int mat,fiz,tur,kim,muz;
        int ort=0;
        int sayac=0;

        //Ortalamaya şartlar sağlanırsa ekleniyor ve eklenen ders olarak sayac artıyor.
        System.out.println("Matematik Notu girin :");
        mat=scanner.nextInt();
        if(mat>0 && mat<=100){
            ort+=mat;
            sayac++;
        }
        System.out.println("Fizik Notu girin :");
        fiz=scanner.nextInt();
        if(fiz>0 && fiz<=100){
            ort+=fiz;
            sayac++;
        }
        System.out.println("Türkçe Notu girin :");
        tur=scanner.nextInt();
        if(tur>0 && tur<=100){
            ort+=tur;
            sayac++;
        }
        System.out.println("Kimya Notu girin :");
        kim=scanner.nextInt();
        if(kim>0 && kim<=100){
            ort+=kim;
            sayac++;
        }
        System.out.println("Müzik Notu girin :");
        muz=scanner.nextInt();
        if(muz>0 && muz<=100){
            ort+=muz;
            sayac++;
        }
        double sonuc = ort/sayac;

        //Geçti / Kaldı Sonucu :
        if(sonuc>55){
            System.out.println("Tebrikler Geçtiniz ..\n" +
                    "Not Ortalamanız : "+sonuc);
        }else{
            System.out.println("Malesef Kaldınız ..\n" +
                    "Not Ortalamanız : "+sonuc);
        }



    }
}
