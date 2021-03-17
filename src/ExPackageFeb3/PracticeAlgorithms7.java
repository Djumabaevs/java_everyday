package ExPackageFeb3;

import ExPackageJan3.QuickSort;

import java.util.Arrays;
import java.util.Collections;

public class PracticeAlgorithms7 {
    public static void main(String[] args) {
        int[] array = new int[1_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (200 + 1)) - 100;
        }
        // System.out.println(Arrays.toString(array));
        long time = System.currentTimeMillis();
       QuickSort(array,0,1_000_000);
        System.out.println(System.currentTimeMillis() - time);

        long time2 = System.currentTimeMillis();
        Arrays.sort(array);
        System.out.println(System.currentTimeMillis() - time2);
    }
    public static void QuickSort(int[] array, int start,int end){
        if ((end - start) < 2){
            return;
        }
        int pivotIndex = partition(array, start, end);
        QuickSort(array, start, pivotIndex);
        QuickSort(array, pivotIndex + 1, end);
    }
    public static int partition(int[] array, int start, int end){
        int pivot = array[start];
        int i = start;
        int j = end;

        while(i < j) {
            // empty loop body
            while (i < j && array[--j] >= pivot) ;
            if (i < j) {
                array[i] = array[j];
            }
            while (i < j && array[++i] <= pivot) ;
            if (i < j) {
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }

}
