package ExPackageFeb5;

import java.util.Arrays;

public class Doing3 {
    public static void main(String[] args) {
        int[] array = {9976,5455,3332,2166,5474,3173,8573};
       radixSort(array,10,6);
        System.out.println(Arrays.toString(array));
    }
     public static void radixSort(int[] array, int radix, int width){
         for (int i = 0; i < width; i++) {
             radixSingleSort(array,i,radix);
         }
     }

    private static void radixSingleSort(int[] array, int position, int radix) {
         int numItems = array.length;
         int[] countArray = new int[radix];

         for (int value: array){
             countArray[getDigit(position, value, radix)]++;
         }
         //adjust the count array
         for(int j = 1; j < radix; j++){
             countArray[j] += countArray[j - 1];
         }
         int[] temp = new int[numItems];
         for(int tempIndex = numItems-1; tempIndex >= 0; tempIndex--){
             temp[--countArray[getDigit(position, array[tempIndex],radix )]] = array[tempIndex];

         }
        for (int i = 0; i < numItems; i++) {
            array[i] = temp[i];
        }
    }
    public static int getDigit(int position,int value, int radix){
        return value / (int) Math.pow(radix,position) % radix;
    }
}
