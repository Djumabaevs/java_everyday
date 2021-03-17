package ExPackageFeb2;

import java.util.Arrays;

public class InsertionSort {
    private static void InsertionS(int[]array, int n){
        int i, j ,key;
        for(i = 1; i < n; i++){
            key = array[i];
            j = i - 1;

            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {3,9,0,5,6,7,8,1,1,2};
        InsertionS(array,10);
        System.out.println(Arrays.toString(array));
    }
}
