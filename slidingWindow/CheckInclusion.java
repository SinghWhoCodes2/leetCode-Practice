package slidingWindow;

import java.util.Arrays;

public class CheckInclusion {

//	 public boolean checkInclusion(String s1, String s2) {
//	        
//	        if (s1.length() > s2.length())
//	            return false;
//	        
//	        
//	        int[] s1map = new int[26];
//	        
//	        for (int i = 0; i < s1.length(); i++)
//	            s1map[s1.charAt(i) - 'a']++;
//	        
//	        for (int i = 0; i <= s2.length() - s1.length(); i++) {
//	            int[] s2map = new int[26];
//	            for (int j = 0; j < s1.length(); j++) {
//	                s2map[s2.charAt(i + j) - 'a']++;
//	            }
//	            if (matches(s1map, s2map))
//	                return true;
//	        }
//	        return false;
//	    }
//	    
//	    public boolean matches(int[] s1map, int[] s2map) {
//	        for (int i = 0; i < 26; i++) {
//	            if (s1map[i] != s2map[i])
//	                return false;
//	        }
//	        return true;
//	    }
	
	public boolean checkInclusion(String s1, String s2) {
        
		if (s1.length() > s2.length() || s2.length() == 0) return false;
       
        
        if (s1.length() == 0) return true;
        
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for (int i = 0;i < s1.length();i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }
        
        for (int i = s1.length();i < s2.length();i++) {
        	
            if (Arrays.equals(arr1, arr2)) return true;
            
            arr2[s2.charAt(i-s1.length()) - 'a']--;
            arr2[s2.charAt(i) - 'a']++;
        }
     
     
        if (Arrays.equals(arr1, arr2)) return true;
     
     
        else return false;
    }
	
	
	
	
	
}
