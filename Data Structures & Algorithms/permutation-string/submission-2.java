class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freqS1 = new int[26];

        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        for (char c : s1.toCharArray()) {
            freqS1[c - 'a']++;
        }

        int[] freqWindow = new int[26];

        for (int i=0; i<n; i++) {
            freqWindow[s2.charAt(i)-'a']++;
        }

        for (int i=n; i<m; i++) {
            if (Arrays.equals(freqS1, freqWindow)) return true;
            freqWindow[s2.charAt(i-n) - 'a']--;
            freqWindow[s2.charAt(i) - 'a']++;
        }

        return Arrays.equals(freqS1, freqWindow);
    }
}
