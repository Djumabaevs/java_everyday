package Threads2;

public class Thread05 {
    static final Raw raw = new Raw();

  synchronized void mobileCall() {
      synchronized (raw) {
          System.out.println("Mobile call starts");
          try {
              Thread.sleep(3000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          System.out.println("Mobile call ends");
      }
  }
  synchronized void skypeCall() {
      synchronized (raw) {
          System.out.println("Skype call starts");
          try {
              Thread.sleep(5000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          System.out.println("Skype call ends");
      }
  }
  synchronized void whatsappCall() {
      synchronized (raw) {
          System.out.println("whatsapp call starts");
          try {
              Thread.sleep(7000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          System.out.println("whatsapp call ends");
      }
  }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();


    }

}
class RunnableImplMobile implements Runnable {
    @Override
    public void run() {
        new Thread05().mobileCall();
    }
}
class RunnableImplSkype implements Runnable {
    @Override
    public void run() {
        new Thread05().skypeCall();
    }
}
class RunnableImplWhatsapp implements Runnable {
    @Override
    public void run() {
        new Thread05().whatsappCall();
    }
}
class Raw{

}
