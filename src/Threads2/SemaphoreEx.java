package Threads2;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Talka", callBox);
        new Person("Bakyt", callBox);
        new Person("Aklat", callBox);
        new Person("Tykab", callBox);
    }
}
class Person extends Thread {
    private String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }
    public void run() {
        try {
            System.out.println(name + " waiting for telephone");
            callBox.acquire();
            System.out.println(name + " using the telephone");
            Thread.sleep(2000);
            System.out.println(name + " stopped using the telephone");
        } catch(InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}
