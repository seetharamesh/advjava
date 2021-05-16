package advjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://www.hackerrank.com/challenges/the-hurdle-race/problem

//The question is confusing... actually we have to find the max height from the given array and see if it's greater than height then find the  difference
//and that'll be the dose needed by the character. 
public class Hurdlerace {

	public static int hurdleRace(int k, List<Integer> height) {
	    // Write your code here
	        Collections.sort(height);
	        int len = height.size()-1;
	        int maxht = height.get(len);
	        if(maxht > k) {
	            return(maxht-k); 
	        }
	        else return(0);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;//number of hurdles
		int h = 53; //height of the hurdle the racer can jump naturally
		//int[] hurdles = {1,6 ,3, 5 ,2};
		int[] hurdles = {86, 4, 83, 20, 6, 81, 58, 59, 53, 2, 54, 62, 25, 35, 79, 64, 27, 49, 32,
				95, 100, 20, 58, 39, 92, 30, 67, 89, 58, 81, 100, 66, 73, 29, 75, 81, 70, 55, 18,
				28, 7, 35, 98, 52, 30, 11, 69, 48, 84, 54, 13, 14, 15, 86, 34, 82, 92, 26, 8, 53,
				62, 57, 50, 31, 61, 85, 88, 5, 80, 64, 90, 52, 47, 43, 40, 93, 69, 70, 16, 43, 7,
				25, 99, 12, 63, 99, 71, 76, 55, 17, 90, 43, 27, 20, 42, 84, 39, 96, 75, 1};
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i<hurdles.length; i++) {
			arr.add(hurdles[i]);
		}
		int maxht = hurdleRace(h, arr);
		
	}

}
