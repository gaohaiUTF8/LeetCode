package leetcode;

public class LeetCode104 {
	  int depth = 0;
	  public int maxDepth(TreeNode root) {
		    if (root ==null) return 0;
		  	helper(root, 1);
		  	return depth;
	   }
	  

	   public void helper(TreeNode root,int curDepth) {
		  if (depth <= curDepth) depth = curDepth;
		  if (root.left != null) {
			  helper(root.left, curDepth+1);
		  }
		  if (root.right != null) {
			  helper(root.right, curDepth+1);
		  }
		   
	}
}
