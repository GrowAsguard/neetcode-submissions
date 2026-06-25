class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int frequency = 0;

        for (int num : nums) {
            if (frequency == 0) majority = num;
            if (num != majority) frequency--;
            else frequency++;
        }
        return majority;
    }
}