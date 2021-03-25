package threads.com;

public class Main extends Thread {
    public void run(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
	Main t1 = new Main();
	Main t2 = new Main();
	Main t3 = new Main();

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());
        System.out.println("Name of t3: " + t3.getName());

        t1.start();
        t2.start();
        t3.start();

    t1.setName("first thread");
    t2.setName("Second thread");
    t3.setName("Third thread");

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());
        System.out.println("Name of t3: " + t3.getName());
        
    }
}
