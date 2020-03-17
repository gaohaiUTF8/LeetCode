package leetcode;


public class LeetCode121 {
	
    public int maxProfit(int[] prices) {
    	int beg=0;//买入点
        int end=0;//卖出点
        int pro=0;//利润初始化为0应付价格一直下跌
        int record=0;//记录当日卖出的最大利润
        for(end=0;end < prices.length; end++)
        {
             if(prices[beg]>prices[end])//遇到价格更低时直接重置买入价格
                beg=end;
              record = prices[end]-prices[beg];
            pro=record>pro?record:pro;//取买入价格重置后的利润与不重置买入价格利润的最大值，排除买入价下降但后续没有较高卖出价导致的利润下降。
        }
        return pro;
    }
}