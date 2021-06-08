package advjava;
//https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/
public class MinFiboNumber {
	static int count;
	static {
		 count = 0;
	}
public static int findMinFibonacciNumbers(int k) {
	if(k == 1 || k == 2) return 1;
	 
	
	/*1 1 2 3 5 8 13......*/
	int n1 = 1;
	int n2 = 1;
	int s = n1 + n2;
	while(s <= k) {
		n1 = n2;
		n2 = s;
		s = n1 + n2;	
	}
	count++;
	System.out.println(n2);//
	int diff = k - n2;
	findMinFibonacciNumbers(diff);
	if(diff == 1 || diff == 2) ++count;
	//System.out.println(count);
	
	
	return count;
        
    }
	public static void main(String[] args) {
		int k = 1;//output 2 for k = 7,10. For k = 19 output 3
		int result = findMinFibonacciNumbers(k);
		System.out.println("*****"+result);
	}

}
