package Bolum9_MayinTarlasiOyunu;


import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

        /*
        Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
        Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
        Diziye ait eleman sayısının çeyreği (elemanSayisi / 4)
        kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda
        ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı
        ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır.
        (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
        Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır
        ve sütun değerlerini girmeli.
        Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol
        edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
        Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
        Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı
        (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz,
        sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının
        toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok
        ise "0" değeri atanmalı.
        Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
        */

    Random random=new Random();
    Scanner scanner=new Scanner(System.in);
    int row,column;
    int[][] gameMap;
    int[][] mineMap;
    boolean game= true;


    public MineSweeper(int row,int column){
        this.row=row;
        this.column=column;
        gameMap =new int[row][column];
        mineMap =new int[row][column];
    }


    public void run(){
        int succ=0;
        mineMaps();

        System.out.println("MayınTarlasına Hoşgeldin!");

        while(true){
            print(gameMap);

            System.out.println("Sütun Girin:");
            int rowN= scanner.nextInt();
            System.out.println("Satir Girin:");
            int columnN=scanner.nextInt();


            if (rowN < 0 || rowN >= row) {
                System.out.println("Girilen sayi geçersiz.!");
                continue;
            }
            if (columnN < 0 || columnN >= column) {
                System.out.println("Girilen sayi geçersiz.!");
                continue;
            }

            if (mineMap[rowN][columnN] != -1) {
                checkMines(rowN,columnN);
                succ++;
                if (succ== (row * column) - (row * column/4)) {
                    System.out.println("Kazandınız!");
                    print(mineMap);
                    break;
                }
            } else {
                game=false;
                System.out.println("Game Over!");
                System.out.println("Mayına Bastınız!:  \n");
                print(mineMap);
                System.out.println("---------------------------");
                break;
            }
        }
    }
    public void checkMines(int r,int c){
        if (mineMap[r][c]==0) {
            if (c< column-1 && mineMap[r][c+1]==-1) {//
                gameMap[r][c]++;
            }
            if (r>0 && c< column-1 && mineMap[r-1][c+1]==-1) {
                gameMap[r][c]++;
            }
            if (r>0 && mineMap[r-1][c]==-1) { //
                gameMap[r][c]++;
            }
            if (r>0 && c>0  && mineMap[r-1][c-1]==-1) {
                gameMap[r][c]++;
            }
            if (c>0 && mineMap[r][c-1]==-1) { //
                gameMap[r][c]++;
            }
            if (c>0 && r< row-1 &&mineMap[r+1][c-1]==-1) {
                gameMap[r][c]++;
            }
            if (r< row-1 && mineMap[r+1][c]==-1) { //
                gameMap[r][c]++;
            }
            if (c< column-1 && r< row-1 && mineMap[r+1][c+1]==-1) {
                gameMap[r][c]++;
            }
        }

    }


    public void mineMaps(){
        int randomRow,randomColumn,count=0;
        while(count!=(row*column)/4){
            randomRow= random.nextInt(row);
            randomColumn=random.nextInt(column);
            if(mineMap[randomRow][randomColumn]!=-1){
                mineMap[randomRow][randomColumn]=-1;
                count++;
            }
        }
    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }














}


