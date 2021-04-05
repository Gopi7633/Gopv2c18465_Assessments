package example.thread;

public class ThreadLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = ()->{
			System.out.println("Thread-1 is running");
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		try {
			t1.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Thread-0 is running");
	}

}
