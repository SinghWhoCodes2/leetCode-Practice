package Stack;




import java.util.Stack;

public class DailyTemperature {
public int[] dailyTemperatures(int[] temperatures) {
    int len=    temperatures.length;
	//https://youtu.be/ekFs9Nb2RNQ best explanation 
	int[] result=new int[len];
        
        Stack<Integer> stack=new Stack<>();
        
        for (int i = len-1; i >=0; i--) {
			
        	while (!stack.isEmpty() && temperatures[i]>=temperatures[stack.peek()]) {
				stack.pop();
			}
        	
        	if (!stack.isEmpty()) {
				result[i]=stack.peek()-i;
			}
        	stack.push(i);
		}
        
        
        
        
        return result;
    }
}

