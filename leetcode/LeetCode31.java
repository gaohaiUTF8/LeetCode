package leetcode;

public class LeetCode31 {
	
	public static void nextPermutation(int[] nums) {
	int i = nums.length - 2;
	int j = nums.length - 1;
	int k = nums.length - 1;
	
	while(i >= 0 && nums[i] >= nums[j]) {
		i--;
		j--;
	}
	if(i>=0) {
	while(nums[k]<=nums[i]) {
		k--;
		}
	
	int temp = nums[i];
	nums[i] = nums[k];
	nums[k]= temp;
	}

    int left = j,right = nums.length-1;
    while(left<right){
        int temp = nums[left];
        nums[left++] = nums[right];
        nums[right--] = temp;
    }
	
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1};
		nextPermutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
}
