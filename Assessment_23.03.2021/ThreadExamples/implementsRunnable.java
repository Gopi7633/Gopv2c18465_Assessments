package Threads.com;

public class Main implements Runnable {
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("Hi");
    }
    public void run() {
        System.out.println("Hello");
    }
}
