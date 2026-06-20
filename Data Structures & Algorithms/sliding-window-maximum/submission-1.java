class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int[] answer = new int[nums.length - k + 1];

        TreeMap<Integer, Integer> myMap = new TreeMap<>();
        for (int i=0; i<k; i++) {
            myMap.put(nums[i], myMap.getOrDefault(nums[i], 0) + 1);    
        }

        answer[0] = myMap.lastKey();

        for (int i=k; i<nums.length; i++) {
            int out = nums[i-k];
            int in = nums[i];

            myMap.put(out, myMap.get(out) - 1);
            if (myMap.get(out) == 0) myMap.remove(out);

            myMap.put(in, myMap.getOrDefault(in, 0) + 1);

            answer[i-k+1] = myMap.lastKey();
        }

        return answer;
    }
}
