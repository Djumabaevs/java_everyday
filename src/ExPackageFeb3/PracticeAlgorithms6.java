package ExPackageFeb3;

import java.util.Arrays;

public class PracticeAlgorithms6 {
    public static void main(String[] args) {
        int[] array = new int[90_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (200 + 1)) - 100;
        }
        // System.out.println(Arrays.toString(array));

        long time = System.currentTimeMillis();
        MergeSort(array,0, 90_000_000);
        System.out.println(System.currentTimeMillis() - time);

        long time2 = System.currentTimeMillis();
        Arrays.sort(array);
        System.out.println(System.currentTimeMillis() - time2);


    }
    public static void MergeSort(int[]array, int start, int end){
        if ((end - start) < 2){
            return;
        }
        int mid = (start + end)/2;
        MergeSort(array,start,mid);
        MergeSort(array,mid,end);
        Merge(array,start,mid,end);
    }
    public static void Merge(int[] array, int start, int mid, int end){
        if(array[mid - 1] <= array[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end){
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        System.arraycopy(array,i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
