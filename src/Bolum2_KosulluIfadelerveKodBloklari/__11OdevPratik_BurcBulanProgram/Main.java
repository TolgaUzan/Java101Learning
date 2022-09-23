package Bolum2_KosulluIfadelerveKodBloklari.__11OdevPratik_BurcBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
        Ödev
        Aynı örneği switch-case kullanmadan yapınız.
         */

        int ay, gun;
        boolean isError = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğduğunuz ay sayi ile yazın:");
        ay = scanner.nextInt();
        System.out.print("Doğduğunuz gün :");
        gun = scanner.nextInt();

        if (ay == 1) { //Ocak
            if (gun > 0 && gun < 32) {
                if (gun <= 21) {
                    System.out.println("Oğlak Burcusunuz");
                } else {
                    System.out.println("Kova Burcusunuz");
                }
            } else {
                isError = true;
            }
        }else if (ay == 2) { //Subat
            if (gun > 0 && gun < 29) {
                if (gun <= 19) {
                    System.out.println("Kova Burcusunuz");
                } else {
                    System.out.println("Balık Burcusunuz");
                }
            } else {
                isError = true;
            }
        }else if (ay == 3) { //mart
            if (gun > 0 && gun < 32) {
                if (gun <= 20) {
                    System.out.println("Balık Burcusunuz");
                } else {
                    System.out.println("Koç Burcusunuz");
                }
            } else {
                isError = true;
            }
        }else if (ay == 4) {//Nisan
            if (gun > 0 && gun < 31) {
                if (gun <= 20) {
                    System.out.println("Koç Burcusunuz");
                } else {
                    System.out.println("Boğa Burcusunuz");
                }
            } else {
                isError = true;
            }
        }else if (ay == 5) { //Mayıs
            if (gun > 0 && gun < 32) {
                if (gun <= 21) {
                    System.out.println("Boğa Burcusunuz");
                } else {
                    System.out.println("İkizler Burcusunuz");
                }
            } else {
                isError = true;
            }
        }else if (ay == 6) {//Haziran
            if (gun > 0 && gun < 31) {
                if (gun <= 22) {
                    System.out.println("İkizler Burcusunuz");
                } else {
                    System.out.println("Yengeç Burcusunuz");
                }
            } else {
                isError = true;
            }
        }else if (ay == 7) {//Temmuz
            if (gun > 0 && gun < 32) {
                if (gun <= 22) {
                    System.out.println("Yengeç Burcusunuz");
                } else {
                    System.out.println("Aslan Burcusunuz");
                }
            } else {
                isError = true;
            }
        }else if (ay == 8) {//Ağustos
            if (gun > 0 && gun < 32) {
                if (gun <= 22) {
                    System.out.println("Aslan Burcusunuz");
                } else {
                    System.out.println("Başak Burcusunuz");
                }
            } else {
                isError = true;
            }
        }else if (ay == 9) {//Eylül
            if (gun > 0 && gun < 31) {
                if (gun <= 22) {
                    System.out.println("Başak Burcusunuz");
                } else {
                    System.out.println("Terazi Burcusunuz");
                }
            } else {
                isError = true;
            }
        }else if (ay == 10) {//Ekim
            if (gun > 0 && gun < 32) {
                if (gun <= 22) {
                    System.out.println("Terazi Burcusunuz");
                } else {
                    System.out.println("Akrep Burcusunuz");
                }
            } else {
                isError = true;
            }
        }else if (ay == 11) {//Kasım
            if (gun > 0 && gun < 31) {
                if (gun <= 21) {
                    System.out.println("Akrep Burcusunuz");
                } else {
                    System.out.println("Yay Burcusunuz");
                }
            } else {
                isError = true;
            }
        }else if (ay == 12) { //Aralık
            if (gun > 0 && gun < 32) {
                if (gun <= 21) {
                    System.out.println("Yay Burcusunuz");
                } else {
                    System.out.println("Oğlak Burcusunuz");
                }
            } else {
                isError = true;
            }
        }else{
            System.out.println("Geçersiz ay girdiniz.");
        }


        if(isError){
            System.out.println("Hatalı gün girdiniz.");
        }





    }
}
