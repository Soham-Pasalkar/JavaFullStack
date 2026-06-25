package BinaryTree;

public class testbinarytree {
	
	public static void main(String[] args) {
		
		binarytree root = new binarytree();
		
		root.add(50);
		root.add(30);
		root.add(40);
		root.add(25);
		root.add(70);
		
		root.inorder();
	}

}
