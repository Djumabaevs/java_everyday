package HabrProblems;

import java.util.Arrays;
import java.util.function.Function;

public class Test11 {
    public static void main(String[] args) {
        Integer[] squares = new Integer[100];
        fill(squares,integer -> integer*integer);
    }
    public static <T> void fill(T[] objects, Function<Integer,?extends T> function){
        for (int i = 0; i < objects.length; i++) {
            objects[i]  = function.apply(i);
        }
        System.out.println(Arrays.toString(objects));
    }
}
