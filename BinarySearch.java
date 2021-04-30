package advjava;

/*Given SORTED array of unique numbers, find the index of a number using binary search*/

public class BinarySearch {

	public static void main(String[] args) {
		int[] num = {0,1,2,3,4,5,6,7,8,9,10};
		int search = 8;
		int start = 0,end=0;
		boolean found = false;
		
		int len = num.length;
		int mid = len/2;
		
		if(search > mid) {
			start = mid-1;
			end = len - 1;
		}
		else if (search < mid) {
			start = 0; 
			end = mid-1;
		}
		else {
			System.out.println("Index of the search number is: " + mid);
		}
		for(int i = start; i <= end; i++) {
			if(num[i] == search){
				System.out.println("Index of the search number is: "+ i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Index of the search number is: -1. The search number doesn't exist in the array");
		}

	}

}
