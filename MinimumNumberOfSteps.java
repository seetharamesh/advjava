package advjava;

public class MinimumNumberOfSteps {

	public static void main(String[] args) {
		//generate array using (2*i) + 1.....example arr would be {1,3,5,7...}
		//System.out.println("Enter size of array: ");
		//get input from user if need to be
		int arrsize = 6, sum=0;
		int[] arr = new int[arrsize];
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = (2*i) +1;
			sum+=arr[i];
		}
		
		//2. find median
		int median = sum/arrsize;
		
		//to make array equal apply this
		int result = 0;
		for(int j=1; j<median; j=j+2) {
			 result = result + (median - j);
		}
		System.out.println(result);
	}

}
