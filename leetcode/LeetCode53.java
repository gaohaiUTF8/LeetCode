package leetcode;

public class LeetCode53 {
	
	 public int maxSubArray(int[] nums) {
		 
		 int left = 0;
		 int right = 0;
		 int currentSum = 0;
		 int maxSum = Integer.MIN_VALUE;
		 while(right < nums.length) {
			
			 currentSum = currentSum + nums[right];
			 maxSum = Math.max(maxSum, currentSum);
			 
			 if (currentSum < 0) {
				left = right;
				right++;
				currentSum = 0;
			}
			 else {	
				
				right++;
			}

		 }
		 return maxSum;
		
		 
		 

	 }
	 public static void main(String[] args) {
		LeetCode53 leetCode53 = new LeetCode53();
		System.out.println(leetCode53.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}

}
