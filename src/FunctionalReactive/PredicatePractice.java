package FunctionalReactive;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Talka");
        list.add("Bakyt");

        Predicate<String> predicate = s -> !s.isEmpty();

        List<String> newList = filterList(list,predicate);
        System.out.println(newList);

        Predicate<String> filter = s -> s.contains("Talka");

        List<Integer> inList = List.of(2,4,2,7,8);
        Predicate<Integer> integerFilter = e -> e % 2 == 0;
        List<Integer> filterList = filteredList(inList, integerFilter);
        System.out.println(filterList);

    }

    private static List<String> filterList(List<String> list, Predicate<String> predicate) {
        List<String> newList = new ArrayList<>();
        for(String string : list) {
            if(predicate.test(string)) {
                newList.add(string);
            }
        }
        return newList;
    }
    private static <T> List<T> filteredList(List<T> list, Predicate<T> predicate){
        List<T> newList = new ArrayList<>();
        for(T t : list) {
            if(predicate.test(t)) {
                newList.add(t);
            }
        }
        return newList;
    }
}
