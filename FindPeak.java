package advjava;
//https://leetcode.com/problems/find-peak-element/

/* Look at n/2 position
 * If a[n/2] < a[n/2 − 1] then only look at left half 1 . . . n/2 − − − 1 to look for peak
• Else if a[n/2] < a[n/2 + 1] then only look at right half n/2 + 1 . . . n to look for peak
• Else n/2 position is a peak
 * */
public class FindPeak {
	
	public static int findPeekElement(int[] nums) {	
		int len = nums.length;
		int begin_index = 0; 
		int end_index = nums.length - 1;	
		int result = peakFinder(nums, begin_index, end_index, len); //going to use this method for recursive calls	
		return result;
	}
	
	public static int peakFinder(int[] nums, int begin_index, int end_index, int len) { //recursive method
		//base case 1 -- length of array is 1
		if(len == 1) return 0;
				
		//base case 2 -- if 0th element is greater than 1st element then peak element is the first element
		if(nums[0] > nums[1]) return 0;
				
		//base case 3 -- if last element in the array is greater than previous element then peak element is the last element
		if(nums[nums.length-1] > nums[nums.length-2])return (nums.length-1);
				
		//base case 4 -- if we have just 2 elements after calculating mid we are left with only 2 elements to check in left or right
		if(len == 2) {
			if(nums[begin_index] < nums[end_index] || nums[end_index] > nums[begin_index]) return end_index;
				else return begin_index;
			}
		
		int mid_index = begin_index + (end_index - begin_index)/2;
		
		//check if mid_index element is a peak element
		if(nums[mid_index] >= nums[mid_index-1] &&  nums[mid_index] >= nums[mid_index+1]) return mid_index;
		
		//check if peak element is in left half of the array
		if(nums[mid_index] <= nums[mid_index-1] ) {  
			end_index = mid_index -1;
			len = mid_index; 			
		}
		//check if peak element is in right half of the array 
		else if(nums[mid_index] <= nums[mid_index+1]) {
			begin_index = mid_index + 1;
			len = end_index;
		}
		//RECURSIVE CALL for the above criterias(left or right) 
		return peakFinder(nums,begin_index, end_index,len);  	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,3,5,6,4};//{1,2,3,1};//{2,1};//{5,4,3,4,5};//{1,2,3};//{3,4,3,2,1}; //{6,5,4,3,2,3,2}; //{3,5,7,8,1};
		int result = findPeekElement(nums);
		System.out.println("index " + result + " is a peek.");
				
		}

	}


