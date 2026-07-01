class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        int maxFreq = 0;
        int left = 0;
        Map<Character, Integer> myMap = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            myMap.put(c, myMap.getOrDefault(c,0) + 1);

            maxFreq = Math.max(maxFreq, myMap.get(c));

            while ((right-left+1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                myMap.put(leftChar, myMap.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }
}
