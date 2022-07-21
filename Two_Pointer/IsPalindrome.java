package com.nav;

public class IsPalindrome {
	 public boolean isPalindrome(String s) {
		 String processedString="";
	        for (char c : s.toCharArray()) {
				if (Character.isDigit(c)|| Character.isLetter(c)) {
					processedString+=c;
					
				}
			}
	        processedString=processedString.toLowerCase();
	        int first_Pointer=0;
	        int sec_Pointer=processedString.length()-1;
	        
	        while (first_Pointer<=sec_Pointer) {
				if (processedString.charAt(first_Pointer)!=processedString.charAt(sec_Pointer)) {
					return false;
			
				}
             first_Pointer+=1;
             sec_Pointer-=1;
			}
	        return true;
	    }
}
