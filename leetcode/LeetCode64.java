package leetcode;



public class LeetCode64 {
	
	 public int minPathSum(int[][] grid) {
			 	int m = grid.length - 1;
			 	int n = grid[0].length - 1; 
		 		int[][] dp = new int[m+1][n+1];
		 		dp[0][0]=grid[0][0];
		 	    for (int i = 1; i <= n; i++) {
		 	    	dp[0][i] = dp[0][i-1] + grid[0][i];
		 	    }
		        for (int i = 1; i <= m; i++) {
		        	dp[i][0] = dp[i-1][0] + grid[i][0];
		        }
		        for (int i = 1; i <= m; i++) {
		            for (int j = 1; j <= n; j++) {
		                dp[i][j] = Math.min(dp[i - 1][j] +grid[i][j] , dp[i][j - 1]+ grid[i][j]);
		            }
		        }
		        return dp[m][n];  

	    }
	 public static void main(String[] args) {
		 int[][] grid = new int[][] {{1,3,1},{1,5,1},{4,2,1}};
		 LeetCode64 leetCode64 = new LeetCode64();
		 System.out.println(leetCode64.minPathSum(grid));
	}

}
