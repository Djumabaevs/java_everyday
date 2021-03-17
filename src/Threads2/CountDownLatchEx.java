package Threads2;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch " + countDownLatch);
    }
    public static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("light is on");
        countDownLatch.countDown();
        System.out.println("countDownLatch " + countDownLatch);
    }
    public static void openDoors() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Open the door");
        countDownLatch.countDown();
        System.out.println("countDownLatch " + countDownLatch);
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Talka", countDownLatch);
        new Friend("Bakyt", countDownLatch);
        new Friend("Aklat", countDownLatch);
        new Friend("Tykab", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openDoors();
    }
}
class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " starts shopping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

