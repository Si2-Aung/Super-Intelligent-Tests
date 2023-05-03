package Sorting;

import java.sql.Array;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }
        mergeSort(numbers,0,numbers.length-1);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void mergeSort (int[] Array, int lI, int rI){
        // Bei ersten Aufruf ist lI = 0 und rI = Array.lenth -1   BSP. [0,9]
        if(lI < rI) {
            int midIndex =  (lI+rI) / 2;        //Index in der Mitte links BSP. 4
            mergeSort(Array,lI,midIndex);     //Nochmal aufrufen aber mitte = rechts BSP.[0,4]
            mergeSort(Array,midIndex+1,rI); //Nochmal aufrufen aber mitte+1 = links BSP.[5,9]
            merge(Array,lI,midIndex,rI);      // Alles mergen
        }




    }
    public static void merge (int[] Array,int l,int m,int r){
        // l <= m <= r
        int pl = l;
        int pr = m+1;
        int [] B = new int[r-1+1];

        for (int i = 0; i < r-1; i++) {
            if(pr > r || (pl <= m && Array[pl] <= Array[pr]) ){
                B[i] = Array[pl];
                pl=pl+1;
            }
            else
                B[i] = Array[pr];
                pr = pr+1;
        }
        for (int i = 0; i <r-1; i++) {
            Array[i+l] = B[i];
        }





    }
}
