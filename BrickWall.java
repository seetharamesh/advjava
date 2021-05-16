package advjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//Leet code 554

public class BrickWall {
	
	public int leastBricks(List<List<Integer>> wall) {	
		System.out.println(wall);
		//Step 1: count the number of gaps in each row of the list. Store them in hashmap.
		int maxnum = 0;
	    Map<Integer, Integer> map = new HashMap<>();
	   // PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>((a,b) -> b-a); //maxheap
	        for (List<Integer> list : wall) { //extract each list from wall
	        	System.out.println(list);
	        	int prevelem = 0,value = 0;
	        	for(int i = 0; i < list.size()-1; i++) {
	        		
	        		int elem = prevelem + list.get(i); //KEY
	        		//if elem is not in hashmap add the count as 1 
	        		//if elem is in hashmap , increment by 1 by getting the previous value
	        		if(map.containsKey(elem)) { 
	        			value = map.get(elem) + 1;
	        			map.put(elem, value);

	        		}
	        		else {
	        			value = 1;
	        			map.put(elem, value);
	        		}
	        		prevelem = elem;
	        		//maxheap.add(value);
	            	maxnum = Math.max(value, maxnum);

	        	}//end of EACH for(list)
	
	        }//end of ALL for(list)
	        
	        System.out.println("Gaps are: " + map);
	        
	       // if(maxheap.size() == 0) return wall.size();//Exceptional case [[1],[1],[1]]. Because the inner for loop for each list will not be executed
	        if(maxnum == 0) return wall.size();
//	        int maxval = maxheap.peek();
//	        System.out.println(maxval +" +++++"); //peeks the highest value
//	        
	        System.out.println(maxnum + " *****");
	        
	        //Step 2: get the max value from the maxheap...The max value gives us the clue that the line crosses through less bricks --> (width of wall - maximum gaps)
	        //int result = wall.size() - maxval;
	        int result = wall.size() - maxnum;
	        return result;	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]
		//[[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		List list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(1);
		
		List list2 = new ArrayList();
		list2.add(3);
		list2.add(1);
		list2.add(2);
		
		List list3 = new ArrayList();
		list3.add(1);
		list3.add(3);
		list3.add(2);
		
		List list4 = new ArrayList();
		list4.add(2);
		list4.add(4);
		
		List list5 = new ArrayList();
		list5.add(3);
		list5.add(1);
		list5.add(2);
		
		List list6 = new ArrayList();
		list6.add(1);
		list6.add(3);
		list6.add(1);
		list6.add(1);
		
		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		list.add(list5);
		list.add(list6);
		
		//System.out.println(list);
		//System.out.println("size of list: " +list.size());
		
		BrickWall bw = new BrickWall();
		int result = bw.leastBricks(list);
		System.out.println("Result = " + result);
		

	}

}
