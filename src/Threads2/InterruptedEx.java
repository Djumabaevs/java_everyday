package Threads2;

public class InterruptedEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        Thread.sleep(2000);
        interruptedThread.interrupt();

        interruptedThread.join();

        System.out.println("Main ends");
    }
}
class InterruptedThread extends Thread {
    double sqrtSum = 0;
    public void run() {
        for(int i = 0; i < 1000_000_000; i++) {
            if(isInterrupted()) {
                System.out.println("Thread is interrupted");
                return;
            }
            sqrtSum += Math.sqrt(i);
        try {
            sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Let us finish our thread");
           }
        }
        System.out.println(sqrtSum);
    }
}