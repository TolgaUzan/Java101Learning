package Bolum2_KosulluIfadelerveKodBloklari._4ifElseBloklari;

public class Main {
    public static void main(String[] args) {
        /*
            If -Else if- Else Blokları
         */


        int a =10;
        int b =20;

        boolean esitMi= a==b;
        /*
        String str= compare ? "Eşittir" : "Eşit Değildir";
        System.out.println(str);
         */

        //İF - ELSE
        //yukarıdaki aynı yapıyı if else ile yapalım.
        if(esitMi){  //or(a==b)       //True
            System.out.println("Eşittir");
        }else{                         //False
            System.out.println("Eşit Değildir");
        }




        //İF - Else if - Else
        //3 sayidan en büyüğünü bulmak istiyorum diyelim
        a=30;
        b=40;
        int c=20;
        int enBuyuk= -1;

        if( a >= b && a>=c){
            enBuyuk= a;
        }else if(b>=a && b>=c){
            enBuyuk= b;
        }else{
            enBuyuk= c;
        }

        System.out.println("En büyük sayı :"+enBuyuk);




    }
}
