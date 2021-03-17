package HabrProblems;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {

        double[] array  =generateArray(10000000);
        Arrays.sort(array);

        long time = System.currentTimeMillis();
        sortS(array,0.8);
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        binarySearch(array,0.8);
        System.out.println(System.currentTimeMillis() - time);
    }

    public static int sortS(double[] array, double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(double[] sortedArray, double key, int low, int high) {
        int middle = (high + low) / 2;
        if (high < low) return -1;
        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return binarySearch(sortedArray, key, low, middle - 1);
        } else {
            return binarySearch(sortedArray, key, middle + 1, high);
        }
    }
    public static int binarySearch(double[] sortedArray, double key){
        return binarySearch(sortedArray,key,0,sortedArray.length);
    }
    public static double[] generateArray(int length){
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }
}

