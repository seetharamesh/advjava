package advjava;

import java.util.stream.*;
import java.util.*;

//https://leetcode.com/problems/sum-of-unique-elements/
public class UniqueSum {

	public static int sumOfUnique(int[] nums) {
		
		//convert int[] to ArrayList using stream
		ArrayList<Integer> arr = (ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList());//output - [1, 2, 3, 2]
		
		ArrayList<Integer> temp = new ArrayList<>();
		//System.out.println(arr);
		int toRemove=0, sum = 0;
		boolean flag = false;
		HashSet<Integer> hs = new HashSet<>();
		for(Integer i: arr) {
			if(!hs.add(i)) {
				//store elements in an array that cannot be re-added to the set 
				temp.add(i);
			}
		}
		
		//loop through this temp arraylist and remove elements from set
		int dupSum = 0;
		for(int i: temp) {
			hs.remove(i);
		}
		
		//result 
		for(int i: hs)
			sum += i;
			
		return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,2,2,3,5};
		int result = sumOfUnique(nums);
		System.out.println(result);

	}

}
