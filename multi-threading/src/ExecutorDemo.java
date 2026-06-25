import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class GoRunnable implements Runnable {
	private final long countUtil;
	
	GoRunnable(long countUtil){
		this.countUtil = countUtil;
	} 
	
	public void run() {
		long sum = 0;
		for(long i = 1; i < countUtil; i++) {
			sum += 1;
		}
		System.out.println(sum);
	}
}


public class ExecutorDemo {
	private static final int NTHREADS = 10;
	
	public static void main (String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);
	
		long start = System.currentTimeMillis();
		for(int i = 0; i < 500; i++) {
			Runnable worker = new GoRunnable(100000000L + i);
			executor.execute(worker);
		}
		
		executor.shutdown();
		
		while(!executor.isTerminated()) {}
		
		long end = System.currentTimeMillis();
		System.out.println("Finished all threads in "+ (end - start));
	}
}
