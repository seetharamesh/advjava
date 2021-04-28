package advjava;

public class PrintNumberOfLeafNodes {
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
	
	int sum = 0;
public int printleafnodes(Node node) {
	if(node != null) {
		
	if(node.left == null && node.right == null) 
		sum += 1;
	
	else {
		if(node.left != null) {
			//System.out.print(" " + node.left.data);
			 printleafnodes(node.left);
		}
		if(node.right  != null) {
			//System.out.print(" " + node.right.data);
			 printleafnodes(node.right);
		}
	
	}
	}
	return sum;
}

	


public static void main(String[]args) {
	//build the tree
	Node root = new Node('a');
	root.left = new Node('b');
	root.right = new Node('c');
	
	root.left.left = new Node('d');
	root.left.right = new Node('e');
	
	root.right.left = new Node('f');
	root.right.right = new Node('g');
	
	PrintNumberOfLeafNodes pnl = new PrintNumberOfLeafNodes();
	int count = pnl.printleafnodes(root);
	System.out.println("\n" + count);

}
}