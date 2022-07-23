package Stack;

import java.util.Stack;

public class ValidPrantheses {
	  public boolean isValid(String s) {
	     
		  Stack<Character> stack = new Stack<>();
	        for(int i = 0; i < s.length(); i++) {
	            char a = s.charAt(i);
	            if(a == '(' || a == '[' || a == '{') stack.push(a);
	          //below else if is to check s is not odd
	            else if(stack.empty()) return false;
	            else if(a == ')' && stack.pop() != '(') return false;
	            else if(a == ']' && stack.pop() != '[') return false;
	            else if(a == '}' && stack.pop() != '{') return false;
	        }
	        return stack.empty();
	    }
}
