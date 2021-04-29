package advjava;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class MaxSumRootToLeaf {
	
	static class Node{
		int data;
		boolean visited;
		Node left,right;
		//constructor
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	int sum = 0, prevsum = 0, highestsum=0;
	public int maxSum(Node node) {
		Stack<Node> stack = new Stack<Node>();
		List<Node> printarr = new ArrayList<>();
		boolean again = false;
		while(true) {
		while(node != null) {
			//System.out.print(" " + node.data);
			stack.push(node);
			printarr.add(node);
			node = node.left;
			again = true;
		}//end while
		if (again) {
			for(Node i: printarr) {
				sum += i.data;
				System.out.print(i.data + " -> ");
		}
			System.out.print("sum = " + sum);
			if(prevsum > sum) highestsum = prevsum;
			else highestsum = sum;
			System.out.println("\n");
			sum = 0;
		}
		
		if(!stack.isEmpty()) {
			again = true;
			node = stack.pop();
			
			if(node.right == null) {
			printarr.remove(node);
			again = false;
			}
			node = node.right;
		
		}
		else return highestsum;

	}//end of while true
		
	}

	public static void main(String[] args) {
		//build the tree
		Node root = new Node(17);
		root.visited = true;
		
		root.left = new Node(3);
		root.right = new Node(-10);
		root.left.left = new Node(2);
		root.right.left = new Node(16);
		root.right.right = new Node(1);
		root.right.right.left = new Node(13);
		root.right.right.right = new Node(30);
		MaxSumRootToLeaf msrl = new MaxSumRootToLeaf();
		int answer = msrl.maxSum(root);
		System.out.println("final answer with max sum path: " + answer);
	}

}
