package FunctionalReactive;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(32,4567,3,23,5431);
        Consumer<Integer> consumer = e -> System.out.println(e);// System.out :: println;
        consumer.accept(12);
        printElements(list, consumer);
    }
    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        for(T t : list) {
            consumer.accept(t);
        }
    }
}
