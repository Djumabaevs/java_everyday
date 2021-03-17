package Generics;

import java.util.List;

public class SquareBox <T> extends Box<T>{
    public SquareBox(List<T> l) {
        super(l);
    }
    public static <T> String concat(T data) {
        return "Data is " + data;
    }
}
