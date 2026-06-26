class Solution {
    public int maxProfit(int[] prices) {
        int minCost = prices[0];
        int maxProfit = 0;
        for (int i=1; i<prices.length; i++) {
            int buy = prices[i];
            if (buy < minCost) minCost = buy;
            else {
                maxProfit = Math.max(maxProfit, buy - minCost);
            }
        }

        return maxProfit;
    }
}
