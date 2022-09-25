package Bolum4_Methodlar._5Recursive_Ozyineli_Methodlar;


public class Main {
    static int f(int x){
        int result =0;
        for(int i=1;i<x;i++){
            result+=i;
        }
        return result;
    }

    static int r(int n){
        System.out.println(n);
        if(n==1){
            return 1;
        }
        return  r(n-1)+n;
    }
    public static void main(String[] args) {


        //Recursive (Özyineli) Methodlar.Kendini tekrar eden methodlar
        //not :eğer bir koşul belirlemezsek sonsuz döngüye girebilir.
        System.out.println(f(2));
        System.out.println(r(10));











        /*
        Recursive (Özyineli) Metotlar
        Java'da Recursive Metotlar, bir metodun kendisini çağırma tekniğidir. Bu teknik karmaşık problemleri ,çözmesi daha kolay problemlere ayırmayı sağlar. İki sayıyı birbirine eklemek kolaydır, ancak bir dizi sayıyı birbirine eklemek daha karmaşıktır. Recursive metotlar sürekli kendilerini çağırdıkları için dikkat edilmesi gereken durum en son aşama için koşul koyulmasıdır .Aşağıdaki örnekte recursive ile bir dizi sayıyı , iki sayı ekleme basit görevine bölerek toplamak için kullanılır:

        public class Main {
         public static void main(String[] args) {
          int sonuc = toplam(10);
          System.out.println(sonuc );
         }
         public static int toplam(int k) {
          if (k > 0) {
            return k + toplam(k - 1);
          } else {
             return 0;
           }
         }
        }
        toplam() metodu çağrıldığında, k'dan küçük tüm sayıların toplamına k parametresini ekler ve sonucu döndürür. K değişkeni 0 olduğunda, metot sadece 0 döndürür. Metot çalışırken, program şu adımları izler:

        f(1) = 1;
        f(2) = f(1) + 2;
        f(3) = f(2) + 3;
        f(4) = f(3) + 4;
        ..........

        ..........

        f(n) = f(n-1) + n;
               */



    }
}
