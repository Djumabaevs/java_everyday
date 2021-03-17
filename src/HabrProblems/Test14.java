package HabrProblems;


import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Test14 {
    public static <K> Map<K,Integer> countValues(K[] items){
        Map<K, Integer> map = new HashMap<>();
        for (K k : items){
            map.compute(k, (k1, count) -> count == null ? 1 : count + 1);
        }
        return map;
    }
}
