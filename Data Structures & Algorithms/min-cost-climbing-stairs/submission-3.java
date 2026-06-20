class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int prevPrev = cost[0];
        int prev = cost[1];
        int currentCost = 0;
        for (int i=2; i<n; i++) {
            currentCost = Math.min(prevPrev, prev) + cost[i];
            prevPrev = prev;
            prev = currentCost;
        }

        return Math.min(prevPrev, prev);
    }
}
