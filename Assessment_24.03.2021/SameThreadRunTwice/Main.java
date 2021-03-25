package threads.com;

public class Main extends Thread {
    public void run(){
        System.out.println("Same thread run Twice ? ");
    }

    public static void main(String[] args) {
	Main Thread = new Main();
	Thread.start();
	Thread.start();
    }
}

/* Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:789)
	at threads.com.Main.main(Main.java:11)
Same thread run Twice ? */
