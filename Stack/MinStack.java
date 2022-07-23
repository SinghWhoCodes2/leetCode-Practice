package Stack;
import java.util.Stack;

public class MinStack {
	
	
	  Stack<Integer> stack=new Stack<>();
	   Stack<Integer> minStack=new Stack<>();
	    
	    public void push(int val) {
	    	
	    	if (minStack.isEmpty()||minStack.size()> 0 && val<minStack.peek()) {
				minStack.push(val);
			}else{
	            minStack.push(minStack.peek());
	        }
	        stack.push(val);
	    }
	    
	    public void pop() {
	    	
				
				minStack.pop();
			
	    	stack.pop();
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    
	    public int getMin() {
	        return minStack.peek();
	    }
}

