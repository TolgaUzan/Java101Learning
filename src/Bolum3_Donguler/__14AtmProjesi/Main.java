package Bolum3_Donguler.__14AtmProjesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java döngüler ile kullanıcının banka hesabını
        yönetebildiği bir ATM projesi yapıyoruz.
         */


        String username, password;
        int hak = 3;
        int secim;
        int bakiye = 0;
        int tutar;

        Scanner scanner = new Scanner(System.in);


        while (hak > 0) {

            System.out.println("Kullanıcı adı: ");
            username = scanner.nextLine();
            System.out.println("Şifre :");
            password = scanner.nextLine();

            if (username.equals("tolga") && password.equals("1234")) {
                System.out.println("Giriş başarılı " + username);
                System.out.println("Atm Hoşgeldiniz. . \nYapmak istediğiniz işlemi seçin");

                do {
                    System.out.println("1 Para Yatırma\n" +
                            "2 Para Çekme\n" +
                            "3 Bakiye Sorgu\n" +
                            "4 Çıkış Yap");
                    secim = scanner.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.println("Yatırmak istediğin tutar: ");
                            tutar = scanner.nextInt();
                            if(tutar<0){
                                System.out.println("Eksi deger yazılamaz.");
                            }else{
                                bakiye += tutar;
                                System.out.println("Yatırılan Tutar:"+tutar);
                                System.out.println("Mevcut Bakiyen:"+bakiye);
                            }
                            break;

                        case 2:
                            System.out.println("Çekmek istediğin tutar: ");
                            tutar = scanner.nextInt();
                            if (tutar > bakiye) {
                                System.out.println("Bakiye Yetersiz");
                            } else {
                                bakiye -= tutar;
                                System.out.println("Çektiğin tutar:"+tutar);
                                System.out.println("Kalan Bakiye:"+bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz :"+bakiye);
                            break;
                        case 4: System.exit(0);
                        default:
                            System.out.println("Hatali Seçim Tekrar deneyin");
                            break;
                    }
                } while (secim != 4);
                System.out.println("Tekrar Bekleriz.");
                break;

            } else {
                hak--;
                System.out.println("Tekrar Deneyin..");
                if (hak == 0) {
                    System.out.println("Hakkınız bitti. ");
                    break;
                } else {
                    System.out.println("Kalan Hak" + hak);
                }
            }


        }


    }
}
