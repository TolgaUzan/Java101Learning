package Bolum2_KosulluIfadelerveKodBloklari._7OdevPratik_KullaniciGirisi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ödev
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını
        sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı
        girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre
        giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */

        String user = "tolga";
        String pass = "123";
        String newpass;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı girişi\n");
        while (true) {
            System.out.println("Username : ");
            String userInput = scanner.nextLine();
            System.out.println("Password : ");
            String passInput = scanner.nextLine();

            if (user.equals(userInput)) {
                if (pass.equals(passInput) ) {
                    System.out.println("Giriş Başarılı");
                    System.out.println("Çıkış için q");
                    String cikis=scanner.nextLine();
                    if(cikis.equals("q")){
                        System.out.println("See ya ! ");
                        break;
                    }

                } else {
                    System.out.println("Hatalı Şifre");
                    System.out.println("Şifre sıfırlamak ister misin ? E/H");
                    String girdi = scanner.nextLine();
                    if (girdi.equals("E")) {
                        System.out.println("Yeni Şifreyi yazin");
                         newpass = scanner.nextLine();
                         pass=newpass;
                    } else if (girdi.equals("H")) {
                        System.out.println("Çıkış yapılıyor.");
                        break;
                    } else {
                        System.out.println("Hatalı tuşlama ");

                    }
                }
            } else {
                System.out.println("Kullanıcı adı Hatalı");
            }

        }
    }

}



