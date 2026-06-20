class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) freq[c-'a']++;

            String key = Arrays.toString(freq);

            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(groups.values());
    }
}
