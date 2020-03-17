package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class LeetCode39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;

        // ������Ϊ����ǰ��ֹ����
        Arrays.sort(candidates);

        dfs(candidates, len, target, 0, new ArrayDeque<>(), res);
        return res;
    }

    /**
     * @param candidates ��������
     * @param len        ��������ĳ��ȣ��������
     * @param residue    ʣ����ֵ
     * @param begin      ��������������±�
     * @param path       �Ӹ���㵽�������·��
     * @param res        ���������
     */
    private void dfs(int[] candidates,
                     int len,
                     int residue,
                     int begin,
                     Deque<Integer> path,
                     List<List<Integer>> res) {
        if (residue == 0) {
            // ���� path ȫ��ֻʹ��һ�ݣ���Ҷ�ӽ���ʱ����Ҫ��һ������
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < len; i++) {

            // �����������ǰ���£���֦  ps: ��Ϊ�����Զ���֦��
            if (residue - candidates[i] < 0) {
                break;
            }

            path.addLast(candidates[i]);
            dfs(candidates, len, residue - candidates[i], i, path, res);
            path.removeLast();

        }
    }
    

}

