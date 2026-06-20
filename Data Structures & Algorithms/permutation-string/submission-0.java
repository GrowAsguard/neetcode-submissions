class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();

        if (n > s2.length()) return false;

        int[] freq = new int[26];
        for (char c : s1.toCharArray()) freq[c - 'a']++;

        int[] window = new int[26];
        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            window[s2.charAt(right)-'a']++;

            if (right - left + 1 > n) window[s2.charAt(left++) - 'a']--;

            if ((right - left + 1) == n && Arrays.equals(freq, window)) return true;
        }

        return false;
    }
}
