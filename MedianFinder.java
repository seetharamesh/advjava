package advjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 
 * ["MedianFinder","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian"]
[[],[6],[],[10],[],[2],[],[6],[],[5],[],[0],[],[6],[],[3],[],[1],[],[0],[],[0],[]]
 * 
 * 
 * my output
 * [null,null,6.00000,null,8.00000,null,10.00000,null,6.00000,null,2.00000,null,4.00000,null,6.00000,null,5.50000,null,5.00000,null,2.50000,null,0.00000]
 * 
 * expected
 * [null,null,6.00000,null,8.00000,null,6.00000,null,6.00000,null,6.00000,null,5.50000,null,6.00000,null,5.50000,null,5.00000,null,4.00000,null,3.00000]
 * 
 * */




class MedianFinder {
	List<Integer> arr;
    /** initialize your data structure here. */
    public MedianFinder() {
        arr = new ArrayList<>();
        
      
    }
    
    public void addNum(int num) {
    	arr.add(num);
        
    }
    
    public double findMedian() {
    	double mid_val =0d;
    	int len = arr.size();
    	
    	if(len == 0) return 0d;
    	if(len == 1) return arr.get(0);
    	if(len == 2) {
    		System.out.println(arr.get(0));
    		System.out.println(arr.get(1));

    		mid_val = (arr.get(0) + arr.get(1))/2d;
    		return mid_val;
    	}
    	Collections.sort(arr);
    	//for len 4 and above evens
    	if(len % 2 == 0) {
        	//list is even sized
    		int val = len/2;
    		double mid = arr.get(val);
    		double midleft = arr.get(val-1);
    		mid_val = (mid + midleft)/2;
    		
        }
        else {
        	//list is odd sized
        	mid_val = arr.get(arr.size()/2);
        	System.out.println("Median is: " + mid_val);
        }
        return mid_val;
    }
    
    public static void main(String[] args) {
    	MedianFinder obj = new MedianFinder();
    	int num = 1;
    	obj.addNum(num);
    	 num = 2;
    	 obj.addNum(num);
//    	 num = 3;
//    	 obj.addNum(3);
//    	 obj.addNum(4);
    	
    	double param_2 = obj.findMedian();
    	System.out.println("Median is: " + param_2);

    }
    
    
    
    
    
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */