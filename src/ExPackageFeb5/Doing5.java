package ExPackageFeb5;

public class Doing5 {
    public static void main(String[] args) {

    }
    private static void mergeReversed(int[] array, int start, int end){
        if((end  -start) < 2){
            return;
        }
            int mid = (start + end)/2;
            mergeReversed(array, start, mid);
            mergeReversed(array, mid + 1, end);
            merge(array, start, mid, end);

    }
    private static void merge(int[] arr, int start, int mid, int end){
        if (arr[mid - 1] >= arr[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while(i < mid && j < end) {
            temp[tempIndex++] = arr[i] >= arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr,i,arr, start+tempIndex,mid-1);
        System.arraycopy(temp, 0, arr, start, tempIndex);

    }
}
