class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;

        int have = 0;

        int startIndex = left;
        int minLength = Integer.MAX_VALUE;

        while (right < s.length()) {
            char entry = s.charAt(right);
            window.put(entry, window.getOrDefault(entry, 0) + 1);

            if (need.containsKey(entry) && 
                window.get(entry).intValue() == need.get(entry).intValue()) {
                have++;
            }

            while (have == need.size()) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }

                char exit = s.charAt(left);
                window.put(exit, window.get(exit) - 1);
                left++;

                if (need.containsKey(exit) && window.get(exit) < need.get(exit)) {
                    have--;
                }
            }
            right++;
        }

        if (minLength == Integer.MAX_VALUE) return "";
        else return s.substring(startIndex, startIndex + minLength);
    }
}
