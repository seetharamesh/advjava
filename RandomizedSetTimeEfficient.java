package advjava;
import java.util.*;

/*This is time efficient because for getRandom() we do not have to create new Integer for every element in the array.*/

class RandomizedSetTimeEfficient {
	Map<Integer,Integer>map;
	List<Integer> list;
	Random rd;
	static int prevListSize = 0;

    /** Initialize your data structure here. */
     public RandomizedSetTimeEfficient() {
    	map = new HashMap<>();
    	list = new ArrayList<>();
    	rd = new Random();       
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
    	//val is the key
        	if(!map.containsKey(val)) {
        		map.put(val, list.size());    
        		list.add(val);
        		System.out.println(list);
        		System.out.println(map);
        		return true;
        	}      	
        	return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	
    	/* To remove method pay attention to the following details:
    	 * 1. Swap the element that has to be removed with last element in the array
    	 * 2. Modify in the map for the element that will be removed it's value with the list index
    	 * 3. remove the element from list and map*/

    	 if (!map.containsKey(val)) return false;
    	        int N = list.size();
    	        int index = map.get(val);
    	        int last = list.get(N-1);
    	        list.set(index, last);
    	        System.out.println(list);
    	        map.put(last, index);
    	        System.out.println(map);
    	        System.out.println("the modified list and map are: ");
    	        map.remove(val); 
    	        System.out.println(map);
    	        list.remove(N-1);     
    	        System.out.println(list);
    	        return true;
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
    	 int size=list.size();
    	 
         int random_val=(rd.nextInt(size));
         
         System.out.println("random val ***" + random_val);
         
        //System.out.println(list.remove(random_val));
        
        return(list.get(random_val));
    }
    public static void main(String[]args) {
    	RandomizedSetTimeEfficient rs = new RandomizedSetTimeEfficient();
    	
    	rs.insert(5);
    	rs.insert(6);
    	rs.insert(7);
    	rs.insert(8);
    	
    	rs.remove(5);
    	
    	rs.insert(2);
    	
    //	rs.remove(1);
    //	int r = rs.getRandom();
    //	System.out.println(r);
    	
//    	rs.remove(0);
//    	rs.remove(0);
//    	
//    	rs.insert(0);
//    	
//    	rs.getRandom();
//    	rs.remove(0);
//    	
//    	rs.insert(0);
    	
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */