package ExPackageJan3;

public class MergedSorting {
    private static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        int i, j, k;
        for(i = 0; i < n1; i++)
            L[i] = arr[l+i];
        for(j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        i = 0;
        j = 0;
        k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k++] = L[i];
                i++;
            } else {
                arr[k++] = R[j];
                j++;
            }
        }
        while(i < n1){
            arr[k++] = L[i++];
        }
        while(j < n2){
            arr[k++] = R[j++];
        }
    }
    private static void mergeSort(int[] arr, int l, int r){
        if(r > 1){
            int m = (l + r)/2;
            mergeSort(arr, l, r);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{45,76,4,2,0,987,567,222};
        mergeSort(array,0, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
