package leetcode;

public class LeetCode33 {
	
	/*
	 *    ��ĿҪ�� O(logN)O(logN) ��ʱ�临�Ӷȣ��������Զ϶���������Ҫʹ�ö��ֲ��ң���ô���ǹؼ���
		������Ŀ˵���������ظ����ٸ����ӣ�
		1 2 3 4 5 6 7 ���Դ��·�Ϊ���࣬
		��һ�� 2 3 4 5 6 7 1 ���֣�Ҳ���� nums[start] <= nums[mid]���������о��� 2 <= 5��
		��������£�ǰ�벿������������ nums[start] <=target<nums[mid]������ǰ�벿���ң�����ȥ��벿���ҡ�
		�ڶ��� 6 7 1 2 3 4 5 ���֣�Ҳ���� nums[start] > nums[mid]���������о��� 6 > 2��
		��������£���벿������������ nums[mid] <target<=nums[end]�����ں�벿���ң�����ȥǰ�벿���ҡ�

	 * 
	 */
	public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //ǰ�벿������,ע��˴���С�ڵ���
            if (nums[start] <= nums[mid]) {
                //target��ǰ�벿��
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target <= nums[end] && target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;

    }



}
