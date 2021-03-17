package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Thread11 {
    public static void main(String[] args) throws InterruptedException{

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Connection connection = Connection.getConnection();
        for(int i = 0; i < 200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run(){
                    try{
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.DAYS);
        }
    }
}
//Singleton Pattern
class Connection {
    private static Connection connection = new Connection();
    private int connectionCount;
    private Semaphore semaphore = new Semaphore(10);

    private Connection(){

    }

    public static Connection getConnection(){
        return connection;
    }

    public void doWork() throws InterruptedException {
        synchronized(this) {
            connectionCount++;
            System.out.println(connectionCount);
        }
        Thread.sleep(5000);

        synchronized (this) {
            connectionCount--;
        }
    }
    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }
}
