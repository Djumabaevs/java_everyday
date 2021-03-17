package Threads2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable2Ex {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(6);
        Future<Integer> future = executorService.submit(factorial2);
        try {
            System.out.println(future.isDone());
            System.out.println("we want to get result");
            factorialResult = future.get();
            System.out.println("we got the result");
            System.out.println(future.isDone());
        } catch(InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
    }
}
