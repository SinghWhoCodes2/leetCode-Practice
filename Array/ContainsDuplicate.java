package Array;

import java.util.Arrays;
import java.util.HashSet;




public class ContainsDuplicate {
	
	
	//best implementation with time and space complexity O(n)
	public static boolean conatainsDuplicate(int[] nums) {
		HashSet<Integer> numberSet=new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (numberSet.contains(nums[i])) return true;
		numberSet.add(nums[i]);
		
		}
       return false;		
	}
	
	
	//time complex O(nLogn)  space O(1)
	public static boolean conatainDuplicate(int[] nums) {
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]==nums[i+1]) return true;
		}
       return false;		
	}
	public static void main(String[] args) {
		
		int [] nums= {1,2,3,1}; 
		int [] num= {1,2,3};
		System.out.println(conatainsDuplicate(nums));
		System.out.println(conatainDuplicate(num));
	}

	
	
}



