package ExPackageFeb2;

public class BSearch {
    public static void main(String[] args) {

    }
    private static int BSearch(int[]a, int left, int right, int x){
        if(left <= right){
            int middle = (left + right)/2;
            if(a[middle] == x)
                return middle;
            else if(a[middle]>x)
                return BSearch(a,left,middle-1,x);
            else return BSearch(a,middle+1,right,x);
        }
        return -1;
    }
}
