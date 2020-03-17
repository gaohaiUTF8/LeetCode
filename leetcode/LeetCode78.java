package leetcode;

import java.util.List;
import java.util.ArrayList;

public class LeetCode78 {
	
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<Integer>());
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
    
    
    
    
    public static void main(String[] args) {
		LeetCode78 leetCode78 = new LeetCode78();
		int[] nums = new int[] {1,2,3};
		for(List list : leetCode78.subsets(nums)) {
			System.out.println(list);
		};
	}



}
