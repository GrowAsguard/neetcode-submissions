class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> myMap = new HashMap<>();
        for (String s : strs) {
            int[] frequency = new int[26];
            for(char c : s.toCharArray()) {
                frequency[c-'a']++;
            }
            String key = Arrays.toString(frequency);
            myMap.putIfAbsent(key,new ArrayList<>());
            myMap.get(key).add(s);
        }

        return new ArrayList<>(myMap.values());
    }
}
