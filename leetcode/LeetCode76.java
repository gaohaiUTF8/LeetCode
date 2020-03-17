package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode76 {
    
	public String minWindow(String s, String t) {
			
	    if (s.length() == 0 || t.length() == 0) {
	          return "";
	      }
	      
		Map<Character,Integer> map1 = new HashMap<Character,Integer>();
		for (int i = 0; i < t.length(); i++) {
			int count = map1.getOrDefault(t.charAt(i), 0);
			map1.put(t.charAt(i), count+1);
		}

		 Map<Character, Integer> windowMap= new HashMap<Character, Integer>();
		int left = 0;
		int right = 0;
		//记录遍历window时，map1已遍历个数
		int formed = 0;
		
		int required = map1.size();
		
		// ans list of the form (window length, left, right)
		int[] ans = {-1, 0, 0};
		 
		while (right < s.length()) {
			char c = s.charAt(right);
	        int count = windowMap.getOrDefault(c, 0);
	        windowMap.put(c, count + 1);
	          
	        if (map1.containsKey(c) && windowMap.get(c).intValue() == map1.get(c).intValue()) {
	              formed++;
	        }
	        
	        while (left <= right && formed == required) {
	              c = s.charAt(left);
	              // Save the smallest window until now.
	              if (ans[0] == -1 || right - left + 1 < ans[0]) {
	                  ans[0] = right - left + 1;
	                  ans[1] = left;
	                  ans[2] = right;
	              }

	              // The character at the position pointed by the
	              // `Left` pointer is no longer a part of the window.
	              windowMap.put(c, windowMap.get(c) - 1);
	              if (map1.containsKey(c) && windowMap.get(c).intValue() < map1.get(c).intValue()) {
	                  formed--;
	              }

	              // Move the left pointer ahead, this would help to look for a new window.
	              left++;
	          }
	        
	        

	          // Keep expanding the window once we are done co***acting.
	          right++;   
	      }

	      return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
	  }




}
