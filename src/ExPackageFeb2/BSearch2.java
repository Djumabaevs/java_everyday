package ExPackageFeb2;

public class BSearch2 {
    private static boolean BSearch(int[]a, int value){
        int low = 0;
        int high = a.length - 1;
        while (low<=high){
            int middle = (low + high)/2;
            if (a[middle] == value) return true;
            else if (a[middle]>value)
                high = middle - 1;
            else low = middle + 1;
        }
        return false;
    }
}
