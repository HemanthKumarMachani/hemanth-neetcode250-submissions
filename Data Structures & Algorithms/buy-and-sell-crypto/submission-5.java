class Solution {
    public int maxProfit(int[] prices) {
        // input validation
        if (prices == null || prices.length == 0)
            return 0;
        int buyIdx = 0, maxProfit = 0;
        for (int sellIdx = 0; sellIdx < prices.length; sellIdx++) {
            if (prices[sellIdx] > prices[buyIdx]) {
                maxProfit = Math.max(maxProfit, prices[sellIdx] - prices[buyIdx]);
            } else {
                buyIdx = sellIdx;
            }
        }
        return maxProfit;
    }
}
