package HabrProblems;

import java.util.Collection;
import java.util.HashSet;

public class Test12 {
    // filters and returns collection without duplicates
    public static <T> Collection<T> removeDuplicates(Collection<T> collection){
        return new HashSet<>(collection);
    }
}
