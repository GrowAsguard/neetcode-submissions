class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> result = new ArrayList<>();
        while (i < str.length()) {
            int length = 0;
            while (i<str.length() && str.charAt(i) != '#') {
                length = length*10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            result.add(str.substring(i, i+length));
            i += length;
        }
        return result;
    }
}
