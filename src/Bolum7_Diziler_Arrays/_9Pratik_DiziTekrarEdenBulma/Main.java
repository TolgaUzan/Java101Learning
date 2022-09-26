package Bolum7_Diziler_Arrays._9Pratik_DiziTekrarEdenBulma;

import java.util.ArrayList;
import java.util.Arrays;



public class Main {

    static boolean isFind(ArrayList<Integer> array,int value){
        for(int i: array){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /*
        Şimdi sıra sende! Bir sayı dizisindeki tekrar eden
        çift sayıları belirten bir program yaz
         */
        int[] array={3,7,3,3,2,9,10,21,33,9,1,2,1,5,6};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if((i!=j) && (array[i] == array[j])){
                    if(!isFind(list,array[j]))
                    list.add(array[i]);
                    break;
                }
            }
        }
        for(int i:list){
            System.out.println(i);
        }

    }
}
