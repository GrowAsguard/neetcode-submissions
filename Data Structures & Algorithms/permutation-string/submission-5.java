class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) return false;

        int[] freqS1 = new int[26];
        for (char c : s1.toCharArray()) {
            freqS1[c - 'a']++;
        }

        int[] freqWindow = new int[26];
        for (int i=0; i<n; i++) {
            freqWindow[s2.charAt(i)-'a']++;
        }

        int matches = 0;

        for (int i=0; i<26; i++) {
            if (freqS1[i] == freqWindow[i]) matches++;
        }

        for (int i=n; i<m; i++) {
            if (matches == 26) return true;

            int left = s2.charAt(i-n) - 'a';
            if (freqS1[left] == freqWindow[left]) matches--;
            freqWindow[left]--;
            if (freqS1[left] == freqWindow[left]) matches++;
            
            
            int right = s2.charAt(i) - 'a';
            if (freqS1[right] == freqWindow[right]) matches--;
            freqWindow[right]++;
            if (freqS1[right] == freqWindow[right]) matches++;
        }
        return matches == 26;
    }
}
