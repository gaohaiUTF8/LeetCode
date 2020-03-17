package leetcode;

import java.util.Arrays;

public class LeetCode85 {
	
	
	 public int maximalRectangle1(char[][] matrix) {
		 	LeetCode84 leetCode84 = new LeetCode84();

	        if (matrix.length == 0) return 0;
	        int maxarea = 0;
	        int[] dp = new int[matrix[0].length];

	        for(int i = 0; i < matrix.length; i++) {
	            for(int j = 0; j < matrix[0].length; j++) {

	                // update the state of this row's histogram using the last row's histogram
	                // by keeping track of the number of consecutive ones

	                dp[j] = matrix[i][j] == '1' ? dp[j] + 1 : 0;
	            }
	            // update maxarea with the maximum area from this row's histogram
	            maxarea = Math.max(maxarea, leetCode84.largestRectangleArea(dp));
	        } return maxarea;
	    }


	

    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;

        int[] left = new int[n]; // initialize left as the leftmost boundary possible
        int[] right = new int[n];
        int[] height = new int[n];

        Arrays.fill(right, n); // initialize right as the rightmost boundary possible

        int maxarea = 0;
        for(int i = 0; i < m; i++) {
            int cur_left = 0, cur_right = n;
            // update height
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == '1') height[j]++;
                else height[j] = 0;
            }
            // update left
            for(int j=0; j<n; j++) {
                if(matrix[i][j]=='1') left[j]=Math.max(left[j],cur_left);
                else {left[j]=0; cur_left=j+1;}
            }
            // update right
            for(int j = n - 1; j >= 0; j--) {
                if(matrix[i][j] == '1') right[j] = Math.min(right[j], cur_right);
                else {right[j] = n; cur_right = j;}    
            }
            // update area
            for(int j = 0; j < n; j++) {
                maxarea = Math.max(maxarea, (right[j] - left[j]) * height[j]);
            }
       
        }	
        return maxarea;

    }
    
    
    public static void main(String[] args) {
		LeetCode85 leetCode85 = new LeetCode85();
		System.out.println(leetCode85.maximalRectangle1(new char[][] {
			{'1','0','1','0','0'},
			{'1','0','1','1','1'},
			{'1','1','1','1','1'},
			{'1','0','0','1','0'}})); 
	}

}
