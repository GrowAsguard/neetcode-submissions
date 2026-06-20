class Solution {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int i=0,j=1;
        while(j < prices.length){
            if (prices[i] < prices[j]){
                int profit = prices[j] - prices[i];
                maximumProfit = Math.max(profit, maximumProfit);
            }else {
                i = j;
            }
            j++;
        }
        return maximumProfit;
    }
}
