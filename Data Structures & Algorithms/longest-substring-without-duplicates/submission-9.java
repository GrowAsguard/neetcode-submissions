class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int length = 0;

        int back = 0;
        for (int front=0; front<s.length(); front++) {
            char c = s.charAt(front);
            if (!seen.contains(c)) {
                seen.add(c);
            }
            else {
                while (seen.contains(c)) {
                    seen.remove(s.charAt(back));
                    back++;
                }
                seen.add(c);
            }
            length = Math.max(length, front-back+1);
        }
        return length;
    }
}
