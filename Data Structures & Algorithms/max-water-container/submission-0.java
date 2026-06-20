class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int maxWater = 0;
        while (i < j) {
            int currentWater = (j-i) * Math.min(heights[i], heights[j]);
            maxWater = Math.max(maxWater,currentWater);
            if (heights[i] < heights[j]) i++;
            else if (heights[i] > heights[j]) j--;
            else i++;
        }
        return maxWater;
    }
}
