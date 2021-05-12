package advjava;
//https://www.hackerrank.com/challenges/utopian-tree/problem
public class UtopianTree {
	public static int utopianTree(int n) {
	    // Write your code here
		
		int count = 1,result = 1;
		if(n == 0) return result;
		
		while(count <= n) {
			if(count%2 == 0) {//if num of cycles even, then the cycle is summer. In summer height is increased by 1
				result += 1;
			}
			else { //cycle is odd, cycles are spring. In spring height is doubled
				result *= 2;
			}
			
			count++;
		}
		return result;
		

	    }
	public static void main(String[] args) {
		//int treeht = 1;
		int n = 3 ;//num of cycles
		//int spring = 2*treeht;
		//int summer = 1 + treeht;
		int result = utopianTree(n);
		System.out.println(result);

	}

}
