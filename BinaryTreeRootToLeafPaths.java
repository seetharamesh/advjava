package advjava;

import java.util.Stack;

//To print root to leaf paths, let's use pre-order traversal
public class BinaryTreeRootToLeafPaths {
	static class Node{
		char data;
		Node left,right;
		//constructor
		Node(char data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public void printRootToLeafPaths(Node node) {
		Stack<Node> stack = new Stack<Node>();
		while(true) {
			while(node != null) {
				System.out.print(" " + node.data);
				stack.push(node);
				node = node.left;	
			}//end while
			if(!stack.isEmpty()) {
				node = stack.pop();
				node = node.right;
			}		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node('a');
		root.left = new Node('b');
		root.right = new Node('c');
		root.left.left = new Node('d');
		root.left.right = new Node('e');
		root.left.right.left = new Node('h');
		root.left.right.right = new Node('i');
		root.left.right.right.left = new Node('j');
		root.left.right.right.right = new Node('k');
		
		root.right = new Node('c');
		root.right.left = new Node('f');
		root.right.right = new Node('g');
		root.right.right.right = new Node('m');
		
		BinaryTreeRootToLeafPaths btrlp = new BinaryTreeRootToLeafPaths();
		btrlp.printRootToLeafPaths(root);

		

	}

}
