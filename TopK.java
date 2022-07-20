package com.nav;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopK {
	
	 public int[] topKFrequent(int[] nums, int k) {
	        
		 //https://www.youtube.com/watch?v=N0Frqx9UlrI best priority queue explaination
		 
		 //TIME COMPLEXITY = O(KlogN)

         //SPACE COMPLEXITY =O(N)
		 
		 //first create frequency map 
		 
		 Map<Integer, Integer> map= new HashMap<>();
		 for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		 
		 //then create Priority que which sort the max 
		//It's defining the 'priority' of the queue to be whichever number ( a or b ) is bigger.
			//It works like this...
			//If (a,b) -> map.get(b) - map.get(a) 
			//- It will start adding elements with their freq in decreasing order (in this case, it will be 3 2 1 (freq))
			//if (a,b) -> map.get(a) - map.get(b)
			//- It will start adding element with their freq in increasing order (in this case, it will be 1 2 3 (freq))
		 
		 Queue<Integer> maxHeap=new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		 
		 //add the key to heap 
		 
		 for (int key : map.keySet()) {
			maxHeap.add(key);
		}
		 
		 //now create final list of k most frequent elements
		 int[] res =new int[k];
		 for (int i = 0; i < k; i++) {
			res[i]=maxHeap.poll();
		}
		 return res;
		 
	    }
	
}

