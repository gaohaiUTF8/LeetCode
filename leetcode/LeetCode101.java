package leetcode;



public class LeetCode101 {
	public boolean isSymmetric(TreeNode root) {
		return helper(root, root);


    }
	
	public boolean helper(TreeNode t1,TreeNode t2) {
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;
		return (t1.val == t2.val)
			&& helper(t1.right, t2.left)
			&& helper(t1.left,  t2.right);
		
		
	}

}
