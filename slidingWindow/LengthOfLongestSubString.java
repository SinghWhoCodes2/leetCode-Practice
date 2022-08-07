package slidingWindow;

import java.util.HashMap;

public class LengthOfLongestSubString {
	  public int lengthOfLongestSubstring(String s) {
	        HashMap<Character, Integer> map=new HashMap<Character,Integer>();
	  
	        int leftPointer=0;
	        int rightPointer=0;
	        int n=s.length();
	        int len=0;
	        while (rightPointer<n) {
				if (map.containsKey(s.charAt(rightPointer))) {
					leftPointer=Math.max(map.get(s.charAt(rightPointer))+1, leftPointer);
				}
				
				map.put(s.charAt(rightPointer), rightPointer);
				len=Math.max(len, rightPointer-leftPointer+1);
				
				rightPointer++;
			}
	  return len;
	  }
}
