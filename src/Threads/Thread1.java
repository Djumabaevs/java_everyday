package Threads;

import java.util.Scanner;

public class Thread1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runner());
        thread.start();
        MyThread myThread = new MyThread();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutDown();

    }
}

class Runner implements Runnable{
    @Override
    public void run(){

    }
}

class MyThread extends Thread{
    private volatile boolean running = true;
    public void run(){
            while(running){
                System.out.println("Hello");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutDown(){
        this.running = false;
    }
}
