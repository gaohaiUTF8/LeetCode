package leetcode;

import java.util.List;

public class TestLeetCode39 {
	public static void main(String[] args) {
		int[] arr = new int[] {2,3,6,7};
		LeetCode39 leetCode39 = new LeetCode39();
		List<List<Integer>> list= leetCode39.combinationSum(arr, 7);
		for (List<Integer> l :list) {
			for(Integer integer : l) {
				System.out.println(integer);
			}
		}
	}
}
