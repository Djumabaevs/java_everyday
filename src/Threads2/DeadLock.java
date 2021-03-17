package Threads2;

public class DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread11 thread11 = new Thread11();
        Thread12 thread12 = new Thread12();
        thread11.start();
        thread12.start();
    }

}
class Thread11 extends Thread {
    public void run() {
        System.out.println("Attempt to capture monitor of object lock1");
        synchronized (DeadLock.lock1) {
            System.out.println("Monitor of lock1 captured");
            System.out.println("Trying to capture lock2' monitor");
            synchronized (DeadLock.lock2) {
                System.out.println("Monitors of lock1 and lock2 captured");
            }
        }
    }
}
class Thread12 extends Thread {
    public void run() {
        System.out.println("Attempt to capture monitor of object lock1");
        synchronized (DeadLock.lock2) {
            System.out.println("Monitor of lock1 captured");
            System.out.println("Trying to capture lock2' monitor");
            synchronized (DeadLock.lock1) {
                System.out.println("Monitors of lock1 and lock2 captured");
            }
        }
    }
}
