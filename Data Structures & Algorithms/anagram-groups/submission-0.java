class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }

        Map<String,List> myMap = new HashMap<>();
        int[] freq = new int[26];

        for (String s : strs) {
            Arrays.fill(freq,0);
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder("");

            for (int i=0; i<26; i++){
                sb.append("#");
                sb.append(freq[i]);
            }

            String ss = sb.toString();

            if (!myMap.containsKey(ss)){
                myMap.put(ss,new ArrayList());
            }
            myMap.get(ss).add(s);
        }

        return new ArrayList(myMap.values());
    }
}
