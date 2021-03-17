package HabrProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Test10 {

    public static Object[] filter(Object[] array, Filter filter){
        int offSet = 0;
        for (int i = 0; i < array.length; i++) {
            if(!filter.apply(array[i])){
                offSet++;
            } else {
                array[i - offSet] = array[i];
            }
        }
        return Arrays.copyOf(array,array.length - offSet);
    }

    public static void main(String[] args) {
        String[] array = new String[]{"4scdbh", "dsssfcw","a",null,"4"};
        String[] newArray = (String[]) filter(array, Objects::nonNull);
        System.out.println(Arrays.toString(newArray));
    }

}
interface Filter{
    boolean apply(Object o);
}

