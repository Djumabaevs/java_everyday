package Threads2;

public class Market {

    public static void main(String[] args) {
        MarketOne marketOne = new MarketOne();
        Producer producer = new Producer(marketOne);
        Consumer consumer = new Consumer(marketOne);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}
class MarketOne {
    private int breadCount = 0;

    public synchronized void getBread() {
        while(breadCount < 1) {
            try {
                wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Consumer bought one bread");
        System.out.println("Amount of bread in the market is " + breadCount);
        notify();
    }
    public synchronized void putBread() {
        while(breadCount >= 5){
            try{
                wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Producer put one bread in market");
        System.out.println("Amount of bread in market is " + breadCount);
        notify();
    }
}
class Producer implements Runnable {
    MarketOne marketOne;
    Producer(MarketOne marketOne) {
        this.marketOne = marketOne;
    }
   public void run(){
        for(int i = 0; i < 10; i++) {
            marketOne.putBread();
        }
   }
}
class Consumer implements Runnable {
    MarketOne marketOne;
    Consumer(MarketOne marketOne) {
        this.marketOne = marketOne;
    }
    public void run() {
        for(int i = 0; i < 10; i++) {
            marketOne.getBread();
        }
    }
}
