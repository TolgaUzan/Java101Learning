package Bolum8_MathveStringClassMethodlari._2StringSinifiveMethodlari;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        String Sınıfı ve Metotları
        Java'da String sınıfları char türünden verilerden oluşmuş
        bir kümedir yani karakterlerden oluşur. Java işlerimizi
        kolaylaştırmak ve String ifadelerle işlem yapmak için String sınıfını sunar.

         */

        String str="Tolga Uzan";
        String ornek="Mehmet";
        String a=" mehmet! mehmet ?mehmet ,mehmet .mehmet ";

        String[] array= a.split(" ");//bir dizeyi alt String[] sine böler.
        for(String s:array){
            System.out.println(s);
        }
        char[] orj=new char[5];
        str.getChars(0,5,orj,0);//Karakterleri bir dizeden bir char[] kopyalar.
        for(char c:orj){
            System.out.println(c);
        }
        System.out.println(String.format("%s",str));//Belirli formatta yazmak için
        byte[] x= str.getBytes();//bir byte[] sine kodlar.Sonucu yeni bir byte[]dizisinde saklar.
        for(byte b:x){
            System.out.println(b);
        }
        System.out.println();
        System.out.println(Arrays.toString(array));//bir dizeyi bir alt dizeye böler.
        System.out.println(str.charAt(0)); //0.indexini aldım
        System.out.println(str.codePointAt(0));//indexin Unicodeunu verir.
        System.out.println(str.codePointBefore(1));//indexin bi önceki index Unicode
        System.out.println(str.compareTo(ornek));//2 dize sözlümbilimsel olarak karşılaştırır.eşitse 0 döner
        System.out.println(str.compareToIgnoreCase(ornek));//büyükküçük harf duyarsız üstteki işlemi yapar.
        System.out.println(str.concat(ornek));//bir stringe ekleme yaparız.

        System.out.println(str.contains("ol"));//bir String bir dizikarakter içerip içermediğini kontrol eder.T/F
        System.out.println(str.endsWith("ga"));//belirtilen krakterlerle bitirp bitmediğini döner T/F
        System.out.println(str.equals(ornek));//karşılaştırma T/F
        System.out.println(str.indexOf(0)); //index döner yoksa -1 döner
        System.out.println(str.indexOf('a'));//index döner varsa indexi döner baştan bakar
        System.out.println(str.isEmpty());//Boşsa True doluysa False null
        System.out.println(str.lastIndexOf('a'));//sondan bakar indexi verir.
        System.out.println(str.length());//Uzunlugunu verir.
        System.out.println(str.matches(str));//Normal bir ifadeye karşı bir eşleşme için bir dize arar ve eşleşme döndürr.
        System.out.println(a.replace('e',' '));//replace değiştir
        System.out.println(a.replaceFirst(" ","e"));//İlk bulduğunu değişir.
        System.out.println(a.replaceAll("[?,.!]"," "));//Çoklu verebiliyoruz.
        System.out.println(a.startsWith("M"));//M ile başlıyorsa true yada false döner
        System.out.println(a.substring(1)); //stringi parçalamaya yarıyor.
        System.out.println(a.substring(0,6)); //stringi parçalamaya yarıyor.
        System.out.println(a.toUpperCase());//karakterleri Büyütür.
        System.out.println(a.toLowerCase());//karakterleri küçültür..
        System.out.println(a.toString());//bir String nesnesinin değerini verir.
        System.out.println(a.trim());//cümlenin baştan ve sonran boşlukları kaldırır.
        System.out.println(a.valueOf(3.14));//String olarak yazar değeri
        char[] dizem=a.toCharArray();
        System.out.println(a.toCharArray());//bir dizeyi yeni bir karakter dizesine döndürür.
        for(char c:dizem){
            System.out.println(c);
        }





    }
}
