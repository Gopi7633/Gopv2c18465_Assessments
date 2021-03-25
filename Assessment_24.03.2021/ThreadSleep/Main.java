package threadSleep.com;

public class Main extends Thread {
    public void run(){
        for(int i=0;i<10;i++)
        {
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Main Thread = new Main();
        Thread.start();
    }
}
