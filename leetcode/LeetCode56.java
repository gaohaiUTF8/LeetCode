package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LeetCode56 {
	 public int[][] merge(int[][] intervals) {
	        List<int[]> res = new ArrayList<>();
	        if (intervals == null || intervals.length == 0)
	            return res.toArray(new int[0][]);

	        // Arrays.sort(intervals, (a, b) -> a[0] - b[0]);// a[0] - b[0]����0�ͽ���˳��
	        // ���ݶ�ά�����һ�����ִ�С��ÿһ����������
	        Arrays.sort(intervals, new Comparator<int[]>() {
	            @Override
	            public int compare(int[] o1, int[] o2) {
	                // TODO Auto-generated method stub
	                return o1[0] - o2[0];
	            }
	        });
	        int i = 0;
	        while (i < intervals.length) {
	            int left = intervals[i][0];
	            int right = intervals[i][1];
	            // i���ܵ����һ��,����ҪС��(����ĳ��� - 1)
	            // �ж������е�right����һ�е�left��С,��right���½��и����ֵ,֮���ٲ��Ͻ���whileѭ���ж�
	            while (i < intervals.length - 1 && right >= intervals[i + 1][0]) {
	                
	            	//ע����i++����ʱintervals[i]�Ǽӹ���
	            	i++;
	                right = Math.max(right, intervals[i][1]);
	            }
	            res.add(new int[] { left, right });
	            i++;
	        }
	        return res.toArray(new int[0][]);
	    }
	 
	 
	 public static void main(String[] args) {
		LeetCode56 leetCode56 = new  LeetCode56();
		int[][] intervals=new int[][] {{1,2},{2,3},{4,6}};
		intervals = leetCode56.merge(intervals);
		System.out.print(0);
	}
	 
	
	



}
