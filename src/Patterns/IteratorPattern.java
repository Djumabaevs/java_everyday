package Patterns;

import java.util.function.Consumer;

public class IteratorPattern {
    Object[] elements = new Object[5];

    public IteratorPattern(Object[] elements) {
        this.elements = elements;
    }
    public void forEach(Consumer<Object> action) {
        for(int i = 0; i < elements.length; i++) {
            action.accept(elements[i]);
        }
    }

    public static void main(String[] args) {
        IteratorPattern list = new IteratorPattern(new Object[]{1,3,5,3,2});
        list.forEach(System.out :: println);
    }
}
