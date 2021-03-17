package ChallengesTrue;

public class Searches {
    public static void main(String[] args) {

    }

    public static int binarySearch(int[] array, int x){
        int p = 0;
        int r = array.length - 1;

        while(p <= r){
            int q = (p+r)/2;
            if(x < array[q]) r = q-1;
            else if(x > array[q]) p = q+1;
            else return q;
        }
        return -1;
    }

    public static int recursiveLinearSearch(int[] array, int i, int x){
        if(array[i] > array.length) return -1;
        if(array[i] == x) return i;
        else System.out.println("recursion : ");
        return recursiveLinearSearch(array, i + 1, x);
    }

    public static int recursiveBinarySearch(int[] array, int p, int r, int x){
        if (p > r) {
            return -1;
        } else {
            int q = (p+r)/2;
            if(x == array[q]){
                return q;
            } else if (x < array[q]){
                return recursiveBinarySearch(array, p, q-1, x);
            } else {
                return recursiveBinarySearch(array, q+1, r, x);
            }
        }
    }


}
