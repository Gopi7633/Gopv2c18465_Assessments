package DirectRunMethod.com;

public class Main extends Thread {
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Main Thread = new Main();
        Main Thread1 = new Main();

        Thread.run();
        Thread1.run();
    }
}
