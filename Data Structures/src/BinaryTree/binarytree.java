package BinaryTree;

public class binarytree {
	
	
	private class Node {
		
		private int data;
		public Node left;
		public Node right;
		
		public Node(int data) {
			this.data = data;
		}
		
		public int getData() {
			return data;
		}
	}
	
	
	private Node root;
	
	//-----------------------------------------------
	public void add(int data) {
		Node newnode = new Node(data);
		
		if (root == null) {
			root = newnode;
		}
		
		
		Node temp = root;
		
		while(true) {
			
			if (data == temp.data) {
				break;
			}
			else if (temp.data > data) {
				if(temp.left == null) {
					temp.left = newnode;
					break;
				}
				else {
					temp = temp.left;
				}	
			}
			else {
				if(temp.right == null) {
					temp.right = newnode;
					break;
				}
				else {
					temp = temp.right;
				}	
			}
		}
	}
	
	//-----------------------------------------
	public void inorder() { //helper function
		inorder(root);
	}
	
	public void inorder(Node root) {  //TRAVERSAL
		if (root != null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	//---------------------------------------

}
