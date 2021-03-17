package HabrProblems;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;

public class Test10_2 {
    public static <T> T[] filter(T[] array, Function<?super T, Boolean> filter){
        int offSet  =0;
        for (int i = 0; i < array.length; i++) {
            if(!filter.apply(array[i])){
                offSet++;
            } else {
                array[i - offSet] = array[i];
            }
        }
        return Arrays.copyOf(array,array.length-offSet);
    }

    public static void main(String[] args) {
        String[] array = new String[]{"adec", "b76r","54",null,"0"};
        String[] newArray = filter(array, Objects::nonNull);
        System.out.println(Arrays.toString(newArray));
    }
}
