package binarySearchAlgo;

public class FindMin {
	 public int findMin(int[] nums) {
		 //https://youtu.be/Eww5UFfjxsc
		 int left=0;
		 int right=nums.length-1;
		 
	if (nums.length==1) {
		return nums[0];
	}   
	
	if (nums[left]<nums[right]) {
		return left;
	}
		 while (left<=right) {
			
			 int mid=left+(right-left)/2;
			 if (nums[mid]> nums[right] && nums[mid]>0 ) {
				left=mid+1;
			} else {
              right=mid-1;
			}
			 
		}
		 return  Math.min(nums[left], nums[right]);
		 
	    }
	
}
