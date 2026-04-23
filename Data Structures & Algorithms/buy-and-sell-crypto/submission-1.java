class Solution {
    public int maxProfit(int[] prices) {
        //make sure input is valid
        if(prices == null || prices.length == 0) return 0;
        int profit = 0, buyIdx = 0, sellIdx = 0;
        while(sellIdx < prices.length){
            if(prices[sellIdx] > prices[buyIdx]){
                profit = Math.max(profit, prices[sellIdx] - prices[buyIdx]);
            }else{
                buyIdx = sellIdx;
            }
            sellIdx++;
        }
        return profit;
    }
}
