package Threads;

public class Thread2 {
    private int counter;

    public static void main(String[] args) {
        Thread2 thread = new Thread2();
        thread.doWork();
    }
    public synchronized void increment(){
        counter++;
    }

    public void doWork(){
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                   increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }
}
