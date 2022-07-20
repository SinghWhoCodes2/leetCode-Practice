package com.nav;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
	 public int longestConsecutive(int[] nums) {
	        //best approach
		 // create a set and add all the array elements to it 
		 // this set will be used to check that set contains next number of sequence
		 //now create the result variable which is counter of longest sequence
		 //iterate over nums array
		 //check hashset contains previous num for example if there is 1 in array 
		 //then it will check 0 exist in set
		 //if set does not contain num-1
		 //iterate till set contain num+1  example 2,3......
		 //in end we have tp return longest streak which is compared after the end while loop
		 //longestStreak=Math.max(currentStreak, longestStreak);  
		 Set<Integer> hashSet=new HashSet<>(); 
		  
		  for (int num : nums) {
			hashSet.add(num);
		}
		 
		  int longestStreak=0;
		  for (int num : nums) {
			if (!hashSet.contains(num-1)) {
				int currentNum=num;
				int currentStreak=1;
				
				while (hashSet.contains(currentNum+1)) {
					currentNum+=1;
					currentStreak+=1;
					
				}
				
				longestStreak=Math.max(currentStreak, longestStreak);
				
			}
		}
		  return longestStreak;
	    }
}
