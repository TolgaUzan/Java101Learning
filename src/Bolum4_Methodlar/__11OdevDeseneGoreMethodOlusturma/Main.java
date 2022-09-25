package Bolum4_Methodlar.__11OdevDeseneGoreMethodOlusturma;

import java.util.Scanner;

public class Main {
    public static void desen(int number,int gecicinumber,int x){

        if(gecicinumber>=1 && x==0){
            gecicinumber-=5;
            System.out.println(gecicinumber+" ");
            if(gecicinumber<=0){
                desen(number,gecicinumber,1);
            }
            desen(number,gecicinumber,0);
        }
        else if(gecicinumber<=number && x==1){
            gecicinumber+=5;
            if(gecicinumber>number){
                return;
            }
            System.out.println(gecicinumber+" ");
            desen(number,gecicinumber,1);
        }
    }
    public static void main(String[] args) {
        /*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki
        kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

        Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen
        sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana
        son değeri yazdırın. Sayı negatif veya 0 olduktan sonra
        tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini
        ekrana yazdırın.

        Senaryolar
        N Sayısı : 16
        Çıktısı : 16 11 6 1 -4 1 6 11 16


        N Sayısı : 10
        Çıktısı : 10 5 0 5 10


        N Sayısı : 25
        Çıktısı : 25 20 15 10 5 0 5 10 15 20 25


        N Sayısı : 5
        Çıktısı : 5 0 5

         */
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter Number  :");
        number=scanner.nextInt();
        desen(number,number,0);




    }


}
