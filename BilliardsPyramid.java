package advjava;

import java.util.Scanner;

public class BilliardsPyramid {
	//static int sequence =1;
	public int buildPyramid(int n, int level) {
		if(n <= 0) return level;
		++level;
		n= n-level;
		return(buildPyramid(n, level ));		
	}

	public static void main(String[] args) {
		//takes a number n, and returns the number of full levels in a billiards pyramid you could make with n billiard balls. Remember billiards triangle. level 1 - 1 ball, level 2 - 2 balls....level 5- 5 balls
		//total 15 balls. With 15 balls you can have 5 levels.
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		BilliardsPyramid bp = new BilliardsPyramid();
		int level = 0;
		int result = bp.buildPyramid(n,level);
		System.out.printf("Number of levels that can be built with %d balls is : %d ",n,result);
		
	}

}
