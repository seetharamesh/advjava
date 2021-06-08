package advjava;
//https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/
public class MinFiboNumber {
	
public static int findMinFibonacciNumbers(int k) {
	 if(k < 2) return k;
	
	/*1 1 2 3 5 8 13......*/
	int n1 = 1;
	int n2 = 1;
	while(n2 <= k) {
		n2 += n1;
		n1 = n2 - n1;
	}
	int diff = k - n1;
	return 1+findMinFibonacciNumbers(diff);
        
    }
	public static void main(String[] args) {
		int k = 19;//output 2 for k = 7,10. For k = 19 output 3
		int result = findMinFibonacciNumbers(k);
		System.out.println("*****"+result);
	}

}
