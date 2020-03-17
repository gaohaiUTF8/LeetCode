package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode94 {
		
	
			public List<Integer> inorderTraversal(TreeNode root) {
				
				List<Integer> res = new ArrayList<Integer>();
				TreeNode p = root;
				Stack<TreeNode> stack = new Stack<>();
				
				while(p != null || !stack.empty()) {
					if(p != null) {
						res.add(p.val);
						stack.add(p);
						p = p.left;
					}
					
					else {
						p = stack.pop();
						p = p.right;
					}
				}
		        return res;
		
		    }
			
			
/*
 * µÝ¹é°æ
 *  List<Integer> res = new ArrayList<Integer>();
   	public List<Integer> inorderTraversal(TreeNode root) {
				if (root==null) return res;
				
				if(root.left !=null){inorderTraversal(root.left);}
				res.add(root.val);
				if(root.right !=null){inorderTraversal(root.right);}	
				return res;
			}
 * 
 * 
 * 
 */
			
			
			
			
			public class TreeNode {
				     int val;
				     TreeNode left;
				     TreeNode right;
				     TreeNode(int x) { val = x; }
	}

}
