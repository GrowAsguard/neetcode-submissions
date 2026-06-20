class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> myMap = new HashMap<>();
        myMap.put(')', '(');
        myMap.put(']', '[');
        myMap.put('}', '{');

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                char top;
                if (!stack.isEmpty()) top = stack.pop();
                else return false;
                if (top != myMap.get(c)) return false;
            }
        }

        if (stack.isEmpty()) return true;
        else return false;
    }
}
