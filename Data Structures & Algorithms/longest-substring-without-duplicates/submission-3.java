class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        Set<Character> mySet = new HashSet<>();
        int maxLength = 0;

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (mySet.contains(s.charAt(right))) {
                mySet.remove(s.charAt(left));
                left++;
            }
            mySet.add(s.charAt(right));

            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
