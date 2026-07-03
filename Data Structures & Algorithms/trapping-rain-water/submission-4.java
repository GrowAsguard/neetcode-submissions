class Solution {
    public int trap(int[] height) {
        int totalWater = 0;

        int left = 0;
        int right = height.length - 1;

        int maxLeft = height[left];
        int maxRight = height[right];

        while (left < right) {
            if (height[left] <= height[right]) {
                maxLeft = Math.max(maxLeft, height[left]);
                totalWater += maxLeft - height[left];
                left++;
            }
            else {
                maxRight = Math.max(maxRight, height[right]);
                totalWater += maxRight - height[right];
                right--;
            }
        }

        return totalWater;
    }
}
