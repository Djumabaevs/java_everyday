package Threads2;

public class Thread04 {
    static int counter = 0;
    public static void increment() {counter++;}
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 runnable1 = new MyRunnable1();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);
        Thread thread3 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(counter);
    }
}

class MyRunnable1 implements Runnable {

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < 4; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + " ");
            Thread04.increment();
        }
    }
}