package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode128 {
	 
	//800ms
	 public int longestConsecutive(int[] nums) {
		 if(nums.length ==0)return 0;
		 int maxConsecutive = 1;
		
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		 for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
			int tempConsecutive = 1;
			int k = 1;
			while(map.containsKey(nums[i]+k)){
				tempConsecutive++;
				maxConsecutive = Math.max(maxConsecutive, tempConsecutive);
				k++;
			}
			k=1;
			while(map.containsKey(nums[i]-k)){
				tempConsecutive++;
				maxConsecutive = Math.max(maxConsecutive, tempConsecutive);
				k++;
			}

		}
	        
		 return maxConsecutive;
	    }
	 
	 
	 //6ms
	  public int longestConsecutive1(int[] nums) {
	        Set<Integer> num_set = new HashSet<Integer>();
	        for (int num : nums) {
	            num_set.add(num);
	        }

	        int longestStreak = 0;

	        for (int num : num_set) {
	            if (!num_set.contains(num-1)) {
	                int currentNum = num;
	                int currentStreak = 1;

	                while (num_set.contains(currentNum+1)) {
	                    currentNum += 1;
	                    currentStreak += 1;
	                }

	                longestStreak = Math.max(longestStreak, currentStreak);
	            }
	        }

	        return longestStreak;
	    }



}
