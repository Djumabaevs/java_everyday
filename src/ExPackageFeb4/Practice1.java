package ExPackageFeb4;

import java.util.Arrays;
import java.util.Random;
public class Practice1{

}

class Pointerchasing1 {

    public static void main(String[] args) {

        //use the exact same algorithm implementation (insertionSort), to show that slowness is not caused by timsort vs quicksort.
        //expect that the object-version is slower.

        final int[] direct = new int[1024];
        final Integer[] refs = new Integer[direct.length];

        final Random rnd = new Random(0);
        for (int t = 0; t < 1000; ++t) {
            Arrays.setAll(direct, index -> rnd.nextInt());
            Arrays.setAll(refs, index -> direct[index]); // boxing happens here

            //measure direct:
            long t1 = System.nanoTime();
            insertionSortPrimitive(direct);
            long e1 = System.nanoTime()-t1;
            //measure refs:
            long t2 = System.nanoTime();
            insertionSortObjects(refs);
            long e2 = System.nanoTime()-t2;

            // use results, so compiler can't eliminate the loops
            System.out.println(Arrays.toString(direct));
            System.out.println(Arrays.toString(refs));
            System.out.println("-");
            System.out.println(e1);
            System.out.println(e2);
            System.out.println("--");
        }
    }

    private static void insertionSortPrimitive(final int[] arr) {
        int i, key, j;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    private static void insertionSortObjects(final Integer[] arr) {
        int i, key, j;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}