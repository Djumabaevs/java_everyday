package ExPackageFeb4;

import java.util.*;
import java.util.stream.*;
public class Practice4{

}
class TestingSorts {
    public static void main(String[] args) {
        long t0 = 0L;
        long t1 = 0L;
        // Run this procedure 10 times
        for (int i = 1; i < 11; i++) {
            // Create an int array and Integer List filled with random numbers
            int [] intArray = IntStream.generate(() -> new Random().nextInt())
                    .limit(300_000)
                    .toArray();
            Integer [] integerArray = IntStream.generate(() -> new Random().nextInt())
                    .limit(300_000)
                    .boxed()
                    .toArray(n -> new Integer[n]);
            Integer [] integerArrayP = IntStream.generate(() -> new Random().nextInt())
                    .limit(300_000)
                    .boxed()
                    .toArray(n -> new Integer[n]);
            List<Integer> intList = IntStream.generate(() -> new Random().nextInt())
                    .limit(300_000)
                    .boxed()
                    .collect(Collectors.toCollection(ArrayList::new));
            // Sort the List and the arrays
            t0 = System.currentTimeMillis();
            intList.sort(null);
            t1 = System.currentTimeMillis();
            System.out.println(i + ") ArrayList<Integer> sort duration: " + (t1 - t0));
            t0 = System.currentTimeMillis();
            Arrays.sort(integerArray, Comparator.naturalOrder());
            t1 = System.currentTimeMillis();
            System.out.println(i + ") Integer[ ] sort duration: " + (t1 - t0));
            t0 = System.currentTimeMillis();
            Arrays.parallelSort(integerArrayP, Comparator.naturalOrder());
            t1 = System.currentTimeMillis();
            System.out.println(i + ") Integer[ ] PARALLEL sort duration: " + (t1 - t0));
            t0 = System.currentTimeMillis();
            Arrays.sort(intArray);
            t1 = System.currentTimeMillis();
            System.out.println(i + ") int[ ] sort duration: " + (t1 - t0));
        }
    }
}
