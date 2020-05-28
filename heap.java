package medianHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class heap {
	PriorityQueue<Integer> minHeap; // stores value larger than median
	PriorityQueue<Integer> maxHeap; // stores value smaller than median
	int globalMedian;
	public heap(){
		//globalMedian = i;
		minHeap = new PriorityQueue<Integer>();
		maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
	}

	public void add(int i){
		int minLength = minHeap.size();
		int maxLength = maxHeap.size();
		int m = median();
		if(i < m){
			if(maxLength <= minLength){
				maxHeap.add(i);
			}
			else{
				int j = maxHeap.remove();
				minHeap.add(j);
				maxHeap.add(i);
			}
		}
		else{
			if(maxLength >= minLength){
				minHeap.add(i);
			}
			else{
				int j = minHeap.remove();
				minHeap.add(i);
				maxHeap.add(j);
			}
		}
	}

	public int median(){
		int minLength = minHeap.size();
		int maxLength = maxHeap.size();
		if(maxLength >= minLength){
			if(maxLength == 0){
				return Integer.MAX_VALUE;
			}
			else{
				return maxHeap.peek();
			}
		}
		else{
			return minHeap.peek();
		}
	}
}
