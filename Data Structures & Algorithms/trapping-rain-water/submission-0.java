class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        int[] leftMaxes = new int[n];
        leftMaxes[0] = height[0];
        for (int i=1; i<n; i++) {
            leftMaxes[i] = Math.max(leftMaxes[i-1], height[i]);
        }

        int[] rightMaxes = new int[n];
        rightMaxes[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--) {
            rightMaxes[i] = Math.max(rightMaxes[i+1], height[i]);
        }

        int totalWater = 0;
        for (int i=0; i<n; i++) {
            totalWater += Math.min(leftMaxes[i], rightMaxes[i]) - height[i];
        }

        return totalWater;
    }
}
