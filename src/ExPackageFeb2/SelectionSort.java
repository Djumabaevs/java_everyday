package ExPackageFeb2;

public class SelectionSort {
    private static void SelectionS(int[] array, int n){
        int j, min_index;
        for ( j = 0; j < n-1 ; j++) {
            min_index = findIndexOfSmallest(array,j,n);

            int temp = array[min_index];
            array[min_index] = array[j];
            array[j] = temp;
        }
    }
    private static int findIndexOfSmallest(int[]arr, int i, int n){
        int smallestAt = i;
        for (int j = 0; j < n; j++) {
            if(arr[j] < arr[smallestAt])
                smallestAt = j;
        }
        return smallestAt;
    }

}
