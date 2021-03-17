package Threads2;

public class DaemonEx extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName() + "is daemon" + isDaemon());
        for(char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class DaemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemaon" + isDaemon());
        for(int i = 0; i < 1000; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Test {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        DaemonEx daemonEx = new DaemonEx();
        daemonEx.setName("example_thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true);
        daemonEx.start();
        daemonThread.start();
        System.out.println("Main thread ends");
    }
}
