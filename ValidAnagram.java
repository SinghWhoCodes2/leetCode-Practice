package com.nav;

public class ValidAnagram {

	//best implementation with time and space complexity O(n)
	public static boolean isAnagram(String s, String t) {
			if (s.length()!=t.length()) {
				return false;
			}
			int [] charCounter= new int [26];
			 for (int i = 0; i < s.length(); i++) {
				charCounter[s.charAt(i)-'a']++;
				charCounter[t.charAt(i)-'a']--;
				
			}
			 for (int i : charCounter) {
				if (i!=0) {
					  return false;
				}
			
			}
				return true;
		}
		
		
	
	
		public static void main(String[] args) {
			
			String s = "anagram";
			String t = "nagaram";
			System.out.println(isAnagram(s,t));
		
		}

		
	
	
}
