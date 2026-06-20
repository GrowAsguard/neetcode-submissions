class Solution {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            minPrice = Math.min(minPrice,price);
            maximumProfit = Math.max(maximumProfit,price-minPrice);
        }
        return maximumProfit;
    }
}
