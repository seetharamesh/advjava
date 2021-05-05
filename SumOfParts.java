package advjava;
import java.util.*;

public class SumOfParts {
	static int sum = 0, index = 0;

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		int sum = 0;
		
		List<Integer> list = new ArrayList<>();
		for(int j = 0 ; j < arr.length; j++) {
		for(int i = j; i < arr.length; i++) {
			sum += arr[i];	
		}
		list.add(sum);
		sum = 0;
		}
		list.add(0);
		System.out.println(list);

		//printSumOfParts(arr,0);
		
		
	}

}
