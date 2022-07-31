package binarySearchAlgo;

public class SearchMatrix {
	 public boolean searchMatrix(int[][] matrix, int target) {
	        int row=matrix.length;
	        int col=matrix[0].length;
	        if (matrix.length==0) {
				return false;
			}
	    
	        int left=0;
	        int right=row*col-1;
	        
	        while (left<=right) {
				
	        	int midpoint=left+(right-left)/2;
	        	int midptVal=matrix[midpoint/col][midpoint%col];
	        	if (midptVal==target) {
					return true;
				}else if (midptVal<target) {
					left=midpoint+1;
				}else if (midptVal>target) {
					right=midpoint-1;
				}
	        	
			}
	        
	        
	 
	 return false;
	 }
}
