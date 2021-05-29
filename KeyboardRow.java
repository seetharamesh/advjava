package advjava;

import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/keyboard-row/

public class KeyboardRow {

public static String[] findWords(String[] words) {
	String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
	ArrayList<String> arr = new ArrayList<>();
	
	int count = 0;
	HashSet hsk1 = new HashSet<>();
	HashSet hsk2 = new HashSet<>();
	HashSet hsk3 = new HashSet<>();
	
	
	char[] k1 = keyboard[0].toCharArray();
	char[] k2 = keyboard[1].toCharArray();
	char[] k3 = keyboard[2].toCharArray();
	
	for(int i = 0; i < k1.length; i++)
		hsk1.add(k1[i]);
	
	
	for(int k = 0; k < k2.length; k++)
		hsk2.add(k2[k]);
	
	for(int m = 0; m < k3.length; m++)
		hsk3.add(k3[m]);
	
	HashSet<Character> hs=null;
	for(int i = 0; i < words.length; i++) {
		hs = new HashSet<>();
		//System.out.println(strarr[i]);
		String lowercase_str = words[i].toLowerCase();
		char[] c = lowercase_str.toCharArray(); //convert string to char[]
		
		for(int j = 0; j<c.length; j++) {
			hs.add(c[j]);//add chars to a set to avoid adding duplicate chars.
		}
		//now check if that hs is contained in either hsk1, hsk2, hsk3
			if(hsk1.containsAll(hs)) arr.add(words[i]);
			else if(hsk2.containsAll(hs)) arr.add(words[i]);
			else if(hsk3.containsAll(hs)) arr.add(words[i]);	
	}	
	String[] result = new String[arr.size()];
	for(int p = 0; p<arr.size(); p++) {
		result[count++]=arr.get(p);
	}
	return result;
        
    }

	public static void main(String[] args) {
		String[] strarr = {"Hello","Alaska","Dad","Peace"};
		
		String[] result = new String[strarr.length];
		
		String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
		result = findWords(strarr);
			
		
		for(String s: result)
			System.out.println(s);
	}

}
