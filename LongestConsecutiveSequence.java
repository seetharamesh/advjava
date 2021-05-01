package advjava;
import java.util.*;

/* Given unsorted array of integers nums find the longest consecutive sequence.
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.*/

public class LongestConsecutiveSequence {
	
public int longestConsecutive(int[] nums) {
	if(nums.length == 1) return 1;
	
	
	//1. convert to arraylist and sort. Sort can't be done on hashset. Hashset is used to avoid duplicates
	List<Integer> list = new ArrayList<Integer>();	
	Arrays.asList(nums);
	for(Integer i: nums){
		list.add(i);
	}
	Collections.sort(list);
	System.out.println(list);
	

	//2. check if elements are consecutive
	//ArrayList<Integer> csequence = new ArrayList<>();
	HashSet csequence = new HashSet();
	int csequencelen = 0, k = 0, l =0, j=0, prevsize =0;
	boolean sequence = false, halfsequence = false;

	for(int i=0; i< list.size()-1; i++) {
		l = list.get(i);// i th element
		k = list.get(i+1); // next to i th element
		j = list.get(i) + 1; //i th element + 1
		
		//m = list.get(i+1);
		
		if(j == k  || l == k) {
			csequence.add(list.get(i));
			//System.out.println(csequence.get(i));
			sequence = true;
			halfsequence = false;
			
		}
		else if(sequence && !halfsequence) {//if the sequence breaks and new sequence occurs somewhere
			csequence.add(list.get(i));
			//System.out.println(csequence);
			csequencelen = csequence.size();
			csequence.removeAll(csequence);
			//System.out.println(csequence);
			//System.out.println(csequencelen);
			halfsequence = true;
		}
		
		if(csequencelen > prevsize)//needed for half sequence occurances
		{
			prevsize = csequencelen;
			System.out.println("prevsize " + prevsize);
			
		}	
		
		if(!halfsequence && sequence && (i+1) == list.size() -1 ) {//if end of array reached when sequence is true and no half sequence occurances	
			csequence.add(list.get(i+1));
			csequencelen = csequence.size();
			if(csequencelen > prevsize) {
			prevsize = csequencelen;
			System.out.println("prevsize*** " + prevsize);
			}
		}	
	}
	return prevsize;
    }

	public static void main(String[] args) {
		int[] nums = {-6,-1,-1,9,-8,-6,-6,4,4,-3,-8,-1};
		LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
		int result = lcs.longestConsecutive(nums);
		System.out.println(result);
	}

}
