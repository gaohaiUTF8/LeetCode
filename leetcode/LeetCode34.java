package leetcode;


public class LeetCode34 {
	
	public static int[] searchRange(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		if (nums == null && nums.length == 1) {
			return new int[] {-1,-1};
		}

		while(start < end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return expendRange(nums, mid);
			}
			
			if (nums[mid] < target ){
				start = mid + 1; 
			}
			else {
				end = mid -1;
			}
		}
		
		
		return new int[] {-1,-1};

    }
	
	
	public static int[] expendRange(int[] nums, int location) {
		int i = location;
		int j = location;
		while(nums[i+1] == nums[location]) {
			i++;
		}
		while(nums[j-1] == nums[location]) {
			j--;
		}
		int[] ans = new int[i-j + 1];
		for(int k = 0;k < i - j + 1; k++) {
			ans[k] = k + j ;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1};
		int[] ans = searchRange(arr, 1);
		for(Integer i : ans) {
			System.out.println(i);
		}
	}

}


