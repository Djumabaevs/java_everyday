package ExPackageJan3;

public class QuickSort {
    private static int trip(int[] arr, int left, int right){
        int point = arr[(left + right) / 2];
        while(left <= right){
            while(arr[left] < point) left++;
            while(arr[right] > point) right--;
            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
    private static void quickSort(int[] arr, int left, int right){
        int index = trip(arr, left, right);
        if(left < index-1)
            quickSort(arr,left,index-1);
        if(index < right)
            quickSort(arr,index,right);
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,5,1,876,54,29,0,76,0,31};
        quickSort(array,0, array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
