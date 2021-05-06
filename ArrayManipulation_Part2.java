package advjava;
import java.util.*;

public class ArrayManipulation_Part2 {
	    public int[] replaceElements(int[] arr) {
	    int[] result = new int[arr.length];
		int[] newarr = new int[arr.length];
		int i = 0;
		int len = arr.length;
		if (len == 1) {
			result[0] = -1;
			return(result);
		}
		for( i = 0 ; i < arr.length-1; i++) {
			
		int elem = arr[i];
		 newarr = Arrays.copyOfRange(arr, i+1, arr.length);
		 int len2 = newarr.length;
		 Arrays.sort(newarr);
	     int greaterelem = newarr[newarr.length-1];
	        result[i] = greaterelem;
		}
		
		result[arr.length-1] = -1;
	    return result;
	    }

	    public static void main(String[] args) {
	    	ArrayManipulation_Part2 am = new ArrayManipulation_Part2();
	    	int[] arr = {400,150,200,500,100};
	    	int[] result = am.replaceElements(arr);
	    	for(int i: result)
	    		System.out.println(i);
	
	    }
		// TODO Auto-generated method stub

	

}
