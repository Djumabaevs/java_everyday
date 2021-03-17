package ExPackageFeb4;

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {
    int[] array = {9,8,4,6,3,121,1};
    insertS(array);
        System.out.println(Arrays.toString(array));
    }
    private static int[] insertS(int[]array){
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i-1;

            while(j>=0 && array[j]>element){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = element;
        }
        return array;
    }
}
