class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int postfix = 1;

        int[] array = new int[nums.length];
        Arrays.fill(array,1);

        for (int i=0; i<nums.length; i++) {
            array[i] = prefix;
            prefix *= nums[i];
        }

        for (int i=nums.length-1; i>=0; i--) {
            array[i] *= postfix;
            postfix *= nums[i];
        }

        return array;
    }
}  
