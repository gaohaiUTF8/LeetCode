package leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class LeetCode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList(); 
        List<List<Integer>> ans = new ArrayList();
        
        if(root==null)return ans;
        TreeNode p = root;
        queue.add(root);
        while(!queue.isEmpty()) {
        	List<Integer> temp = new ArrayList<Integer>();
        	//若不定义levelSize，每次循环体内会影响queue. size变化
        	int levelSize=queue.size();
        	for(int i=0;i < levelSize;i++) {
	        	p = queue.poll();
	        	temp.add(p.val);
	        	if (p.left != null) {
					queue.add(p.left);
				}
	        	if (p.right != null) {
	        		queue.add(p.right);
				}
        
        	}
        	ans.add(temp);
       }
        return ans;
    }
    
  

}
