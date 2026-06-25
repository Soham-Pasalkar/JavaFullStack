package Queue;

public class testQueue {
	
	public static void main(String[] args) {
		
		queue arr = new queue();
		
		arr.enqueue(78);
		arr.enqueue(79);
		arr.dequeue();
		arr.enqueue(100);
		arr.enqueue(54);
		arr.dequeue();
		arr.enqueue(7);
		arr.show();
	}
}
