package FunctionalReactive;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOpPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,39,98);

        UnaryOperator<Integer> unaryOperator = i -> i*100;

        List<Integer> newList = mapper(list, unaryOperator);

        System.out.println(newList);
    }
    private static <T> List<T> mapper(List<T> list, UnaryOperator<T> operator) {
        List<T> newList = new ArrayList<>();
        for(T t : list) {
            T element = operator.apply(t);
            newList.add(element);
        }
        return newList;
    }
}
