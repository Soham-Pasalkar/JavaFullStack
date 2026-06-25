
public class SyncDemo implements Runnable {
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		print(name);
	}
	
	//Synchronized Thread Implementation
	private synchronized void print(String Name) {
		try {
			System.out.println("[");
			Thread.sleep(1000);
			System.out.println(Name);
			Thread.sleep(1000);
			System.out.println("]");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();
		
		Thread t1 = new Thread(sd, "Alpha");
		Thread t2 = new Thread(sd, "Beta");
		Thread t3 = new Thread(sd, "Gamma");
		
		t1.start();
		t2.start();
		t3.start();
	}
	

}
