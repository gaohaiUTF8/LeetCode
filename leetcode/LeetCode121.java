package leetcode;


public class LeetCode121 {
	
    public int maxProfit(int[] prices) {
    	int beg=0;//�����
        int end=0;//������
        int pro=0;//�����ʼ��Ϊ0Ӧ���۸�һֱ�µ�
        int record=0;//��¼�����������������
        for(end=0;end < prices.length; end++)
        {
             if(prices[beg]>prices[end])//�����۸����ʱֱ����������۸�
                beg=end;
              record = prices[end]-prices[beg];
            pro=record>pro?record:pro;//ȡ����۸����ú�������벻��������۸���������ֵ���ų�������½�������û�нϸ������۵��µ������½���
        }
        return pro;
    }
}