package advjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class StringSubsequence {

	public static int numMatchingSubseq(String s, String[] words) {
        char[] scarr = s.toCharArray();
        int slen = scarr.length;
        boolean valid = false;
        int count = 0;
        
        //for(int i = 0; i < words.length; i++) {
        for(String i: words) {
        	char[] wcarr = i.toCharArray();
        	int wlen = wcarr.length;
        	
        	
        //valid = matchingSubSeq(scarr,wcarr,slen,wlen);	//Recursive approach runs out of time in leetcode
        valid = matchingSubSeqIterative(scarr,wcarr,slen,wlen); //replaced recursive approach with iterative approach because of time issue
        	
        if(valid)	count++;
        	
        }
        
        return count;
        }
	
	public static boolean matchingSubSeq(char[] scarr, char[] wcarr, int slen, int wlen) {
		
		//base cases
		if(wlen == 0) return true;
		if(slen == 0)return false;
		
		if(wcarr[wlen-1] == scarr[slen-1])
			return matchingSubSeq(scarr, wcarr, slen-1, wlen-1);
		else
			return matchingSubSeq(scarr, wcarr, slen-1, wlen);
				
	}
	
public static boolean matchingSubSeqIterative(char[] scarr, char[] wcarr, int slen, int wlen) {
		
		int j = 0;
		
		for(int i = 0; i<slen&&j<wlen; i++)
			if(wcarr[j] == scarr[i])
				j++;
		return (j==wlen);
				
	}
	
	public static void main(String[] args) {
		//input s = "abcde", words = ["a","bb","acd","ace"]; Output -3
		
		String s = "dsahjpjauf";
		String[] words = {"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"};
		int result = numMatchingSubseq(s, words);
		System.out.println(result);
	}

}


/*HashMap<Character, List<Integer>> hash = new HashMap<>();
        List<Integer> list = new ArrayList<>();   
        char[] carr = s.toCharArray();
        int index = 0;
        //step 1: add key,value pairs to hash
        for(int i = 0; i  < carr.length; i++) {    	
        	if(!hash.containsKey(carr[i])) {
        		hash.put(carr[i], new ArrayList<>());
        	}
        	hash.get(carr[i]).add(i);     	
        }
        System.out.println(hash);
        
        //step 2: check in each "word" if alphabets exist in hashmap AND in the order
        for(int i = 0; i < words.length; i++) {
        	char[] c = words[i].toCharArray();//pick each word and put in char array
        	int carrlen = c.length;

        	while(carrlen > 0) {//check if any characters are not in hash
        		if(!hash.containsKey(c[i]))
        			break;
        		
        		//step 3: check for relative order
        		int position = 0,count = 0;
        			if(c.length == 1) { //if char array length is 1 then count (it means word length is "1")
        				++count;
        				break;
        			}
        			position = s.indexOf(c[i]);//
       			
        			for(int m = 0; m < c.length;m++) {
        			
        					
        			}//end of for
        			
        		}//end of while
        		carrlen --;
        	}
        	
        

        
        
        
        
        */