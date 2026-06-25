package Queue;

public class queue {
	
	public int arr[] = new int[10];
	public int start = 0;
	public int end = 0;

	public queue() {
	}
	
	public void enqueue(int data) {
		arr[end] = data;
		end += 1;
		
	}
	
	public int dequeue() {
		int temp = arr[start];
		arr[start] = -1;
		start += 1;
		return temp;
	}
	
	public void show() {
		for(int i = start; i < end; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
