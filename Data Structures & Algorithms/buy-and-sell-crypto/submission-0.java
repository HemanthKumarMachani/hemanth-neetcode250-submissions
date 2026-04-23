class Solution {
    public int maxProfit(int[] prices) {
        //make sure input is valid
        if(prices == null || prices.length == 0) return 0;
        int profit = Integer.MIN_VALUE, buyIdx = 0, sellIdx = 0;
        while(sellIdx < prices.length){
            if(prices[buyIdx] > prices[sellIdx]){
                buyIdx = sellIdx;
            }
            profit = Math.max(profit, prices[sellIdx] - prices[buyIdx]);
            sellIdx++;
        }
        return profit;
    }
}
