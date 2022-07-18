package main;
import java.util.Random;

public class ClasseThread2A extends Thread {
  public void run() {
    super.run();
    Random random = new Random();
    Integer time = 3; /* random.nextInt(6); */
    System.out.println("Thread " + this.getName() + " vai dormir por " + time + " segundos");
    try {
      super.sleep(time * 1000);
      System.out.println("Thread " + this.getName() + " dormiu por " + time + " segundos");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}