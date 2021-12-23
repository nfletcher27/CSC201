// Threads allow a program to operate more efficiently by doing multiple things at once
// We can either extend the Thread class and overriding the run() method, or implement the Runnable interface
public class Main extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}

// Runnable interface
public class Main implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}

// If we extend Thread class, the thread can be run by creating an instance and calling the start() method
public class Main extends Thread {
  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}

// If we implement Runnable, the thread is run by passing an instance of the class to a Thread object constructor and calling the thread start() method
public class Main implements Runnable {
  public static void main(String[] args) {
    Main obj = new Main();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is running outside a thread");
  }
  public void run () {
    System.out.println("This code is running inside a thread");
  }
}

// Concurrency is when the thread and main program are not easily discernable, and things can be misinterpreted since they both use the same variables
// In this, amount is unpredictable
public class Main extends Thread {
  public static int amount = 0;
  
  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println(amount);
    amount++;
    System.out.println(amount);
  }
  public void run() {
    amount++;
  }
}

// To avoid concurrency, use isAlive() to prevent issues
public class Main extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    // Wait for the thread to finish
    while(thread.isAlive()) {
    System.out.println("Waiting...");
  }
  // Update amount and print its value
  System.out.println("Main: " + amount);
  amount++;
  System.out.println("Main: " + amount);
  }
  public void run() {
    amount++;
  }
}
