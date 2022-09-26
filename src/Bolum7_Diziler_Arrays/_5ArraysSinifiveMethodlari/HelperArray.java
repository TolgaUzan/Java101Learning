package Bolum7_Diziler_Arrays._5ArraysSinifiveMethodlari;

public class HelperArray {
    public void printArray(int[] array){
        System.out.print("[");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("]");
    }
    public void printArray(String[] array){
        System.out.print("[");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("]");
    }

    public  void fill(int[] array,int value){

        for(int i=0;i<array.length;i++){
            array[i] = value;
        }
    }
}
