class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> mySet = new HashSet<>();
        
        int maxSize = 0;

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (mySet.contains(s.charAt(right))) mySet.remove(s.charAt(left++));
            mySet.add(s.charAt(right));

            maxSize = Math.max(maxSize, mySet.size());
        }

        return maxSize;
    }
}
