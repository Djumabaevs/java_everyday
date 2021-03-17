package Threads2;

public class Thread03 extends Thread{
    volatile boolean b = true;

    public void run() {
        long counter = 0;
        while(b) {
            counter++;
        }
        System.out.println("Loop is finished and counter is " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread03 thread = new Thread03();
        thread.start();
        Thread.sleep(3000);
        System.out.println("after 3 seconds it is time to wake up ");
        thread.b = false;
        thread.join();
        System.out.println("program ends");

    }
}
