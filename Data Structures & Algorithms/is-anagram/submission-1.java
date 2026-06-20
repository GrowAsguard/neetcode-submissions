class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] frequency = new int[26];
        for (char schar : s.toCharArray()) {
            frequency[schar-'a']++;
        }
        for (char tchar : t.toCharArray()) {
            frequency[tchar-'a']--;
        }
        for (int i : frequency) {
            if (i!=0) return false;
        }
        return true;
    }
}
