package advjava;

import java.util.Stack;

public class PostOrderBinaryTree {
	
	public static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
		
	}
	
	public static void printPostOrderBT(Node node) {
		
		if(node != null) {
			printPostOrderBT(node.left);
			printPostOrderBT(node.right);
			System.out.println(node.data);
		}
		
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		printPostOrderBT(root);
	}

}
