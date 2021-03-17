package ExPackageFeb4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Practice3{
    public static void main(String[] args) {

    }
    public void test() {
        Integer[] a = randomData(10_000_000);

        ArrayList<Integer> integerList = new ArrayList<>();
        for (Integer i : a) {
            integerList.add(i);
        }

        long t0, t1;
        //Sort by ArrayList
        t0 = System.currentTimeMillis();
        integerList.sort(((p1, p2) -> (Integer.compare(p1, p2.intValue()))));
        t1 = System.currentTimeMillis();
        System.out.println("ArrayList duration:" + (t1 - t0));


        //Sort by Arrays
        Integer[] integerArray = Arrays.copyOf(a, a.length);
        t0 = System.currentTimeMillis();
        Arrays.sort(integerArray, ((p1, p2) -> (Integer.compare(p1, p2.intValue()))));
        t1 = System.currentTimeMillis();
        System.out.println("Arrays duration:" + (t1 - t0));

    }

    Random r = new Random(System.currentTimeMillis());

    private Integer[] randomData(int n) {
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt();
        }
        return a;
    }
}
