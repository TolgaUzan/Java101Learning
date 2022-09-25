package Bolum4_Methodlar._6Pratik_PalindromSayilar;

public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber = 0;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(101));





        /*
        Java ile bir sayının "Palindrom Sayı" olup olmadığını
         bulan bir program yapıyoruz.

        Palindrom Sayı Nedir ?
        Palindromik sayı, iki taraftan okunduğu zaman okunuş
        yönüyle aynı olan sayılardır.

        Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
         */
        //7*10=70= +4= 74
        //74*10=740 + 2 = 742


    }
}

