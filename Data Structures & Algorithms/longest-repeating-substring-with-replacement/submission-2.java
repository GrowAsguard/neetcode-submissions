class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> freq = new HashMap<>();
        int answer = 0;

        int maxFreq = 0;
        
        int left = 0;
        for (int right=0; right < s.length(); right++) {
            char c = s.charAt(right);

            freq.put(c, freq.getOrDefault(c,0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(c));
            
            while ((right - left + 1) - maxFreq > k) {
                char l = s.charAt(left);
                freq.put(l, freq.get(l) - 1);
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}
