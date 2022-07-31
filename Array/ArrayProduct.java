package com.nav;


public class ProductOfArray {
	 
	 public int[] productExceptSelf(int[] nums) {
	        
		 int len=nums.length;
		

		 int[] resArr=new int[len];
		 
		 resArr[0]=1;
		 
		 for (int i = 1; i < len; i++) {
			resArr[i]=nums[i-1] * resArr[i-1];
			
		}
		 
		 int res=1;
		 
		 for (int i = len-1; i >=0; i--) {
			resArr[i]=resArr[i] * res;
			res=res*nums[i];
			
		}		 
		 
	
		 return resArr;
		 
		 
		 
		 
		 
		 //Another implementation which have Space complexity O(n^2)
		 //using extra arrays two arrays
		 
//		 int[] leftProduct=new int[len];
//		 int[] rightProduct=new int[len];
//
//		 int[] resArr=new int[len];
//		 
//		 
//		 leftProduct[0]=1;
//		 rightProduct[len-1]=1;
//		 for (int i = 1; i < len; i++) {
//			leftProduct[i]=nums[i-1] * leftProduct[i-1];
//			
//		}
//		 
//		 for (int i = len-2; i < len; i++) {
//			rightProduct[i]=nums[i+1] * rightProduct[i+1];
//			
//		}		 
//		 
//		 for (int i = 0; i < len; i++) {
//			resArr[i]=leftProduct[i]*rightProduct[i];
//			
//		}
//		 return resArr;
		 
	    }
}

