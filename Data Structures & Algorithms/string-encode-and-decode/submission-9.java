class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = str.length();
        while (i < n) {
            int length = 0;
            while (str.charAt(i) != '#') {
                length = length*10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            String word = str.substring(i, i+length);
            result.add(word);
            i += length;
        }

        return result;
    }
}
