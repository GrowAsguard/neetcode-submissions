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

        while (i < str.length()) {
            // calculate the length;
            int length = 0;
            while (str.charAt(i) != '#') {
                length = length*10 + (str.charAt(i) - '0');
                i++;
            }
            // skip the #
            i++;

            // make the string 
            String interim = str.substring(i, i+length);
            result.add(interim);
            i += length;
        }
        return result;
    }
}
