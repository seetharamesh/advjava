package advjava;

import java.util.Stack;

/*return true if values and structures of both tree are the same. else return false*/

public class CompareTrees {
	static class Node{
		int data;
		Node left,right;
		//constructor
		Node(int data){
			this.data=data;
			left = null;
			right = null;
		}
	}
	static boolean equalflag = true;

	public boolean compareTrees(Node node1, Node node2) {

		//first set the basecases to exit this function
		
		if(node1 == null && node2 == null) { //leaf nodes
			System.out.println("Reached leaf nodes");
			return true;
		}
		if ((node1 == null && node2 != null) || 
			      (node1 != null && node2 == null)) {//unbalanced trees meaning structures are not same
			    return false;
			  }
		
		if(node1.data != node2.data) {
			System.out.println("the data is not same in both the trees");
			return false;
		}
	
		return(compareTrees(node1.left, node2.left) && compareTrees(node1.right, node2.right));
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//build tree1
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		
		Node root2 = new Node(1);
		root2.left = new Node(2);
		root2.right = new Node(3);
		root2.right.right = new Node(4);
		
		CompareTrees ct = new CompareTrees();
		boolean answer = ct.compareTrees(root1, root2);
		if(!answer) {
			System.out.println("Trees are not the same");
		}
		else {
			System.out.println("Trees are the same");
		}

	}

}
