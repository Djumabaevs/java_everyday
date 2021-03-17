package Threads2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
              //  System.out.println(name + " waiting for bank terminal");
                // lock.lock();
                System.out.println(name + " using bank terminal");
                Thread.sleep(2000);
                System.out.println(name + " finished using terminal");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " doesn't want to wait in queue");
        }
    }
}
class BankTerminal {
    public static void main(String[] args) throws InterruptedException{
        Lock lock = new ReentrantLock();
        new Employee("Bakyt", lock);
        Thread.sleep(3000);
        new Employee("Talka", lock);
        new Employee("Ono", lock);
    }
}
