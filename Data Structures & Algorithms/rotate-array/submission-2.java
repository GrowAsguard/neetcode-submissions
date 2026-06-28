class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int cycleCount = gcd(n,k);

        for (int startingIndex = 0; startingIndex < cycleCount; startingIndex++) {
            int currentIndex = startingIndex;
            int carryValue = nums[currentIndex];
            do {
                int nextIndex = (currentIndex + k) % n;
                int displacedValue = nums[nextIndex];
                nums[nextIndex] = carryValue;
                carryValue = displacedValue;
                currentIndex = nextIndex;
            } while (currentIndex != startingIndex);
        }
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}