package advjava;
import java.util.*;

public class CountOfSmallerNumbersAfterSelf {
	
	 public static List<Integer> countSmaller(int[] nums) {
	        List<Integer> list = new ArrayList<>();
	        int start = 0,count=0, result=0, compare=0;
	        int end = nums.length-1;
	        
	        while(start <= end) {
	        compare = nums[start++];
	         result = countSmallerRecursive(nums,start,compare,count);//call recursive method
	       // add to list;
	        list.add(result);
	        }
	        return list;
	    }
	
	public static int countSmallerRecursive(int[] nums, int start, int compare, int count) {
		if(start > nums.length-1) return count;
		
		return(compare > nums[start] ? 1+ countSmallerRecursive(nums, start+1, compare, count): countSmallerRecursive(nums, start+1, compare, count));
		
	}
	public static void main(String[] args) {
		int[] nums = {-1}; //{5,2,6,1};
		List<Integer> result = countSmaller(nums);
		System.out.println(result);
	}

}
