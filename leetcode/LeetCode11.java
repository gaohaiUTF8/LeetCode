package leetcode;

public class LeetCode11 {


	    public int maxArea(int[] height) {
		int L = 0;
		int R = height.length - 1;
		int maxArea = 0;
		while(L<R) {
			maxArea = Math.max(maxArea, Math.min(height[L],height[R])*(R-L));
			if (height[L] > height[R]) {
				R--;
			}
			else {
				L++;
			}
		}
    	
    	
    	return maxArea;

	    }
}

	    
	


