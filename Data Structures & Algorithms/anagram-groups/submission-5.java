class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        Map<String,List<String>> myMap = new HashMap<>();
        for (String s : strs) {
            int[] frequency = new int[26];
            for(char c : s.toCharArray()) {
                frequency[c-'a']++;
            }
            String key = Arrays.toString(frequency);
            // myMap.put(key, myMap.get(key).add(s));
            myMap.putIfAbsent(key,new ArrayList<>());
            myMap.get(key).add(s);
        }
        for (Map.Entry<String,List<String>> e : myMap.entrySet()) {
            answer.add(e.getValue());
        }
        return answer;
    }
}
