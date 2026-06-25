package com.mmcoe.shopping;


public class ShoppingCart2 <G>{ //IMPLEMENTED USING LINKEDLIST
	
		
	private class Node{
			
		private Product data;
		public Node next;
			
		public Node (Product data) {
			this.data = data;
		}
			
	}
	
	//----------------------------
	private Node head;
	public int limit = 5;
	public int total = 0;
	
	//-----------------------------------
	public void add(Product data) throws CartException {
			
		Node newnode = new Node(data);
			
		if (head == null) {
			head = newnode;
		}
			
		else {
			int cnt = 1;
			Node temp = head;
			while(temp.next != null) {
				cnt += 1;
				if (cnt > limit) {
					throw new CartException("Your Cart is Full");
				}
				temp = temp.next;
		}
		temp.next = newnode;}
		
	}
		
	//-----------------------------------
	public void print() throws EmptyCartException{
		
		/*if(total == 0) {
			throw new EmptyCartException("Cart is Empty");
		}*/
		
		Node temp = head;
		
		while(temp != null) {
			System.out.println(temp.data + "");
			total += temp.data.getPrice();
			temp = temp.next;
		}
		
		System.out.println(" ");
		System.out.println(total);
	}
	
	
}
