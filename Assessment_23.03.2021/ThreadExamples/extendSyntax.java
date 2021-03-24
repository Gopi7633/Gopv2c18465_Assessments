package Threads.com;

public class Main extends Thread {

    public static void main(String[] agrs){
        Main thread = new Main();
        thread.start();
        System.out.println("Hi.....");
    }
    public void run() {
        System.out.println("Hello");
    }
    
}
