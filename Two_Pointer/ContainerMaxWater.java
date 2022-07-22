package com.nav;

public class ContainMaxWater {
	   public int maxArea(int[] height) {
		   
		   //Best Explanation https://youtu.be/TI3e-17YAlc
		   
		   //Best Solution with Space: O(1) and Time complexity :O(n)
		   
		   int max_area=0;
		   int lo=0;
		   int hi=height.length-1;
		   
		   while (lo<hi) {
			if (height[lo]<height[hi]) {
				max_area=Math.max(max_area, height[lo]*(hi-lo));
				lo+=1;
			}else {
				max_area=Math.max(max_area, height[hi]*(hi-lo));
				hi-=1;
			}
		}
		   
		   return max_area;
		   
//	        int maxArea=0;
//	       
//		   // brute force time complexity: O(n^2)  Space Complex :O(1)
		   
//		  for (int i = 0; i < height.length; i++) {
//			for (int j =i+1; j < height.length; j++) {
//				//we calculate min height because if j is greater than i then water will over flow 
//				//water will left till min height
//				int minHeight=Math.min(height[i], height[j]);
//				maxArea=Math.max(maxArea,minHeight*(j-i) );
//			}
//			
//			}
//		  return maxArea;
		   
		   
		   
		  
		   
		
	    }
}
