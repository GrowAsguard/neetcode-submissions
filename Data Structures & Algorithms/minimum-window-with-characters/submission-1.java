class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] freq = new int[128];
        for (char c : t.toCharArray()) freq[c]++;

        int left = 0;
        int right = 0;

        int required = t.length();
        int formed = 0;

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);

            if (freq[c] > 0) formed++;
            freq[c]--;
            right++;

            while (formed == required) {
                if (right - left < minLength) {
                    minLength = right - left;
                    start = left;
                }

                char leftc = s.charAt(left);
                freq[leftc]++;
                if (freq[leftc] > 0) formed--;
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}
