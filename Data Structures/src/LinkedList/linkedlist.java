package LinkedList;

public class linkedlist<G> {
	
	private class Node{
		
		private G data;
		public Node next;
		
		public Node (G data) {
			this.data = data;
		}
		
		public G getData() {
			return data;
		}
	}
	
	//-----------------------------------
	private Node head;
	
	//-----------------------------------
	public void add(G data) {
		
		Node newnode = new Node(data);
		
		if (head == null) {
			head = newnode;
		}
		
		else {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;}
	}
	
	//-----------------------------------
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(" ");
	}
	
	//------------------------------------
	public void insert(int idx, G data) {
		
		Node newnode = new Node(data); // Insertion at Start
		if (idx == 1 || idx == 0) {
			newnode.next = head;
			head = newnode;
		}
		
		else {
			int size = 1;              // Linked List size calculation
			Node t = head;
			while(t.next != null) {
				size += 1;
				t = t.next;
			}
			
			
			if (idx > size+1) {          // Exception Handling
				throw new IndexOutOfBoundsException("Out of Bounds");
			}
			
			
			else if (idx == size+1) {   // Insertion at End
				t.next = newnode;
			}
	
			
			else {                     // Insertion at Middle
			Node temp = head;
			for(int i = 1; i < idx - 1; i ++) {
				temp = temp.next;
			}
			newnode.next = temp.next;
			temp.next = newnode;
			
			}
		}
	}
	
	//------------------------------------------------------------
	public void delete(int idx) {
		
		if (idx == 1 || idx == 0) {
			head = head.next;
		}
		
		else {
			int size = 1;              // Linked List size calculation
			Node t = head;
			while(t.next != null) {
				size += 1;
				t = t.next;
			}
			
			if (idx > size) {          // Exception Handling
				throw new IndexOutOfBoundsException("Out of Bounds");
			}
			
			
			else if (idx == size) {   // Deletion at End
				Node temp = head;
				while (temp.next.next != null) {
					temp = temp.next;
				}
				temp.next = null;
			}
			
			else {                     // Deletion at Middle
				Node temp = head;
				for(int i = 1; i < idx - 1; i ++) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
				
				}
		}
		
		
	}
}
