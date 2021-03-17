package Threads2;

import java.util.concurrent.*;

public class CallableEx {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(5);
        Future<Integer> future = executorService.submit(factorial2);
        try {
            factorialResult = future.get();
        } catch(InterruptedException e) {
            e.printStackTrace();
        } catch(ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }

}
class Factorial2 implements Callable<Integer> {
    int f;
    public Factorial2(int n) {
        this.f = n;
    }
    @Override
    public Integer call() throws Exception {
        if(f <= 0) {
            throw new Exception("You entered wrong number");
        }
        int result = 1;
        for(int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}
