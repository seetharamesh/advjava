package advjava;

public class PartitionArrayEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {5,0,3,8,6};
		int[] leftarr = new int[A.length];
		int[] rightarr = new int[A.length];
		/*Goal is to split the array such that every element in left split array should be less than each element in right split array*/
		/* So where do we split the array ? Let's scan the array from left*/
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < A.length; i++) {
			 max = Math.max(max, A[i]);
			leftarr[i] = max;
			System.out.println(leftarr[i]);
		}
		System.out.println("*********");
		int min = Integer.MAX_VALUE;
		for(int i = A.length-1; i >=0 ; i--	) {
			min = Math.min(min, A[i]);
			rightarr[i] = min;
			System.out.println(rightarr[i]);
		}
		
		for(int i = 1; i <A.length; i++) {
			if(leftarr[i-1] <= rightarr[i]) System.out.println(i);
		}
		System.out.println(A.length);

}
}
