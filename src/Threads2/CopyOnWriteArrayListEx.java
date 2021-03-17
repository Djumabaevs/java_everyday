package Threads2;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Bakyt");
        list.add("Talka");
        list.add("Ono");
        System.out.println(list);

        Runnable runnable = () -> {
            Iterator<String> iterator = list.iterator();
            while(iterator.hasNext()) {
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };
        Runnable runnable1 = () -> {
            try {
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(3);
            list.add("oni");
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);
    }
}
