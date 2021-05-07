package advjava;

import java.util.Scanner;

/* You are climbing a staircase. It takes n steps to reach the top. (n will always be a whole number, greater than 0)
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/
public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println("Enter number of steps: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 2) {
			System.out.println(n);
		}
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            System.out.printf("i = %d and dp = %d \n", i,dp[i] );
        }
        //return dp[n - 1];
        System.out.println("final result = " + dp[n-1]);
	}

}
