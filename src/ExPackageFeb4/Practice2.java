package ExPackageFeb4;

import java.util.Arrays;
import java.util.Random;
public class Practice2 {
}

class Pointerchasing2 {

    public static void main(String[] args) {

        // use indirect access (like unboxing, but just chasing a single array pointer) vs. Integer objects (chasing every object's pointer).
        // expect that the object-version is still slower.

        final int[] values = new int[1024];
        final int[] refs = new int[1024];
        final Integer[] objects = new Integer[values.length];

        final Random rnd = new Random(0);
        for (int t = 0; t < 1000; ++t) {
            Arrays.setAll(values, index -> rnd.nextInt());
            Arrays.setAll(refs, index -> index);
            Arrays.setAll(objects, index -> values[index]); // boxing happens here

            // measure indirect:
            long t1 = System.nanoTime();
            insertionSortPrimitiveIndirect(refs, values);
            long e1 = System.nanoTime() - t1;
            // measure objects:
            long t2 = System.nanoTime();
            insertionSortObjects(objects);
            long e2 = System.nanoTime() - t2;

            // use results, so compiler can't eliminate the loops
            System.out.println(Arrays.toString(indirectResult(refs, values)));
            System.out.println(Arrays.toString(objects));
            System.out.println("-");
            System.out.println(e1);
            System.out.println(e2);
            System.out.println("--");
        }
    }

    private static void insertionSortPrimitiveIndirect(final int[] refs, int[] values) {
        int i, keyIndex, j;
        for (i = 1; i < refs.length; i++) {
            keyIndex = refs[i];
            j = i - 1;
            while (j >= 0 && values[refs[j]] > values[keyIndex]) {
                refs[j + 1] = refs[j];
                j = j - 1;
            }
            refs[j + 1] = keyIndex;
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

    private static int[] indirectResult(final int[] refs, int[] values) {
        final int[] result = new int[1024];
        Arrays.setAll(result, index -> values[refs[index]]);
        return result;
    }

}

