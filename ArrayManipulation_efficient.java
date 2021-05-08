package advjava;

import java.util.*;

/*array of positive integers, replace every element with the least greater element to its right. 
 * If there is no greater element to its right, replace it with -1. Return a new array,*/

public class ArrayManipulation_efficient {

	public static void main(String[] args) {
		
	//int[] num = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
		
		
	int[] num = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
	int len = num.length -1;//5
	int[] result = new int[num.length];
	
	int max_elem = Integer.MIN_VALUE	;
	
	for(int i = len; i >=0 ; i-- ) {
		 max_elem = Math.max(max_elem, num[i]);
		 result[i] = max_elem;

		
	}
	result[len] = -1;
	
	for(int i: result) System.out.println(i);
}
}
