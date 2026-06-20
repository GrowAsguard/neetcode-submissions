class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character,Integer> myMap = new HashMap<>();
        int maxLength = 0;

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (myMap.containsKey(s.charAt(right))) {
                left = Math.max(myMap.get(s.charAt(right)) + 1, left);
            }
            myMap.put(s.charAt(right), right);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
