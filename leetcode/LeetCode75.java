package leetcode;



public class LeetCode75 {
	   
		public void sortColors(int[] nums) {
			int left = 0;
			int right = nums.length - 1;
			int curr = 0;
			while(curr <= right) {
				if (nums[curr] == 2) {
					swap(nums, right, curr);
					right--;
				}
				else if (nums[curr] == 0) {
					swap(nums, left, curr);
					left++;
					curr++;

				}
				else {
					curr++;

				}
			}
							
			

		}
		
		public  void  swap(int[]nums,int a,int b) {
			int temp = nums[b];
			nums[b] = nums[a];
			nums[a] = temp;
		}
		
		public static void main(String[] args) {
			LeetCode75 leetCode75 = new LeetCode75();
			int[] arr = new int[] {1,2,0,1};
			leetCode75.sortColors(arr);
			for (Integer integer : arr) {
				System.out.println(integer);
			}
		}

}
