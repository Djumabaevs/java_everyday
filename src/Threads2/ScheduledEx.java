package Threads2;

import java.util.concurrent.*;

public class ScheduledEx {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.schedule(new RunnableImpl2(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl2(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        scheduledExecutorService.shutdown();
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl2(),3,1, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}
class RunnableImpl2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished work");
    }
}
