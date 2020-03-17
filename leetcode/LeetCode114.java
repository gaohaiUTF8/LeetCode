package leetcode;



public class LeetCode114 {
	   public void flatten(TreeNode root) {
		    while (root != null) { 
		        //������Ϊ null��ֱ�ӿ�����һ���ڵ�
		        if (root.left == null) {
		            root = root.right;
		        } else {
		            // �����������ұߵĽڵ�
		            TreeNode pre = root.left;
		            while (pre.right != null) {
		                pre = pre.right;
		            } 
		            //��ԭ�����������ӵ������������ұ߽ڵ�
		            pre.right = root.right;
		            // �����������뵽�������ĵط�
		            root.right = root.left;
		            root.left = null;
		            // ������һ���ڵ�
		            root = root.right;
		        }
		    }

	   }

}
