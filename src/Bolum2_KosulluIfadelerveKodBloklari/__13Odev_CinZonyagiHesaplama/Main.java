package Bolum2_KosulluIfadelerveKodBloklari.__13Odev_CinZonyagiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
        Çin Zodyağı nedir?
        4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları
        12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla
        (10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
        Çin Zodyağı nasıl hesaplanır?
        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
        Doğum Tarihi %12 = 0 ➜ Maymun
        Doğum Tarihi %12 = 1 ➜ Horoz
        Doğum Tarihi %12 = 2 ➜ Köpek
        Doğum Tarihi %12 = 3 ➜ Domuz
        Doğum Tarihi %12 = 4 ➜ Fare
        Doğum Tarihi %12 = 5 ➜ Öküz
        Doğum Tarihi %12 = 6 ➜ Kaplan
        Doğum Tarihi %12 = 7 ➜ Tavşan
        Doğum Tarihi %12 = 8 ➜ Ejderha
        Doğum Tarihi %12 = 9 ➜ Yılan
        Doğum Tarihi %12 = 10 ➜ At
        Doğum Tarihi %12 = 11 ➜ Koyun
        Senaryo
        Doğum Yılınızı Giriniz : 1990
        Çin Zodyağı Burcunuz : At

         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Doğum yılınızı yazınız : ");
        int year=scanner.nextInt();
        System.out.println("Çin zodyağı\n");
        if(year%12==0) System.out.println("Maymun");
        else if(year%12==1) System.out.println("Horoz");
        else if(year%12==2) System.out.println("Köpek");
        else if(year%12==3) System.out.println("Domuz");
        else if(year%12==4) System.out.println("Fare");
        else if(year%12==5) System.out.println("Öküz");
        else if(year%12==6) System.out.println("Kaplan");
        else if(year%12==7) System.out.println("Tavşan");
        else if(year%12==8) System.out.println("Ejderha");
        else if(year%12==9) System.out.println("Yılan");
        else if(year%12==10) System.out.println("At");
        else if(year%12==11) System.out.println("Koyun");



    }
}
