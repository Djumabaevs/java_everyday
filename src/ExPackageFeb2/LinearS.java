package ExPackageFeb2;

public class LinearS {
    private static int LSearch(int[]a, int key){
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if(a[i] == key)
                return i;
        }
        return -1;
    }
}
