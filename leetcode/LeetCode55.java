package leetcode;

public class LeetCode55 {
	
	//Ì°ĞÄËã·¨
    public boolean canJump(int[] nums) {
    	int current = 0;
    	for (int i = 0; i < nums.length-1; i++) {
			current = Math.max(current-1, nums[i]);
			if (current == 0) return false;
    	}
    	return true;
    }
}
