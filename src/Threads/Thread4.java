package Threads;

import javax.sound.midi.spi.SoundbankReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Thread4 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i = 5; i < 5; i++)
            executorService.submit(new Work(i));

        executorService.shutdown();
        System.out.println("All tasks submitted");

        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

class Work implements Runnable{
    private int id;

    public Work(int id){
        this.id = id;
    }
    @Override
    public void run(){
        try{
            Thread.sleep(5000);
        } catch(InterruptedException E){
            E.printStackTrace();
        }
        System.out.println("Work " + id + "was completed");
    }
}
