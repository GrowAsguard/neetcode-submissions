class Solution {
    public void sortColors(int[] nums) {
        int frontPlacement = 0;
        int backPlacement = nums.length - 1;
        int scanning = 0;

        while (scanning <= backPlacement) {
            if (nums[scanning] == 0) {
                int temp = nums[frontPlacement];
                nums[frontPlacement++] = 0;
                nums[scanning] = temp;
                scanning++;
            }
            else if (nums[scanning] == 2) {
                int temp = nums[backPlacement];
                nums[backPlacement--] = 2;
                nums[scanning] = temp;
            }
            else scanning++;
        }
    }
}