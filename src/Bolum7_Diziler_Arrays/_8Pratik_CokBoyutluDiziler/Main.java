package Bolum7_Diziler_Arrays._8Pratik_CokBoyutluDiziler;

public class Main {
    public static void main(String[] args) {
        /*
            Ödev
        Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B"
        harfi yazan programı yazınız.

 *  *  *  *    * * * * *
 *        *        *
 *        *        *
 *  *  *  *        *
 *        *
 *        *
 *  *  *  *

         */

        String[][] t=new String[5][5];

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(i==0){
                    t[i][j]=" * ";
                }else if(j==2){
                    t[i][j]=" * ";
                }else{
                    t[i][j]="   ";
                }
            }
        }
        for (String[] row : t) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

        String[][] letter = new String[7][4];
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = "*  ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = "*  ";
                } else {
                    letter[i][j] = "    ";
                }
            }

        }
        for (String row[] : letter) {
            for (String Col : row) {
                System.out.print(Col);
            }
            System.out.println();
        }

        /*
        String[][] array = new String[6][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || i == 2) {
                    array[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    array[i][j] = " * ";
                } else {
                    array[i][j] = "   ";
                }
            }
        }

        for (String[] row : array) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
*/

    }
}
