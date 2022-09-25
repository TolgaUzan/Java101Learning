package Bolum3_Donguler._2DoWhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Örnek
        int year=2022;
        do{
            System.out.println(year);
            year++;
        }
        while(year<=2030);

        //ÖRnek
        Scanner scanner=new Scanner(System.in);

        int pass;
        boolean passDurum=false;
        do {
            pass= scanner.nextInt();
            if(pass==123){
                System.out.println("Şifre Doğru");
                passDurum=true;
            }else{
                System.out.println("Şifre Yanlış");

            }
        }while(!passDurum);


        //Örnek
        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }
        /*
        Do-While Döngüsü
        Do-while döngüsünün çalışma mantığı while döngüsü ile aynıdır ,
        fakat while döngüsünde parantez içerisindeki koşul sağlandığı sürece
        kod bloğu çalışacaktır. Ama Do-while döngüsünde durum false olsa bile
        döngü en az bir kere çalışacaktır. Bu tür durumlar için Do-while kullanılır.

        Java Do-While döngüsü söz dizimi şu şekildedir ;

        do {
        kodlar//
        } while (kosul);
        Gördüğünüz gibi, koşul döngünün sonunda test edilir. Bu durumda,
        koşul false olsa bile döngü en az bir kere çalıştırılmış olur.
        Bu şekilde döngü yazmak istediğiniz durumlarla karşılaşacaksınız.
        Aşağıdaki örneği inceleyelim:

        int year = 2020;
        do
        {
	    System.out.println(“Döngü işletiliyor..”);
	    year++;
        } while (year < 2020);
        Bu kod çalıştırıldığında çıktısı aşağıdaki gibi olur:

        Döngü işletiliyor..
        Gördüğünüz gibi year değişkeni 2020’den küçük olmamasına rağmen
        döngü en az bir kere çalıştırılmıştır.

        Java While ve Do-While Arasındaki Farklar ?
        Java'da Do-While ve While döngüleri arasındaki tek fark ,
        Do-while döngüsünde, döngü bloğu içindeki kod kesimi en az
        bir kez mutlaka işletilecektir. Çünkü önce döngü bloğu işletilip
        sonra koşul denetlenmektedir. While döngüsünde ise önce koşula
        bakılıp sonra döngü bloğu işletildiği için, döngüye hiç girilmemesi
        olasıdır.
         */
    }
}
