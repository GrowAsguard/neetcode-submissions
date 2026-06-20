class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(prices[i] - buy, max);
            buy = Math.min(buy, prices[i]);
        }
        
        return max;
    }
}
