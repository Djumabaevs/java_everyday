package Threads2;

public class Thread01 implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Thread01());
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }

}
