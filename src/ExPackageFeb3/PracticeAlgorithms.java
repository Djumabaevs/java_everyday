package ExPackageFeb3;

import java.util.Arrays;

public class PracticeAlgorithms {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (200 + 1)) - 100;
        }
        // System.out.println(Arrays.toString(array));
        long time = System.currentTimeMillis();
        BSort(array);
        System.out.println(System.currentTimeMillis() - time);
    }

    private static void BSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                swap(a,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] a, int i, int j){
        if(i == j){
            return;
        }
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}