package advjava;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		for(int i = left; i<=right;i++) {
			String str = Integer.toString(i);
			char[] c = str.toCharArray();
			int valid = checkValid(i,c);
			if(valid != -1) list.add(i);
		}
		
		return list;
        
    }
	
	public static int checkValid(int i, char[] c) {
		for(int j = 0 ; j < c.length; j++) {
			if(c[j] == '0') return -1;
			int getNumericVal = Character.getNumericValue(c[j]);
			if(i%getNumericVal != 0) return -1;
		}
		return i;
	}
	public static void main(String[] args) {
		int left = 1, right = 22;
		List<Integer> list = new ArrayList<>();
		list = selfDividingNumbers(left, right);
		System.out.println(list);
	}

}
