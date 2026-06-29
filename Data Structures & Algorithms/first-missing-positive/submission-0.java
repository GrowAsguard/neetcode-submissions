class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int index = i;
            int currentValue = nums[index];
            int correctIndex = currentValue - 1;
            if (
                currentValue >= 1 && currentValue < n+1
                && index != correctIndex
                && nums[index] != nums[correctIndex]
            ) swap(nums, index, correctIndex);
            else i++;
        }
        for (i=0; i<n; i++) {
            if (nums[i] != i+1) return i+1;
        }
        return n+1;
    }
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}