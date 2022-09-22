package _5ScannerSınıfı;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Scanner Sınıfı import ettikten sonra bu sınıfı kullanalım .

        /*
        Tipine göre bu şekilde scanner metodları ile atama yapabiliyoruz
        aldığımız değerleri

        Not olarak ; eğer bir int sayı istedikten sonra String istersek
        hata ile karşılaşıyoruz. Bunun basit çözümü Dumb code aptal kod.

         */
        Scanner scanner= new Scanner(System.in);

        System.out.println("Byte girin");
        byte b= scanner.nextByte();
        System.out.println("Double girin");
        double d= scanner.nextDouble();
        System.out.println("int girin");
        int a= scanner.nextInt();
        scanner.nextLine(); //Aptal/Dumb kod.
        System.out.println("String girin");
        String yazi= scanner.nextLine();





        System.out.println(b);
        System.out.println(d);
        System.out.println(a);
        System.out.println(yazi);
    }
}
