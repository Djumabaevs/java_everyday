package FunctionalReactive;

import java.util.function.Function;

public class ConstructorReference {
    public static void main(String[] args) {
        Function<Runnable, Thread> threadGenerator = Thread::new; //r -> new Thread(r);

        Runnable task1 = () -> System.out.println("Task1 executed");
        Runnable task2 = () -> System.out.println("Task2 executed");

        Thread thread1 = threadGenerator.apply(task1);
        Thread thread2 = threadGenerator.apply(task2);

        thread1.start();
        thread2.start();

        threadGenerator.apply(() -> System.out.println("Task3 executed")).start();

    }
}
