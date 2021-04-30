package advjava;

public class BinarySearchRecursive {
	static boolean found = false;
	static int binarySearch(int[] num, int start, int end, int search) {
		
		int mid = (start + end) /2;
		
		if(num[mid] == search) 
			return mid;
		
		
		if(num[mid] > search && mid-1 >= 0) 
			return binarySearch(num, start, mid-1,search);
		
		
		if(num[mid] < search && mid+1 <= end) 
			return binarySearch(num, mid+1, end, search);
		
		return -1;
	
	}
	
	public static void main(String[] args) {
		int[] num = {2,3,4,10,40};
		int search = 15;
		int len = num.length;
		int result = binarySearch(num, 0, len-1, search);
		System.out.println(result);

	}

}
