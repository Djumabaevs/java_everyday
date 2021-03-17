package ExPackageJan3;

public class BubbleSort {
    private static void  BubbleSort(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{12,6,8,543,0,-5,4};
        BubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
