package com.nav;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	//best implementation with time and space complexity O(n)
		public static int[] twoSum(int[] nums, int target) {
			for (int i = 0; i < nums.length; i++) {
				for (int j = i+1; j < nums.length; j++) {
					int compliment=target-nums[i];
					if (nums[j]==compliment) {
						int [] arr=new int[] {i,j}; 
						System.out.println(arr[0]+" "+arr[1]);
						return new int[] {i,j};
						
					}
				}
			}
			
	       		throw new IllegalArgumentException("no match found");
		}
		
		public static int[] twoSums(int[] nums, int target) {
			Map<Integer, Integer> numMap=new HashMap<>();
			
			for (int i = 0; i < nums.length; i++) {
				
				int complement=target-nums[i];
				
				if (numMap.containsKey(complement)) {
					return new int [] {numMap.get(complement),i};
				}
				numMap.put(nums[i], i);
				}
			
			
	       		throw new IllegalArgumentException("no match found");
		}
	
		
		public static void main(String[] args) {
			
			int [] nums= {1,2,3,1}; 
			
		twoSum(nums, 4);
		
		}

	
}
