package advjava;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinderTimeEfficient{
Queue<Double> max;
Queue<Double> min;
/** initialize your data structure here. */
public MedianFinderTimeEfficient() {
    max = new PriorityQueue<>(Collections.reverseOrder());//descending
    min = new PriorityQueue<>(); //default - ascending
}

public void addNum(int num) {
    max.offer((double)num);
    min.offer(max.poll());
    if (max.size() < min.size()) max.offer(min.poll());
}

public double findMedian() {
    if (max.size() == 0) return 0;
    else if(max.size() == min.size()) return (max.peek() + min.peek()) / 2;
    return max.peek();
}
    public static void main(String[] args) {
    	 MedianFinderTimeEfficient obj = new MedianFinderTimeEfficient();
    	 obj.addNum(10);
    	 obj.addNum(8);
    	 obj.addNum(6);
    	 obj.addNum(5);
    	 obj.addNum(4);

    	double param_2 = obj.findMedian();
    	System.out.println("median: " + param_2);
    }
    
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */