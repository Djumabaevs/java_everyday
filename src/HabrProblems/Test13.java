package HabrProblems;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test13 {
    public static void comparingLists(){
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000_000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int)(Math.random()*(N-1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int)(Math.random()*(N-1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void main(String[] args) {
        comparingLists();
    }
}
