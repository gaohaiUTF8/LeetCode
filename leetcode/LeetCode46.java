package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode46 {




	    public List<List<Integer>> permute(int[] nums) {
	        // ����������
	        int len = nums.length;
	        // ʹ��һ����̬���鱣�����п��ܵ�ȫ����
	        List<List<Integer>> res = new ArrayList<>();

	        if (len == 0) {
	            return res;
	        }

	        boolean[] used = new boolean[len];
	        List<Integer> path = new ArrayList<>();

	        dfs(nums, len, 0, path, used, res);
	        return res;
	    }

	    private void dfs(int[] nums, int len, int depth,
	                     List<Integer> path, boolean[] used,
	                     List<List<Integer>> res) {
	        if (depth == len) {
	            res.add(new ArrayList<Integer>(path));
	            return;
	        }

	        for (int i = 0; i < len; i++) {
	            if (!used[i]) {
	                path.add(nums[i]);
	                used[i] = true;

	                dfs(nums, len, depth + 1, path, used, res);
	                // ע�⣺������״̬���ã��Ǵ������ص�ǳ����Ĺ��̣���������ʽ�Ϻ͵ݹ�֮ǰ�ǶԳƵ�
	                used[i] = false;
	                path.remove(path.size() - 1);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3};
	        LeetCode46 solution = new LeetCode46();
	        List<List<Integer>> lists = solution.permute(nums);
	        System.out.println(lists);
	    }
	}




