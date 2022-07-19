package com.nav;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
	
	//best explanation of hashmap https://youtu.be/NNBQik4phMI
	
	 public static List<List<String>> groupAnagrams(String[] strs) {
		 
	        List<List<String>> resList=new ArrayList<>();
	        if (strs==null) {
				return resList;
			}
		 HashMap<HashMap<Character, Integer>, List<String>> bMap=new HashMap<>();
		 for (String str : strs) {
			HashMap<Character, Integer> freqHashMap=new HashMap<>();
			for (int i = 0; i < str.length(); i++) {
				char ch=str.charAt(i);
				freqHashMap.put(ch, freqHashMap.getOrDefault(ch, 0)+1);
			}
			if (bMap.containsKey(freqHashMap)==false) {
				List<String> list=new ArrayList<>();
				list.add(str);
				bMap.put(freqHashMap, list);
				
			}
			else {
				List<String> list= bMap.get(freqHashMap);
				list.add(str);
				
				
			}
		}
		 for (List<String> list :bMap.values()) {
			resList.add(list);
		}
		 return resList;
	    }
	 public static void main(String[] args) {
			
			String [] strs= {"eat","tea","tan","ate","nat","bat"}; 
			System.out.println(	groupAnagrams(strs));
	
		
		}


}
