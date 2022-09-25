package Bolum7_Diziler_Arrays._3CokBoyutluDiziler;

public class Main {
    public static void main(String[] args) {


        int[][] matris=new int[2][3];
        matris[0][0] = 0;
        matris[0][1] = 01;
        matris[0][2] = 02;

        System.out.println(matris[0][1]);

        int[][] matris2={                           //column
                {0, 453, 939, 243, 783, 891},//row
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        System.out.println(matris2[5][5]);

        int[][] matris3= new int[3][4];
        int number=1;
        for(int i=0;i<matris3.length;i++){
            for(int j=0;j<matris3[i].length;j++){
                matris3[i][j] = number++;
            }
        }
        for (int row = 0; row < matris3.length; row++) {
            for (int column = 0; column < matris3[row].length; column++) {
                System.out.print(matris3[row][column] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < matris2.length; row++) {
            for (int column = 0; column < matris2[row].length; column++) {
                System.out.print(matris2[row][column] + " ");
            }
            System.out.println();
        }


        /*
        Çok Boyutlu Diziler
        Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve
        matris olarak adlandırılırlar. Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar.
        Matrisler satır ve sütun şeklinde tablo verisi formatındaki verileri tutmak için kullanılır.
        Diziler liste halinde veriler için uygunken, matrisler tablo şeklindeki veriler
        için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek satır ve
        sütun sayısını girmemiz yeterli olacaktır.

        İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
        Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı
        matriste tutamayız.

        3x3 boyutunda bir matris örneği :
        int[][] uzaklik ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        ki Boyutlu Dizi Tanımlama Yöntemleri
        İki boyutlu dizileri oluşturmanın farklı yöntemleri var şimdi bunlara bakalım.

        Bir değişkenin dizi olduğunu köşeli parantezler ile belirtmiştik.
        Bir tane köşeli parantez tek boyutlu dizi belirtir. Eğer çok boyutlu dizi
        oluşturmak istiyorsak, boyut sayısı kadar köşeli parantez belirtmeliyiz.
        Örneğin aşağıdaki satır 2 boyutlu bir dizi (yani matris) belirtir:

        egiskenTipi[][] arrayIsmi;
        int matrix[][];
        İki boyutlu dizimizi tanımlarken değerlerini atamak istersek aşağıdaki yöntemi
        kullanabiliriz.

        int[][] array = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {10, 11, 12}
        };
        lk köşeli parantez birinci boyutu (satırları),
        diğeri ise ikinci boyutu (sütunları) belirtir. Aşağıdaki kodu çalıştırırsak,
        3 satırlı ve 4 sütunlu bir matris oluşturur:

        int matrix[][] = new int[3][4];
        uşturulan matrix değişkeninin default değeri (a) ile gösterilen tablodaki gibidir.

            [0][1][2][3]
            [0] 0  0  0
            [1] 0  0  0
            [2] 0  0  0

                (a)
         Bu matrisin bütün elemanlarına ulaşmak için kullanmamız gereken indeks numaralarını
         aşağıdaki tabloda görebilirsiniz:
         matrix[1][2]; // Matrisin 2. satır ve 3. sütunundaki elemana erişiliyor
         matrix[0][3]; // Matrisin 1. satır ve 4. sütunundaki elemana erişiliyor
         matrix[2][0]; // Matrisin 3. satır ve 1. sütunundaki elemana erişiliyor
         Matrisin 2. satırı ve 3. sütununda yer alan değerini 7 yapalım.
         matrix[2][1] = 7;

         İç İçe Döngülerle Dizilere Erişim ve Dizi İşlemleri

        Aşağıdaki kod bize bi matris değerini ekrana nasıl yazdıracağımızı gösterir.
        Döngüye girdikten sonra her sütun sayısı her satır için tek tek ekrana bastırılır.
        Her bir satırın tamamlanmasından sonra System.out.println() ile bir alt satıra geçilir.
        for (int row = 0; row < matrix.length; row++) {
        for (int column = 0; column < matrix[row].length; column++) {
              System.out.print(matrix[row][column] + " ");
        }
          System.out.println();
        }

        ki Boyutlu Dizilerin Uzunlukları
        İki boyutlu diziler aslında her satırının tek boyutlu olduğu dizilerdir.
        Çok boyutlu dizilerinde boyutuna ulaşarak işlem yapabiliriz.

        Örneğin x = new int[3] [][][4] arrayinin x[0], x[1], x[2] değerleri tek boyutlu dizidir.
        Ve her biri aşağıdaki şekilde gösterildiği gibi 4 elemanı vardır. x.length değeri 3'tür,
        yani bize sahip olduğu 3 satırın değerini verir. Sütun sayısına ise
        her hangi bir satır değerinin uzunluğu kadardır. x[2].length değeri 4'tür.


         */
    }
    public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {

        // firstMatrix.length ile ilk matrisin satır sayısını buluyoruz. örneğimizde 3 olarak gelecektir.
        // secondMatrix[0].length ile ikinci matrisin sütun sayısını buluyoruz. örneğimizde 4 olarak gelecektir.

        // C matrisi olacak olan matrisi tanımlıyoruz.
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];

        // matrislerde çarpma, toplama gibi işlemleri yapabilmek için iç içe 3 tane döngüye ihtiyaç duyarız.
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
            }
        }

        return result;
    }


    double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
        // A matrisinin satırı ile B matrisinin sütunu çarpma işlemi.
        /*
         *   row = 3, col = 4  olarak gelecektir.
         *   i = 0 ise
         *   firstMatrix[3][0] * secondMatrix[0][4]
         *   i = 1 ise
         *   firstMatrix[3][1] * secondMatrix[1][4]
         *   i = 2 ise
         *   firstMatrix[3][2] * secondMatrix[2][4]
         * şeklinde i değişerek satır ve sütun çarpılır.
         */
        double cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }
    /*
    Sütun Kapasiteleri Farklı Matris Oluşturmak - Düzensiz Diziler
Farklı sütun değerine sahip dizilere "Ragged Arrays" yani düzensiz diziler denir. Başka bir açıdan bakıldığında ise, 2 boyutlu dizileri, dizilerin dizisi (array of arrays) olarak düşünmek doğru olur. Yani iki boyutlu dizileri tek boyutlu diziler oluşturur.

Diziler aynı türden elemanlardan oluşmak zorundadır. int türünde bir dizi olabileceği gibi, dizinin dizisi de olabilir.

Yukarıdaki örneklerde matrisin sütun sayısını 4 olarak belirledik. Bu şekilde oluşturulursa matrisin bütün satırları 4 elemanlı olur. Fakat bu zorunlu değildir. Matris oluştururken sütun sayısı belirlemezsek, her bir satırdaki dizilerin kapasitesi farklı olabilir. Örneğin aşağıdaki kodu inceleyelim:

int[][] matrix = new int[3][];
matrix[0] = new int[1];
matrix[1] = new int[2];
matrix[2] = new int[3];
Burada önce 3 satırdan oluşan bir matris belirttik, fakat sabit bir sütun sayısı vermedik. Sonra her bir satır için ayrı ayrı sütun sayısı belirledik.

Çok boyutlu dizi oluştururken, yalnızca ilk boyutun (en soldaki) kapasitesini belirlemeniz yeterlidir. Diğer boyutların kapasitesini dinamik olarak belirleyebilirsiniz.

Sıra Sizde!
Aşağıda verilen örneklerin cevaplarına bakmadan önce kendiniz kodlamaya çalışmanızı öneririz. Daha sonra zorlandığınız noktalarda ufak yardımlar almak için bakabilirsiniz. Bu sizin öğrenmenize daha yardımcı olacaktır.

Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.

Cevap:

int matrix[][] = new int[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and "
                + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.

Cevap:

int[][] matrix = new int[3][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
Aşağıdaki kod bloğunun çıktısı nedir?

  int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
Cevap:

6 5
4 3
2 1
     */
}
