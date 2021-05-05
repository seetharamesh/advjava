package advjava;

import java.util.ArrayList;
import java.util.List;

public class SumOfPartsEfficient {
	static List<Integer> result = new ArrayList<>();
	static List<Integer> printSumOfParts(List<Integer> list, int i) {
		if(list.size() == 0) return null;
		result.add(i);
		//System.out.println(i);
		int r = list.remove(0);
		printSumOfParts(list,i-r);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		for(int i: arr) {
			list.add(i);
			sum+=i;
		}
		List result = printSumOfParts(list,sum);
		result.add(0);
		System.out.println(result);
	}

}
