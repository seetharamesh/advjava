package advjava;

//https://leetcode.com/problems/binary-tree-cameras/
public class BinaryTreeCameras {
	
	static int monitored = 1;
	static int notMonitored = 2;
	static int hascamera = 3;
	static int count = 0;
	
	
	public static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
		
	}
	
	public static int PostOrderBT(Node node) {
		if(node == null) return 1;
		
		int l = PostOrderBT(node.left);
		int r = PostOrderBT(node.right);
		
		if(l == 1 && r ==1) return 2;
		if(l == 2 || r ==2) {
			count++;
			return 3;
		}
		return 1;
		//System.out.println(node.data);
	}
	
	public static void wrapperPostOrderBT(Node root) {
		int result = PostOrderBT(root);
		if(result == 2) count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		wrapperPostOrderBT(root);
	}

}
