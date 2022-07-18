package main;
import java.util.ArrayList;

public class MainQuestao2A {
  public static void main(String[] args) {
    Integer n = 10;

    ArrayList<ClasseThread2A> threadList = new ArrayList<ClasseThread2A>();

    for (int i = 0; i < n; i++) {
      ClasseThread2A thread = new ClasseThread2A();
      threadList.add(thread);
      thread.start();
    }

    for (Thread thread : threadList) {
      try {
        thread.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Numero de Threads Usadas:" + n);
  }
}