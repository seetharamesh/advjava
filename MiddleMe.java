package advjava;

/*Write a function that will take a key of X and place it in the middle of Y repeated N times.

Rules: If X cannot be placed in the middle, return X. N will always be > 0.

According to my understanding i am placing x in the mid point without touching the number of occurances of y
*/

public class MiddleMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		char y = 'F';
		String x = "abc";
		
		//if n == 1 then just return x and exit;
		if(n==1) {
			System.out.println(x);
			System.exit(0);
		}
		
		//first repeat y -- n times and store in a char[]
		char[] temp = new char[n];
		for(int i = 0; i < n; i++)
			temp[i] = 'F';
		
		//char[] to string conversion
		String result = temp.toString();
		//second, find mid of n
		int mid = n/2;
		System.out.println("mid point: " + mid);
		//third, place x in the mid point
		for(int i = 0; i <= temp.length-1; i++) {
			if(i==mid-1) System.out.print(y + x);
			else
				System.out.print(temp[i]);
		}
		
		
	}

}
