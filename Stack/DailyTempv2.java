package Stack;



import java.util.Stack;

public class DailyTempv2 {
	//https://youtu.be/vhUxKxiconE best explanation
	 public int largestRectangleArea(int[] heights) {
	    
		 int ans=0;
		 int ps[]=previousSmall(heights);
		 int ns[]=nextSmall(heights);
		 
		 for (int i = 0; i < heights.length; i++) {
			ans=Math.max(ans, (ns[i]-ps[i]-1)*heights[i]);
		}
		 
		 
		return ans;
	    }

	 public  int[] previousSmall(int[] heights) {
		
		 int len=heights.length;
		 Stack<Integer> stack=new Stack<>();
		 int [] result=new int[len];
		 
		 for (int i = 0; i < heights.length; i++) {
			while (!stack.isEmpty() && heights[i]<=heights[stack.peek()]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
			result[i]=-1;
			}else {
				result[i]=stack.peek();
			}
			stack.push(i);
		}
		 
		 
		 
		return result;
	}

	 public  int[] nextSmall(int[] heights) {
		// TODO Auto-generated method stub
				 int len=heights.length;
				 Stack<Integer> stack=new Stack<>();
				 int [] result=new int[len];
				 
				 for (int i = len-1; i >=0; i--) {
					while (!stack.isEmpty() && heights[stack.peek()]>=heights[i]) {
						stack.pop();
					}
					if (stack.isEmpty()) {
					result[i]=len;
					}else {
						result[i]=stack.peek();
					}
					stack.push(i);
				}
				 
				 
				 
				return result;
	}
	 
	 
}

