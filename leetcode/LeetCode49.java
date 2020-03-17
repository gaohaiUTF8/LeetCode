package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode49 {
	public List<List<String>> groupAnagrams(String[] strs) {
		
		List<List<String>> ans = new ArrayList<List<String>>();
		Map<String, List> map = new HashMap<String, List>();
		
		for (String s : strs) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String key = String.valueOf(c);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList());
			}
			map.get(key).add(s);
			
		}
		ans = new ArrayList(map.values());
		
		return ans;
	}
    



}
