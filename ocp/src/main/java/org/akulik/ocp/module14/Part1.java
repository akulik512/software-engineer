package org.akulik.ocp.module14;

public class Part1 {

  public static void main(String[] args) {
    new SimpleThread().result();

    new InterruptThread().result();
  }

  private static class SimpleThread {

    public void result() {
      Lateral lateral = new Lateral();
      new Thread(lateral).start();
      new Thread(lateral).start();
      new Thread(lateral).start();
      new Thread(lateral).start();
    }
  }

  private static class InterruptThread {

    public void result() {
      Runnable r =
          () -> {
            Thread ct = Thread.currentThread();
            while (!ct.isInterrupted()) {
              try {
                Thread.sleep(1000);
              } catch (InterruptedException e) {
                System.out.println("Hello!");
                return;
              }
              System.out.println("Test message one!");
            }
            System.out.println("Test message two!");
          };

      Thread t = new Thread(r);
      t.start();
      t.interrupt();
    }
  }
}
