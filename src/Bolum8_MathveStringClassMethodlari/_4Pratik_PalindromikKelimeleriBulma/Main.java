package Bolum8_MathveStringClassMethodlari._4Pratik_PalindromikKelimeleriBulma;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup
        olmadığı bulan bir program yazıyoruz.

        Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa
        o kelime "Palindromik Kelime'dir".

        Örnek : abba , asa , kavak, kayak
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter word");
        String str=scan.nextLine();
        if(isPalindrom(str)){
            System.out.println(str +" is Palindrom");
        }else{
            System.out.println(str+" is Not Palindrom");
        }


    }
    public static boolean isPalindrom(String str){

        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
            return true;
    }
}
