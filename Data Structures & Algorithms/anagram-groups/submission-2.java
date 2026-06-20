class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> answer = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            answer.putIfAbsent(key, new ArrayList<>());
            answer.get(key).add(s);
        }
        return new ArrayList<>(answer.values());
    }
}
