package advjava;

//https://leetcode.com/problems/binary-tree-cameras/
public class BinaryTreeCameraAlternate {

	enum TYPE{
		LEAF,
		PARENT,
		COVERED;
	}
	static int camCount = 0;
	
	public static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
			left = null;
			right = null;			
		}
		
	}
	
	public static TYPE postOrderBT(Node node) {
		//basecase
		if(node == null) return TYPE.COVERED; 
		
		TYPE left = postOrderBT(node.left);
		TYPE right = postOrderBT(node.right);
		
			
		if(left == TYPE.COVERED && right == TYPE.COVERED)
			return TYPE.LEAF;
		
		if(left == TYPE.LEAF || right == TYPE.LEAF) {
			camCount++;
			return TYPE.PARENT;
		}
		
		if(left == TYPE.PARENT || right == TYPE.PARENT) {
			return TYPE.COVERED;

		}		
		return (TYPE.LEAF);	
	}
	
	public static int wrapperPostOrderBT(Node root) {
		TYPE check = postOrderBT(root);
		if(check == TYPE.LEAF)  camCount++; //this is added for case if we have just one node only. eg., [1]
		return camCount;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = null;
		root.left.left = new Node(3);
		root.left.right = null;
		root.left.left.left=new Node(4);
		root.left.left.right=null;
		root.left.left.left.left=null;
		root.left.left.left.right=new Node(5);
//		
		int res = wrapperPostOrderBT(root);
		System.out.println(res);
	}
}
