package ExPackageJan3;

public class CountingSort {
    private static int range;
    private static int[] countingSort(int[] array){
        int[] values = new int[range+1];
        for (int i = 0; i < range; i++) {
            values[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            values[array[i]]++;
        }
        int[] arr = new int[array.length];
        int b = 0;
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < values[i]; j++) {
                arr[b++] = i;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        range = 9;
        int[] a = new int[]{4,7,9,3,0,2,5,1,5};
        a = countingSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
