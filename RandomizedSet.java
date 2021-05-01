package advjava;
import java.util.*;
class RandomizedSet {
		Set<Integer> hs ;

	    /** Initialize your data structure here. */
	    public RandomizedSet() {
	    	hs = new HashSet<Integer>();
	        
	    }
	    
	    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	    public boolean insert(int val) {
	        if(!hs.contains(val)) {
	        	hs.add(val);
	        	return true;
	        }
	        return false;
	        	
	    }
	    
	    /** Removes a value from the set. Returns true if the set contained the specified element. */
	    public boolean remove(int val) {
	    	if(hs.contains(val)) {
	    		hs.remove(val);
	    		return true;
	    	}
	    	return false;
	        
	    }
	    
	    /** Get a random element from the set. */
	    public int getRandom() {
	    	 int size=hs.size();
	         Random rd=new Random();
	         int random_index=rd.nextInt(size);
	         //conver hs to array
	         Integer[] arr = hs.toArray(new Integer[hs.size()]);
	         return (arr[random_index]);

	
	    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */