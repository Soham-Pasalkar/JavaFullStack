package LinkedList;

public class testlinkedlist {
	public static void main(String[] args) {
		
		//1 indexed linked list
		
		linkedlist head = new linkedlist();
		head.add(30);
		head.add(50);
		head.add(60);
		head.print();
		
		head.insert(2, 45);
		head.print();
		head.insert(5, 88);
		head.print();
		head.insert(1, 67);
		head.print();
		
		head.delete(0);
		head.print();
		head.delete(5);
		head.print();
		head.delete(3);
		head.print();
	}

}
