package HabrProblems;

import java.util.*;

public class Test15 {
    public static <K,V> Map<V, Collection<K>> changePlaces(Map<?extends K,?extends V>map){
        Map<V,Collection<K>> result = new HashMap<>();
        Set<K> keys = (Set<K>) map.keySet();
        for (K key : keys){
            V value = map.get(key);
            result.compute(value,(v,s) -> {
                if(s == null){
                    s = new HashSet<>();
                }
                s.add(key);
                return s;
            });
        }
        return result;
    }
}
