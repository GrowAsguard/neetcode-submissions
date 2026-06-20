class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int prevPrev = cost[0];
        int prev = cost[1];
        int minCost = 0;
        for (int i=2; i<n; i++) {
            minCost = Math.min(prevPrev, prev) + cost[i];
            prevPrev = prev;
            prev = minCost;
        }

        return Math.min(prevPrev, prev);
    }
}
