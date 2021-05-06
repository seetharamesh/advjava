package advjava;

import java.util.Arrays;

public class ArrayManipulation_Backward {

	public int[] replaceElements(int[] arr) {
	    int[] result = new int[arr.length];
	    //result[arr.length - 2] = arr[arr.length - 1];
	    //result[arr.length -1 ] = -1;
	    int max_elem1 = Integer.MIN_VALUE;
	    for(int i = arr.length - 1 ; i > 0; i--) {
	    	int max_elem2 = Math.max(max_elem1, arr[i]);
	    	max_elem1 = max_elem2;
	    	result[i-1] = max_elem2;
	    			
	    }
	    result[arr.length-1] = -1;
	
	    return result;
	    }

	    public static void main(String[] args) {
	    	ArrayManipulation_Backward am = new ArrayManipulation_Backward();
	    	int[] arr = {400,150,200,500,100};
	    	int[] result = am.replaceElements(arr);
	    	for(int i: result)
	    		System.out.println(i);
	
	    }
}
