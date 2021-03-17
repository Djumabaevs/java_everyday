package Generics;

import java.util.List;

public class RawTypeDemo {
    public static void main(String[] args) {
        Box<Integer> genBox = new Box<>(List.of(1,3,5,7,9));
        for(Integer integer : genBox.getA()) {
            System.out.println(integer);
        }
    }
}
