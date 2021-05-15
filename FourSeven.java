package advjava;

import java.util.PriorityQueue;
import java.util.Scanner;

/*Your function should accept the inputs 4 and 7. If 4 is entered, the function should return 7. If 7 is entered, the function should return 4. 
 * Anything else entered as input should return 0. There's only one catch, your function cannot include if statements, 
 * switch statements, or the ternary operator (or the eval function due to the fact that you can get around the if requirement using it).
 * */
public class FourSeven {
	
	static void fourseven(String n) {
		while(n.equals("4")) {
			System.out.println("7");
			break;
		}
		while(n.equals("7")) {
			System.out.println("4");
			break;
		}
		
	}

	public static void main(String[] args) {
			
		System.out.println("Enter either 4 or 7");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		fourseven(n);

	}

}
