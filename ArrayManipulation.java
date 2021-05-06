package advjava;

import java.util.*;

/*array of positive integers, replace every element with the least greater element to its right. 
 * If there is no greater element to its right, replace it with -1. Return a new array,*/
public class ArrayManipulation {

	public static void main(String[] args) {
		
	int[] nums = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
	int[] result = new int[nums.length];
	int[] newarr = new int[nums.length];
	boolean flag = false;
	
	for(int i = 0 ; i < nums.length; i++) {
		
	int elem = nums[i];
	 newarr = Arrays.copyOfRange(nums, i+1, nums.length);
	 Arrays.sort(newarr);
	 for(int j = 0; j < newarr.length; j++) {
		 if(newarr[j] > elem) {
			 result[i] = newarr[j];
			 flag= true;
			 break;
		 }
		 flag= false;
	 }
	 if(!flag)	{
		 result[i] = -1;
	 }
	 if(i == nums.length-1) {
			result[i] = -1;
			break;
		}
	
	}

	
	for(int j: result)
		System.out.print(j + " ");
	}
}
