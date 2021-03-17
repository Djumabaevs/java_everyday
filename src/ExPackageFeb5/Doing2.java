package ExPackageFeb5;

import java.util.Arrays;

public class Doing2 {
    public static void main(String[] args) {
        int[] array = {99,54,33,21,5,31,0,6};
       quickSort(array,0,7);
        System.out.println(Arrays.toString(array));

    }
    private static void quickSort(int[] array, int start, int end){
       if(start < end){
          int pp =  partition(array, start, end);
          quickSort(array,pp-1,end);
          quickSort(array,pp+1,end);
       }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end -1 ; j++) {
            if(array[j] <= pivot){
                i++;
                int iVal = array[i];
                int jVal = array[j];
                array[i] = jVal;
                array[j] = iVal;
            }

        }
        int ival = array[i + 1];
        array[end] = ival;
        array[i + 1] = pivot;
        return i+1;

    }
}
