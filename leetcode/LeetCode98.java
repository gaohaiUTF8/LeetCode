package leetcode;

import java.util.Stack;

;



public class LeetCode98 {

	
   	int temp = -1;
    public boolean isValidBST(TreeNode root) {
    	
		TreeNode p = root;
		Stack<TreeNode> stack = new Stack<>();
		
		while(p != null || !stack.empty()) {
			if(p != null) {
				stack.add(p);
				p = p.left;
			}
			
			else {
				p = stack.pop();
				if(temp == -1) {
					temp = p.val;
				}
				else {
					if (temp >= p.val) {
						return false;
					}
					else {
						temp = p.val;
					}
				}
				p = p.right;
			}
		}
		return true;


    }
    	

}
    
    



