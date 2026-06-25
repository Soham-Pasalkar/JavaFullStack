package Stack;

public class stack {

	public int arr[] = new int [5];
	public int top = 0;
	
	
	public stack() {	
	}
	
	public void push(int data) {
		arr[top] = data;
		top += 1;
	}
	
	public int pop() {
		int temp = arr[top-1];
		arr[top-1] = -1;
		top -= 1;
		return temp;
	}
	
	public void show() {
		for(int i = 0; i < top; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
