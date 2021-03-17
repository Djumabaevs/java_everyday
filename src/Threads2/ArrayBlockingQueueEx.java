package Threads2;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);
        //producer
        new Thread( () -> {
            int i =0;
            while(true) {
                try {
                    arrayBlockingQueue.put(++i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Producer placed " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        //consumer
        new Thread( () -> {
            while(true) {
                Integer j = null;
                try {
                    j = arrayBlockingQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Consumer took " + j);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
